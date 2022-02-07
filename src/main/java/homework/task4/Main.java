package homework.task4;

import homework.task4.task1.Apple;
import homework.task4.task1.Fruit;

public class Main {

    //Примечание - фрукты отправляются в массив, но все равно повторяются.
    //Также нужно сделать случайный подбор в свойства.
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Fruit[] fruits = new Fruit[4];
        fruits[0] = fruit.getRandomFruit(Fruit.FruitType.APPLE);
        fruits[1] = fruit.getRandomFruit(Fruit.FruitType.ORANGE);
        fruits[2] = fruit.getRandomFruit(Fruit.FruitType.PINEAPPLE);
        fruits[3] = fruit.getRandomFruit(Fruit.FruitType.FRUIT);

        for (int k = 0; k < fruits.length; k++) {
            System.out.println(fruits[k]);
        }
    }
}
