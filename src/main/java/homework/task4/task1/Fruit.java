package homework.task4.task1;

import java.util.ArrayList;
import java.util.spi.AbstractResourceBundleProvider;

public class Fruit {

    public enum FruitType {
        APPLE,
        ORANGE,
        PINEAPPLE,
        FRUIT
    }

    private int weight = 50 + (int)(Math.random()*((100 - 50) + 1));

    public int getWeight() {
        return weight;
    }

    public Fruit getRandomFruit(FruitType type) {
        Fruit fruit = null;

            switch (type){
                case APPLE:
                    Apple apple = new Apple();
                    apple.setColour("красный");
                    fruit = apple;
                    break;
                case ORANGE:
                    Orange orange = new Orange();
                    orange.setSkinThickness(5);
                    fruit = orange;
                    break;
                case PINEAPPLE:
                    Pineapple pineapple = new Pineapple();
                    pineapple.setHeightTail(10);
                    fruit = pineapple;
                    break;
                case FRUIT:
                    fruit = new Fruit();
                    break;
            }
        return fruit;
    }

    @Override
    public String toString() {
        return "Тип фрукта: " + "Fruit"+ '\n'
                + "Вес фрукта: " +  getWeight() + '\n';
    }
}
