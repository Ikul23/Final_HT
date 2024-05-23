package AnimalClasses;

import java.util.Date;

public class Horse extends PackAnimal {
    private String color;

    public Horse(String name, Date birthDate, String species, int carryingCapacity, int herdSize, String color) {
        super(name, birthDate, species, carryingCapacity, herdSize);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String gallop() {
        return "Лошадь скачет!";
    }

    public String neigh() {
        return "Лошадь ржет!";
    }

    @Override
    public String voice() {
        return neigh();
    }

    @Override
    public String eat() {
        return "Лошадь ест сено.";
    }

    @Override
    public String move() {
        return "Лошадь бегает.";
    }

    @Override
    public String carryLoad(int weight) {
        return weight <= getCarryingCapacity() ? "Лошадь несет груз." : "Груз слишком тяжел для лошади.";
    }

    @Override
    public String moveInHerd() {
        return "Лошадь идет в стаде.";
    }
}
