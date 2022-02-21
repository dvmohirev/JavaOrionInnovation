package homework.Task8.v1;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static homework.Task8.v1.ReadJsonObject.fromJson;
import static homework.Task8.v1.WriteJson.toJson;

/**
 * Задание 8.Аннотации и рефлексия
 * Аннотированная де\сериализация.
 * Создайте класс, который может записывать любой объект в упрощенном формате JSON:
 * - Объект начинается с { и заканчивается }
 * - Свойство это пара "ключ:значение"
 * - Все свойства отделены друг от друга точкой с запятой
 * - Все названия свойств в двойных кавычках
 * - Значениями свойств могут быть только строки ( в двойных кавычках) или числа (с плавающей точкой, без кавычек)
 *
 * - Создайте аннотацию @JsonName, чтобы определять имя свойства в JSON формате
 * - Создайте аннотацию @JsonIgnore, чтобы исключить поля из сериализации
 * Например, класс Person {
 * @JsonName("name")
 * String firstName="Vasya";
 *
 * @JsonName("years")
 * double age=12
 * @JsonIgnore
 * String password;
 * }
 * будет выглядеть так
 * {
 * "name":"Vasya",
 * "age":12
 * }
 * Создайте класс, который может читать любой объект в упрощенном формате JSON.
 * например ,deserialize(<пример выше>, Person.class) вернет экземпляр Person{name="Vasya",age=12,password=null}
 */
public class Main {
    public static void main(String ... args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        List<Person> personal = new ArrayList<>();
        personal.add(new Person(Person.generateName(), Person.generateAge(), Person.generatePassword()));
        personal.add(new Person(Person.generateName(), Person.generateAge(), Person.generatePassword()));
        personal.add(new Person(Person.generateName(), Person.generateAge(), Person.generatePassword()));

        for (Person person : personal)
        {
            System.out.println(toJson(person));
        }

        toJson(new NotPerson());

        Person p = (Person) fromJson(toJson( new Person(Person.generateName(), Person.generateAge(), Person.generatePassword())), Person.class);
        NotPerson p2 = (NotPerson) fromJson(toJson( new Person(Person.generateName(), Person.generateAge(), Person.generatePassword())), NotPerson.class);
        System.out.println(p.toString());
    }
}
