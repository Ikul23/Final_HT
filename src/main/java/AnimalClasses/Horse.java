package AnimalClasses;

import java.util.Date;

public class Horse extends PackAnimal {
    private String color;

    public Horse(String name, Date birthDate, int carryingCapacity, int herdSize, String color) {
        super(name, birthDate, carryingCapacity, herdSize, "Horse");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String move() {
        return "Бежит галопом";
    }

    @Override
    public String makeSound() {
        return "Ржёт";
    }

    @Override
    public String eat() {
        return "Ест сено";
    }

    @Override
    public String carryLoad(int weight) {
        if (weight <= getCarryingCapacity()) {
            return "Переносит груз весом " + weight + " кг.";
        } else {
            return "Не может перенести груз весом " + weight + " кг.";
        }
    }

    @Override
    public String moveInHerd() {
        return "Двигается вместе с табуном";
    }
}
