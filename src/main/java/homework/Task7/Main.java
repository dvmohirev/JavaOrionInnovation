package homework.Task7;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<WildAnimal> setWild = new HashSet<>();
        Set<PetAnimal> setPet = new HashSet<>();
        Zoo zoo = new Zoo(setWild, setPet);
        zoo.printAllAnimals();
    }
}
