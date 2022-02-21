package homework.Task4.task1;

public class Orange extends Fruit{
    private int skinThickness; // от 0 до 20

    public void setSkinThickness(int skinThickness) {
        this.skinThickness = skinThickness;
    }

    @Override
    public String toString() {
        return "Тип фрукта: " + "Orange"+ '\n'
                + "Толщина кожуры: " +  skinThickness + '\n'
                + "Вес фрукта: " +  getWeight()+ '\n';
    }
}
