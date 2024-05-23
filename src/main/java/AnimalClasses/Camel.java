package AnimalClasses;

import java.util.Date;

public class Camel extends PackAnimal {
    private int humpCount;

    public Camel(String name, Date birthDate, int carryingCapacity, int herdSize, int humpCount) {
        super(name, birthDate, carryingCapacity, herdSize, "Camel");
        this.humpCount = humpCount;
    }

    public int getHumpCount() {
        return humpCount;
    }

    public void setHumpCount(int humpCount) {
        this.humpCount = humpCount;
    }

    @Override
    public String move() {
        return "Идет по пустыне";
    }

    @Override
    public String makeSound() {
        return "Издает характерный верблюжий звук";
    }

    @Override
    public String eat() {
        return "Ест траву и колючки";
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

    public String spit() {
        return "Плюется";
    }
}
