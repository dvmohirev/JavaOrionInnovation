package homework.Task7;

public class Wolf extends WildAnimal {
    public Wolf() {
        name = "Волк";
    }

    @Override
    public String toString() {
        return "Wolf name: " + name;
    }

    @Override
    public FoodForAnimal getFavoriteMeal() {
        return FoodForAnimal.MEAT;
    }
}
