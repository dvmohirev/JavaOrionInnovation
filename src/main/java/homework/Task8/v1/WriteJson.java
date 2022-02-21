package homework.Task8.v1;

import homework.Task8.v1.JsonName;

import java.lang.reflect.Field;

/**
 * класс может записывать любой объект в упрощенном формате JSON:
 * - Объект начинается с { и заканчивается }
 * - Свойство это пара "ключ:значение"
 * - Все свойства отделены друг от друга точкой с запятой
 * - Все названия свойств в двойных кавычках
 * - Значениями свойств могут быть только строки ( в двойных кавычках) или числа (с плавающей точкой, без кавычек)
 * будет выглядеть так
 * {
 * "name":"Vasya",
 * "age":12
 * }
 */
public class WriteJson
{
    public static String toJson(Object o)
    {
        String result = "";
        boolean found = false;
        boolean first = true;

        for (Field f: o.getClass().getDeclaredFields())
        {
            JsonName a = f.getAnnotation(JsonName.class);
            if (a != null)
            {
                if( first )
                {
                    result = "{\n";
                    first = false;
                    found = true;
                }
                else
                {
                    result += ";\n";
                }
                if (f.getType().equals(double.class))
                {
                    result += "\t\"";
                    result += a.value();
                    result += "\":";
                    try
                    {
                        result += String.format("%.1f", f.get(o));
                    } catch (IllegalAccessException e)
                    {
                        e.printStackTrace();
                    }
                }
                if (f.getType().equals(java.lang.String.class))
                {
                    result += "\t\"";
                    result += a.value();
                    result += "\":\"";
                    try
                    {
                        result += f.get(o);
                    } catch (IllegalAccessException e)
                    {
                        e.printStackTrace();
                    }
                    result += "\"";
                }
            }
        }
        if (found)
        {
            result += "\n}";
        }
        return result;
    }
}