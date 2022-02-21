package homework.Task5.task1;

import java.util.Random;

public abstract class Figure {
    private int x;
    private int y;

    enum Quadrant {
        I,
        II,
        III,
        IV
    }

    public Figure() {
        this.x = new Random().nextInt();
        this.y = new Random().nextInt();
    }

    public abstract void square();

    public Quadrant getQuadrant() {
        Quadrant q = null;
        if (this.x > 0 && this.y > 0) {
            q = Quadrant.I;
        } else if (this.x > 0 && this.y < 0) {
            q = Quadrant.II;
        } else if (this.x < 0 && this.y < 0) {
            q = Quadrant.III;
        } else if (this.x < 0 && this.y > 0) {
            q = Quadrant.IV;
        } else {
            System.out.println("Центр фигуры лежит на оси координат");
        }
        return q;
    }
}