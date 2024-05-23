package AnimalClasses;

import java.util.Date;

public class Hamster extends Pet {
    private String color;

    public Hamster(String name, Date birthDate, String ownerName, String favoriteTreat, String color) {
        super(name, birthDate, "Хомяк", ownerName, favoriteTreat);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String gnaw() {
        return "Хомяк грызет что-то!";
    }

    public String hideFood() {
        return "Хомяк прячет свои запасы!";
    }

    @Override
    public String voice() {
        return "Пи-пи!";
    }

    @Override
    public String eat() {
        return "Хомяк ест семечки.";
    }

    @Override
    public String move() {
        return "Хомяк бегает в колесе.";
    }

    @Override
    public String performCommand(String command) {
        return "Хомяк выполняет команду: " + command;
    }

    @Override
    public String bePetted() {
        return "Хомяк пищит!";
    }

    @Override
    public String makeSound() {
        return voice();
    }
}
