package homework.Task7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Zoo {
    Set<WildAnimal> wildAnimalSet = new HashSet<>();
    Set<PetAnimal> petAnimalSet = new HashSet<>();


    public Zoo(Set<WildAnimal> wildAnimalSet, Set<PetAnimal> petAnimalSet) {
        this.wildAnimalSet = fillCollectionWithWildAnimals(wildAnimalSet);
        this.petAnimalSet = fillCollectionWithPetAnimals(petAnimalSet);
    }

    public Set<PetAnimal> fillCollectionWithPetAnimals(Set<PetAnimal> setTemp){
        int randomNumOfAnimal = new Random().nextInt((5 - 1) + 1) + 1;
        for (int i = 0; i < randomNumOfAnimal; i++) {
            int randomAnimal = new Random().nextInt(2);
            if (randomAnimal == 1){
                setTemp.add(new Cat());
            } else {
                setTemp.add(new Dog());
            }
        }
        return setTemp;
    }

    public Set<WildAnimal> fillCollectionWithWildAnimals(Set<WildAnimal> setTemp){
        int randomNumOfAnimal = new Random().nextInt((10 - 3) + 1) + 3;
        for (int i = 0; i < randomNumOfAnimal; i++) {
            int randomAnimal = new Random().nextInt(2);
            if (randomAnimal == 1){
                setTemp.add(new Fox());
            } else {
                setTemp.add(new Wolf());
            }
        }
        return setTemp;
    }

    private void printAnimalsFromCollection(Set someAnimals){
        Iterator iterator = someAnimals.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    public void printAllAnimals(){
        printAnimalsFromCollection(petAnimalSet);
        printAnimalsFromCollection(wildAnimalSet);
    }
}
