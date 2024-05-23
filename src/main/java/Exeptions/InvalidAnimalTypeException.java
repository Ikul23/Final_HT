package Exeptions;
public class InvalidAnimalTypeException extends Exception {
    public InvalidAnimalTypeException(String message) {
        super(message);
    }
}