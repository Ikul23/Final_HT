package AnimalClasses;

import java.util.Date;

public class Donkey extends PackAnimal {
    private int earLength;

    public Donkey(String name, Date birthDate, String species, int carryingCapacity, int herdSize, int earLength) {
        super(name, birthDate, species, carryingCapacity, herdSize);
        this.earLength = earLength;
    }

    public int getEarLength() {
        return earLength;
    }

    public void setEarLength(int earLength) {
        this.earLength = earLength;
    }

    public String bray() {
        return "Осел издает ишачий крик!";
    }

    @Override
    public String voice() {
        return bray();
    }

    @Override
    public String eat() {
        return "Осел ест траву.";
    }

    @Override
    public String move() {
        return "Осел идет.";
    }

    @Override
    public String carryLoad(int weight) {
        return weight <= getCarryingCapacity() ? "Осел несет груз." : "Груз слишком тяжел для осла.";
    }

    @Override
    public String moveInHerd() {
        return "Осел идет в стаде.";
    }
}
