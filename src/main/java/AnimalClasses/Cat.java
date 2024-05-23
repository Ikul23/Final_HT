package AnimalClasses;

import java.util.Date;

public class Cat extends Pet {
    private String furLength;

    public Cat(String name, Date birthDate, String ownerName, String favoriteTreat, String furLength) {
        super(name, birthDate, "Кошка", ownerName, favoriteTreat);
        this.furLength = furLength;
    }

    public String getFurLength() {
        return furLength;
    }

    public void setFurLength(String furLength) {
        this.furLength = furLength;
    }

    public String purr() {
        return "Мурр...";
    }

    public String scratch() {
        return "Кошка царапается!";
    }

    @Override
    public String voice() {
        return purr();
    }

    @Override
    public String eat() {
        return "Кошка ест корм.";
    }

    @Override
    public String move() {
        return "Кошка грациозно идет.";
    }

    @Override
    public String performCommand(String command) {
        return "Кошка выполняет команду: " + command;
    }

    @Override
    public String bePetted() {
        return "Кошка мурлычет!";
    }

    @Override
    public String makeSound() {
        return purr();
    }
}
