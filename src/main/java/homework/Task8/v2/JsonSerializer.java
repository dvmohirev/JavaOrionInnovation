package homework.Task8.v2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class JsonSerializer {
    private static final char RIGHT_BRACKET = '{';
    private static final char NEW_STRING = '\n';
    private static final String SPACE = "  ";
    private static final char QUOTATION = '\"';
    private static final String COLON = " : ";
    private static final String STRING = "String";
    private static final String DOUBLE = "double";
    private static final char COMMA = ',';
    private static final int DELETED_CHARS_COUNT = 2;
    private static final char LEFT_BRACKET = '}';

    private List<Annotation> annotationList;
    private List<Field> jsonNameFieldList;

    public JsonSerializer() {
        annotationList = new ArrayList<>();
        jsonNameFieldList = new ArrayList<>();
    }

    public String serializeToJson(Object obj) {
        Class clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for(Field field : fields) {
            Annotation[] annotations = field.getAnnotations();

            for(Annotation annotation : annotations) {
                if (annotation instanceof JsonName) {
                    jsonNameFieldList.add(field);
                    annotationList.add(annotation);
                }
            }
        }

        String jsonObject = makeJsonObject(obj);

        annotationList.clear();
        jsonNameFieldList.clear();

        return jsonObject;
    }

    private String makeJsonObject(Object obj) {
        StringBuilder builder = new StringBuilder();
        builder.append(RIGHT_BRACKET).append(NEW_STRING);

        for(int i = 0; i < jsonNameFieldList.size(); i++) {
            builder.append(SPACE).append(QUOTATION);
            builder.append(getAnnotationValue(annotationList.get(i)));
            builder.append(QUOTATION).append(COLON);
            String fieldType = jsonNameFieldList.get(i).getType().getSimpleName();
            Field field = jsonNameFieldList.get(i);
            if(fieldType.equals(STRING)) {
                builder.append(QUOTATION).append(getFieldValue(obj, field)).append(QUOTATION);
            }
            if(fieldType.equals(DOUBLE)) {
                builder.append(getFieldValue(obj, field));
            }
            builder.append(COMMA).append(NEW_STRING);
        }
        builder.deleteCharAt(builder.length() - DELETED_CHARS_COUNT);
        builder.append(LEFT_BRACKET);

        return builder.toString();
    }

    private String getAnnotationValue(Annotation annotation) {
        JsonName jsonNameAnnotation = (JsonName) annotation;
        return jsonNameAnnotation.value();
    }

    private String getFieldValue(Object obj, Field field) {
        field.setAccessible(true);
        String fieldType = field.getType().getSimpleName();
        String fieldValue = null;
        try {
            if (fieldType.equals(STRING)) {
                fieldValue = field.get(obj).toString();
            }
            if (fieldType.equals(DOUBLE)) {
                fieldValue = String.valueOf(field.getDouble(obj));
            }
        }
        catch(IllegalAccessException ex) {
            System.out.println(field + " field does not have public access in " + obj.getClass().getSimpleName() + " class.");
        }
        return fieldValue;
    }
}