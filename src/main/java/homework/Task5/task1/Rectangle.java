package homework.Task5.task1;

import java.util.Random;

public class Rectangle extends Figure{
    private int width;
    private int height;

    public Rectangle() {
        super();
        this.width = new Random().nextInt(20);
        this.height = new Random().nextInt(20);
    }

    @Override
    public void square() {
        int s = (height * width);
        System.out.println("Rectangle - " + s);
    }
}
