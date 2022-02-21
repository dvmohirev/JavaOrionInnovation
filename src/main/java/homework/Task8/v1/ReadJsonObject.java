package homework.Task8.v1;

import homework.Task8.v1.JsonName;

import java.lang.reflect.*;
import java.util.HashMap;

/**
 * Создайте класс, который может читать любой объект в упрощенном формате JSON.
 * например ,deserialize(<пример выше>, Person.class) вернет экземпляр Person{name="Vasya",age=12,password=null}
 */
public class ReadJsonObject
{
    static public Object fromJson(String objectData, Class className) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Object result;
        Constructor ctor;
        try {
            ctor = className.getConstructor( null);
            result = ctor.newInstance();
        } catch (NoSuchMethodException e) {
            Constructor[] ctors = className.getConstructors();
            ctor = ctors[0];
            Type[] typeArray = ctor.getParameterTypes();
            Object[] parameterArray = new Object[typeArray.length];
            for (int i = 0; i < typeArray.length; ++i) {
                if (typeArray[i].equals(double.class))
                {
                    parameterArray[i] = 0.0;
                }
            }
            result = ctor.newInstance(parameterArray);
        }

        String[] dataPairs = objectData.replaceAll("[ {}\t\n\"]", "").split(";");
        HashMap jsonData = new HashMap<String,String>();

        for (String dataPair : dataPairs) {
            String[] pair = dataPair.split(":");
            jsonData.put(pair[0], pair[1]);
        }

        for (Field f: className.getDeclaredFields())
        {
            JsonName a = f.getAnnotation(JsonName.class);
            if (f.getType().equals(double.class))
            {
                if (a != null)
                {
                    f.set(result, Double.parseDouble((String) jsonData.get(a.value())));
                }
                else
                {
                    f.set(result, 0.0);
                }
            }
            else if (f.getType().equals(String.class))
            {
                if (a != null)
                {
                    f.set(result, jsonData.get(a.value()));
                }
                else
                {
                    f.set(result, null);
                }
            }
            else
            {
                throw new RuntimeException("unexpected parameter type");
            }
        }

        return result;
    }
}
