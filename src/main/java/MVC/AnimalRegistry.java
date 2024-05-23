package MVC;
import AnimalClasses.Animal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnimalRegistry {
    private List<Animal> animals;

    public AnimalRegistry() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Animal> getAnimalsByBirthDate() {
        animals.sort((a1, a2) -> a1.getBirthDate().compareTo(a2.getBirthDate()));
        return animals;
    }

    public int getAnimalCount() {
        return animals.size();
    }
}
