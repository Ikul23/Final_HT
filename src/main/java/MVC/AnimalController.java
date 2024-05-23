package MVC;
import AnimalClasses.*;
import Exeptions.AnimalNotFoundException;
import Exeptions.InvalidAnimalTypeException;

import java.util.List;
import java.util.Date;

public class AnimalController {
    private AnimalRegistry model;
    private AnimalView view;

    public AnimalController(AnimalRegistry model, AnimalView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        boolean exit = false;

        while (!exit) {
            try {
                int choice = view.showMenuAndGetChoice();
                switch (choice) {
                    case 1:
                        addAnimal();
                        break;
                    case 2:
                        view.showAnimals(model.getAnimals());
                        break;
                    case 3:
                        showCommands();
                        break;
                    case 4:
                        trainNewCommand();
                        break;
                    case 5:
                        view.showAnimals(model.getAnimalsByBirthDate());
                        break;
                    case 6:
                        System.out.println("Общее количество животных: " + model.getAnimalCount());
                        break;
                    case 7:
                        exit = true;
                        break;
                    default:
                        System.out.println("Некорректный выбор.");
                }
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    private void addAnimal() throws InvalidAnimalTypeException {
        String name = view.getAnimalName();
        Date birthDate = view.getAnimalBirthDate();
        int animalType = view.getAnimalType();
        Animal animal = null;

        switch (animalType) {
            case 1:
                animal = new Dog(name, birthDate, view.getOwnerName(), view.getFavoriteTreat(), view.getBreed());
                break;
            case 2:
                animal = new Cat(name, birthDate, view.getOwnerName(), view.getFavoriteTreat(), view.getFurLength());
                break;
            case 3:
                animal = new Hamster(name, birthDate, view.getOwnerName(), view.getFavoriteTreat(), view.getColor());
                break;
            case 4:
                animal = new Horse(name, birthDate, view.getCarryingCapacity(), view.getHerdSize(), view.getColor());
                break;
            case 5:
                animal = new Camel(name, birthDate, view.getCarryingCapacity(), view.getHerdSize(), view.getHumpCount());
                break;
            case 6:
                animal = new Donkey(name, birthDate, view.getCarryingCapacity(), view.getHerdSize(), view.getEarLength());
                break;
            default:
                throw new InvalidAnimalTypeException("Некорректный выбор типа животного.");
        }

        if (animal != null) {
            model.addAnimal(animal);
            System.out.println("Животное добавлено.");
        }
    }

    private void showCommands() throws AnimalNotFoundException {
        int animalId = view.getAnimalId();
        List<Animal> animals = model.getAnimals();

        if (animalId >= 0 && animalId < animals.size()) {
            Animal animal = animals.get(animalId);

            if (animal instanceof Pet) {
                Pet pet = (Pet) animal;
                view.showCommands(pet.getCommands());
            } else {
                System.out.println("Выбранное животное не является домашним.");
            }
        } else {
            throw new AnimalNotFoundException("Животное с указанным ID не найдено.");
        }
    }

    private void trainNewCommand() throws AnimalNotFoundException {
        int animalId = view.getAnimalId();
        List<Animal> animals = model.getAnimals();

        if (animalId >= 0 && animalId < animals.size()) {
            Animal animal = animals.get(animalId);

            if (animal instanceof Pet) {
                Pet pet = (Pet) animal;
                String newCommand = view.getCommand();
                pet.learnCommand(newCommand);
                System.out.println("Животное обучено новой команде.");
            } else {
                System.out.println("Выбранное животное не является домашним.");
            }
        } else {
            throw new AnimalNotFoundException("Животное с указанным ID не найдено.");
        }
    }
}
