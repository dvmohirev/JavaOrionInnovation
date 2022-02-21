package homework.Task8.v2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;

public class JsonDeserializer {
    private static final int BEGIN_CHARS_COUNT = 4;
    private static final String NEW_STRING = ",\n  ";
    private static final String COLON = " : ";
    private static final String AGE_FIELD = "\"age\"";
    private static final String COURSE_FIELD = "\"course\"";
    private static final String DOUBLE = "double";
    private static final String STRING = "String";

    private List<String> fieldNames;
    private List<String> fieldValues;


    public JsonDeserializer() {
        fieldNames = new ArrayList<>();
        fieldValues = new ArrayList<>();
    }

    public Object deserializeFromJson(String jsonObject, Class clazz) {
        parseJsonObject(jsonObject);
        Object obj = createObject(clazz);
        setFieldsValues(obj);

        fieldNames.clear();
        fieldValues.clear();

        return obj;
    }

    private void parseJsonObject(String jsonObject) {
        String jsonObjWithoutBrackets = jsonObject.substring(BEGIN_CHARS_COUNT, jsonObject.length() - 1);
        String[] fieldsWithValues = jsonObjWithoutBrackets.split(NEW_STRING);

        for(int i = 0; i < fieldsWithValues.length; i++) {
            String[] fieldWithValue = fieldsWithValues[i].split(COLON);
            String fieldName = fieldWithValue[0];
            String fieldValue = fieldWithValue[1];
            fieldNames.add(parseStr(fieldName));

            if (fieldName.equals(AGE_FIELD) || fieldName.equals(COURSE_FIELD)) {
                fieldValues.add(fieldValue);
            }
            else {
                fieldValues.add(parseStr(fieldValue));
            }
        }
    }

    private String parseStr(String str) {
        return str.substring(1, str.length() - 1);
    }

    private Object createObject(Class clazz) {
        Object obj = null;
        try {
            obj = clazz.newInstance();
        }
        catch (ReflectiveOperationException ex) {
            System.out.println("A new object of the class has not been created.");
        }
        return obj;
    }

    private void setFieldsValues(Object obj) {
        Class clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        try {
            setNotNullValues(obj, fields);
            setNullValues(obj, fields);
        } catch (IllegalAccessException ex) {
            System.out.println("A field value has not been changed.");
            System.out.println("The field's access modifier is not \"public\"");
        }
    }

    private void setNotNullValues(Object obj, Field[] fields) throws IllegalAccessException {
        for(int i = 0; i < fields.length; i++) {
            Annotation[] annotations = fields[i].getAnnotations();

            for(Annotation annotation : annotations) {
                if (annotation instanceof JsonName) {
                    JsonName jsonNameAnnotation = (JsonName) annotation;
                    String annotationValue = jsonNameAnnotation.value();
                    fields[i].setAccessible(true);
                    String fieldType = fields[i].getType().getSimpleName();

                    if(annotationValue.equals(fieldNames.get(i)) & fieldType.equals(DOUBLE)) {
                        fields[i].set(obj, Double.parseDouble(fieldValues.get(i)));

                    }
                    if(annotationValue.equals(fieldNames.get(i)) & fieldType.equals(STRING)) {
                        fields[i].set(obj, fieldValues.get(i));

                    }
                }
            }
        }
    }

    private void setNullValues(Object obj, Field[] fields) throws IllegalAccessException {
        for(int i = 0; i < fields.length; i++) {
            Annotation[] annotations = fields[i].getAnnotations();

            for (Annotation annotation : annotations) {
                if (annotation instanceof JsonIgnore) {
                    fields[i].setAccessible(true);
                    fields[i].set(obj, null);
                }
            }
        }
    }
}
