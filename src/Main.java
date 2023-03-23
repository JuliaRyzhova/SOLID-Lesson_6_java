import controller.Controller;
import model.impl.Saver;
import view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Saver());
        ConsoleView consoleView = new ConsoleView(controller);
        consoleView.run();
    }
}
