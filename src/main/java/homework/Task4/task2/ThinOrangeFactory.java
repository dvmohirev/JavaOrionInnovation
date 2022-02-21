package homework.Task4.task2;

import homework.Task4.task1.Fruit;
import homework.Task4.task1.Orange;

public class ThinOrangeFactory extends AbstractFabric{
    @Override
    public Fruit makeFruit() {
        Orange orange = new Orange();
        orange.setSkinThickness(1 + (int)(Math.random()*((5 - 1) + 1)));
        return orange;
    }
}
