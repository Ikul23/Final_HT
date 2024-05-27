package MVC;

import AnimalClasses.Animal;
import Exeptions.InvalidAnimalTypeException;

import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AnimalView {
    private Scanner scanner;
    private SimpleDateFormat dateFormat;

    public AnimalView() {
        scanner = new Scanner(System.in);
        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    }

    public int showMenuAndGetChoice() {
        System.out.println("\n1. Добавить животное");
        System.out.println("2. Показать список животных");
        System.out.println("3. Показать команды животного");
        System.out.println("4. Обучить животное новой команде");
        System.out.println("5. Показать животных по дате рождения");
        System.out.println("6. Показать количество животных");
        System.out.println("7. Выход");
        System.out.print("Выберите вариант: ");
        return scanner.nextInt();
    }

    public String getAnimalName() {
        System.out.print("Введите имя животного: ");
        scanner.nextLine(); // consume newline
        return scanner.nextLine();
    }

    public Date getAnimalBirthDate() {
        System.out.print("Введите дату рождения (yyyy-MM-dd): ");
        scanner.nextLine(); // consume newline
        String dateStr = scanner.nextLine();
        try {
            return dateFormat.parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Неправильный формат даты. Попробуйте еще раз.");
            return getAnimalBirthDate();
        }
    }

    public int getAnimalType() throws InvalidAnimalTypeException {
        System.out.println("Выберите тип животного: 1. Собака 2. Кошка 3. Хомяк 4. Лошадь 5. Верблюд 6. Осел");
        int type = scanner.nextInt();
        if (type < 1 || type > 6) {
            throw new InvalidAnimalTypeException("Некорректный выбор типа животного.");
        }
        return type;
    }

    public String getOwnerName() {
        System.out.print("Введите имя хозяина: ");
        scanner.nextLine(); // consume newline
        return scanner.nextLine();
    }

    public String getFavoriteTreat() {
        System.out.print("Введите любимое лакомство: ");
        return scanner.nextLine();
    }

    public String getBreed() {
        System.out.print("Введите породу собаки: ");
        return scanner.nextLine();
    }

    public String getFurLength() {
        System.out.print("Введите длину шерсти кошки: ");
        return scanner.nextLine();
    }

    public String getColor() {
        System.out.print("Введите цвет хомяка: ");
        return scanner.nextLine();
    }

    public int getCarryingCapacity() {
        System.out.print("Введите грузоподъемность: ");
        return scanner.nextInt();
    }

    public int getHerdSize() {
        System.out.print("Введите количество особей в стаде: ");
        return scanner.nextInt();
    }

    public int getHumpCount() {
        System.out.print("Введите количество горбов у верблюда: ");
        return scanner.nextInt();
    }

    public int getEarLength() {
        System.out.print("Введите длину ушей у осла: ");
        return scanner.nextInt();
    }

    public int getAnimalId() {
        System.out.print("Введите ID животного: ");
        return scanner.nextInt();
    }

    public String getCommand() {
        System.out.print("Введите команду: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public void showCommands(List<String> commands) {
        System.out.println("Команды:");
        for (String command : commands) {
            System.out.println(command);
        }
    }

    public void showAnimals(List<Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            System.out.println(i + ": " + animal.getName() + ", " + animal.getSpecies() + ", " + animal.getBirthDate());
        }
    }

    public void displayAnimalDetails(Animal animal) {
        System.out.println("Информация о животном:");
        System.out.println("Имя: " + animal.getName());
        System.out.println("Вид: " + animal.getSpecies());
        System.out.println("Дата рождения: " + animal.getBirthDate());
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayAnimalCount(int count) {
        System.out.println("Общее количество животных: " + count);
    }
}
