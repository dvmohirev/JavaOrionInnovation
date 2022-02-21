package homework.Task4.task1;

public class Apple extends Fruit{
    private String colour; // красное, зеленое, желтое

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Тип фрукта: " + "Apple"+ '\n'
                + "Цвет фрукта: " +  colour + '\n'
                + "Вес фрукта: " +  getWeight()+ '\n';
    }
}
