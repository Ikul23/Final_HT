package AnimalClasses;

import java.util.Date;

public abstract class Animal {
    private String name;
    private Date birthDate;
    private String species;

    public Animal(String name, Date birthDate, String species) {
        this.name = name;
        this.birthDate = birthDate;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getSpecies() {
        return species;
    }

    public abstract String voice();
    public abstract String eat();
    public abstract String move();
}
