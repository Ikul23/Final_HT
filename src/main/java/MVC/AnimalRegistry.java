package MVC;

import AnimalClasses.*;


import java.util.*;

public class AnimalRegistry {
    private List<Animal> animals = new ArrayList<>();
    private int animalCount = 0;

    public void addAnimal(Animal animal) {
        animals.add(animal);
        animalCount++;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public Animal getAnimalByName(String name) throws Exception {
        return animals.stream()
                .filter(animal -> animal.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new Exception("Animal not found"));
    }

    public List<Animal> getAnimalsSortedByBirthDate() {
        animals.sort(Comparator.comparing(Animal::getBirthDate));
        return animals;
    }

    public int getAnimalCount() {
        return animalCount;
    }
}
