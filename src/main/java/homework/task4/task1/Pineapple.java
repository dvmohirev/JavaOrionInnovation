package homework.task4.task1;

public class Pineapple extends Fruit{
    private int heightTail; // от 5 до 20

    public void setHeightTail(int heightTail) {
        this.heightTail = heightTail;
    }

    @Override
    public String toString() {
        //weight = 200;
        return "Тип фрукта: " + "Pineapple"+ '\n'
                + "Высота хвоста: " +  heightTail + '\n'
                + "Вес фрукта: " +  getWeight()+ '\n';
    }
}
