package homework.Task4.task2;

import homework.Task4.task1.Fruit;
import homework.Task4.task1.Pineapple;

public class LongPinepplesFactory extends AbstractFabric{
    @Override
    public Fruit makeFruit() {
        Pineapple pineapple = new Pineapple();
        pineapple.setHeightTail(11 + (int)(Math.random()*((50 - 11) + 1)));
        return pineapple;
    }
}
