package homework.Task7;

public class Fox extends WildAnimal{
    public Fox() {
        name = "Лиса";
    }

    @Override
    public String toString() {
        return "Fox name: " + name;
    }

    @Override
    public FoodForAnimal getFavoriteMeal() {
        return FoodForAnimal.MEAT;
    }
}
