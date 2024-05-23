package AnimalClasses;

import java.util.Date;

public class Donkey extends PackAnimal {
    private int earLength;

    public Donkey(String name, Date birthDate, int carryingCapacity, int herdSize, int earLength) {
        super(name, birthDate, carryingCapacity, herdSize, "Donkey");
        this.earLength = earLength;
    }

    public int getEarLength() {
        return earLength;
    }

    public void setEarLength(int earLength) {
        this.earLength = earLength;
    }

    @Override
    public String move() {
        return "Идет медленным шагом";
    }

    @Override
    public String makeSound() {
        return "Издает ишачий крик";
    }

    @Override
    public String eat() {
        return "Ест траву и сено";
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
        return "Двигается вместе со стадом";
    }
}
