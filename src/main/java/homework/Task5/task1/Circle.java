package homework.Task5.task1;

import java.util.Random;

public class Circle extends Figure{
    private int radius;

    public Circle() {
        super();
        this.radius = new Random().nextInt(10);
    }

    @Override
    public void square() {
        float s = (float) (Math.PI * radius * radius);
        System.out.println("Circle - " + s);
    }
}
