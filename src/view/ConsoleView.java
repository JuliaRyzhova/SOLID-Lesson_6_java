package view;

import controller.Controller;
import model.impl.User;
import java.util.Scanner;

public class ConsoleView {

    public void run() {
        User user = createUser();
        Controller controller = new Controller();
        controller.saveUser(user);
        controller.saveReport(user);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private User createUser() {
        String name = prompt("¬ведите им€: ");
        return new User(name);
    }
}
