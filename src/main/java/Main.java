import MVC.AnimalController;
import MVC.AnimalRegistry;
import MVC.AnimalView;

public class Main {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();
        AnimalView view = new AnimalView();
        AnimalController controller = new AnimalController(registry, view);
        controller.run();
    }
}
