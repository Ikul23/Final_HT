import MVC.*;
import AnimalClasses.*;


import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        AnimalRegistry model = new AnimalRegistry();
        AnimalView view = new AnimalView();
        AnimalController controller = new AnimalController(model, view);


        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("ownerName", "John Doe");
        additionalAttributes.put("favoriteTreat", "Bone");
        additionalAttributes.put("breed", "Golden Retriever");


        controller.addAnimal("dog", "Buddy", new Date(), "Dog", additionalAttributes);


        Animal buddy = model.getAnimalByName("Buddy");
        System.out.println(buddy.voice());
        System.out.println(buddy.eat());
        System.out.println(buddy.move());

        // Другие действия контроллера
        controller.displayAnimalCount();
        controller.displayAnimalsSortedByBirthDate();
    }
}
