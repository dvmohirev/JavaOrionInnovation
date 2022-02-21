package homework.Task4.task2;

import homework.Task4.task1.Apple;
import homework.Task4.task1.Fruit;

public class GreenApplesFactory extends AbstractFabric{
    @Override
    public Fruit makeFruit() {
        Apple apple = new Apple();
        apple.setColour("зеленое");
        return apple;
    }
}
