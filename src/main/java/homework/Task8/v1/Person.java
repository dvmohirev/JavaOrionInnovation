package homework.Task8.v1;

import homework.Task8.v1.JsonIgnore;
import homework.Task8.v1.JsonName;

import java.util.Random;

/**
 * Например, класс Person {
 * @JsonName("name")
 * String firstName="Vasya";
 *
 * @JsonName("years")
 * double age=12
 * @JsonIgnore
 * String password;
 * }
 */
public class Person {
    @JsonName("name")
    String name;
    @JsonName("age")
    double age;
    @JsonIgnore
    String password;

    public static String generateName()
    {
        String[] firstNamesArray = {"Mary","Klark","Kent","Pol","Anna","Вася","Маша"};
        return firstNamesArray[new Random().nextInt(firstNamesArray.length)];
    }
    public static double generateAge()
    {
        return new Random().nextInt(70)+10 + new Random().nextDouble();
    }
    public static String generatePassword()
    {
        String[] pwdArray = {"Einstein","Asimov","Vern","Bush","Smith","Poulson"};
        return pwdArray[new Random().nextInt(pwdArray.length)];
    }

    public Person(String name, double age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}