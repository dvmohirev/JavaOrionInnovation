package homework.Task7;

public class Dog extends PetAnimal{
    public Dog() {
        name = "Песик";
    }

    @Override
    public String toString() {
        return "Dog name: " + name;
    }

    @Override
    public FoodForAnimal getFavoriteMeal() {
        return FoodForAnimal.BONE;
    }
}
