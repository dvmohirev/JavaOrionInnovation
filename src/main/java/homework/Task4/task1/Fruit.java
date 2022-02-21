package homework.Task4.task1;

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
                    int x = 1 + (int)(Math.random()*((3 - 1) + 1));
                    switch (x){
                        case 1:
                            apple.setColour("красное");
                            break;
                        case 2:
                            apple.setColour("зеленое");
                            break;
                        case 3:
                            apple.setColour("желтое");
                            break;
                    }
                    fruit = apple;
                    break;
                case ORANGE:
                    Orange orange = new Orange();
                    orange.setSkinThickness((int)(Math.random()*(21)));
                    fruit = orange;
                    break;
                case PINEAPPLE:
                    Pineapple pineapple = new Pineapple();
                    pineapple.setHeightTail(5 + (int)(Math.random()*((20 - 5) + 1)));
                    fruit = pineapple;
                    break;
                case FRUIT:
                    fruit = new Fruit();
                    weight = 50 + (int)(Math.random()*((100 - 50) + 1));
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
