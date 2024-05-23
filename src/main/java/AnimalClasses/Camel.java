package AnimalClasses;

import java.util.Date;

public class Camel extends PackAnimal {
    private int numberOfHumps;

    public Camel(String name, Date birthDate, String species, int carryingCapacity, int herdSize, int numberOfHumps) {
        super(name, birthDate, species, carryingCapacity, herdSize);
        this.numberOfHumps = numberOfHumps;
    }

    public int getNumberOfHumps() {
        return numberOfHumps;
    }

    public void setNumberOfHumps(int numberOfHumps) {
        this.numberOfHumps = numberOfHumps;
    }

    public String carryLoad() {
        return "Верблюд несет груз.";
    }

    public String spit() {
        return "Верблюд плюется.";
    }

    @Override
    public String voice() {
        return "Верблюд рычит.";
    }

    @Override
    public String eat() {
        return "Верблюд ест колючки.";
    }

    @Override
    public String move() {
        return "Верблюд идет медленно.";
    }

    @Override
    public String moveInHerd() {
        return "Верблюд идет в стаде.";
    }
}
