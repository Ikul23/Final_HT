package AnimalClasses;

import java.util.Date;

public abstract class PackAnimal extends Animal {
    private int carryingCapacity;
    private int herdSize;

    public PackAnimal(String name, Date birthDate, String species, int carryingCapacity, int herdSize) {
        super(name, birthDate, species);
        this.carryingCapacity = carryingCapacity;
        this.herdSize = herdSize;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getHerdSize() {
        return herdSize;
    }

    public void setHerdSize(int herdSize) {
        this.herdSize = herdSize;
    }

    public abstract String moveInHerd();
}
