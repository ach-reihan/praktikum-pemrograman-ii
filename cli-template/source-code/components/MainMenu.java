package components;

import controllers.MainMenuController;
import java.util.Scanner;

public class MainMenu extends Menu {
    private final Scanner scanner;
    private final MainMenuController controller;

    public MainMenu() {
        super("Main Menu");
        this.body = new BodyMenu();
        this.scanner = new Scanner(System.in);
        this.controller = new MainMenuController(this);
    }

    @Override
    public void run() {
        while (true) {
            display();
            handleUserInput(scanner.nextLine());
        }
    }

    @Override
    public boolean handleUserInput(String input) {
        return controller.handleUserInput(input);
    }
}
