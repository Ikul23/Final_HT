package AnimalClasses;

import java.util.Date;

public class Dog extends Pet {
    private String breed;

    public Dog(String name, Date birthDate, String ownerName, String favoriteTreat, String breed) {
        super(name, birthDate, "Собака", ownerName, favoriteTreat);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String bark() {
        return "Гав! Гав!";
    }

    public String fetch() {
        return "Собака приносит предмет!";
    }

    @Override
    public String voice() {
        return bark();
    }

    @Override
    public String eat() {
        return "Собака ест корм.";
    }

    @Override
    public String move() {
        return "Собака бегает.";
    }

    @Override
    public String performCommand(String command) {
        return "Собака выполняет команду: " + command;
    }

    @Override
    public String bePetted() {
        return "Собака виляет хвостом!";
    }

    @Override
    public String makeSound() {
        return bark();
    }
}
