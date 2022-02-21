package homework.Task7;

public class Cat extends PetAnimal {
    public Cat() {
        name = "Котик";
    }

    @Override
    public String toString() {
        return "Cat name: " + name;
    }

    @Override
    public FoodForAnimal getFavoriteMeal() {
        return FoodForAnimal.PACK_OF_CATFOOD;

    }
}
