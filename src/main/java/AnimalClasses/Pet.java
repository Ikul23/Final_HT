package AnimalClasses;

import java.util.Date;

public abstract class Pet extends Animal {
    private String ownerName;
    private String favoriteTreat;

    public Pet(String name, Date birthDate, String species, String ownerName, String favoriteTreat) {
        super(name, birthDate, species);
        this.ownerName = ownerName;
        this.favoriteTreat = favoriteTreat;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getFavoriteTreat() {
        return favoriteTreat;
    }

    public abstract String performCommand(String command);
    public abstract String bePetted();
}
