package homework.Task5;

import homework.Task5.task1.Circle;
import homework.Task5.task1.Figure;
import homework.Task5.task1.Rectangle;
import homework.Task5.task2.Person;

public class Main {

    public static void main(String[] args) {
        //Задание 1 - Абстрактный супрематизм
        Figure[] array = new Figure[5];

        array[0] = new Circle();
        array[1] = new Rectangle();
        array[2] = new Circle();
        array[3] = new Rectangle();
        array[4] = new Circle();

        for (Figure elem : array) {
            elem.square();
        }
        //Задание 2 - Сезонные радости
        Person[] persons = new Person[10];
        for (Person p : persons) {
            p = new Person();
            System.out.println(p.toString());
        }
    }
}
