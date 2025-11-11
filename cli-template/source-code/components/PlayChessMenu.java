package components;

import controllers.PlayChessMenuController;
import java.util.Scanner;

public class PlayChessMenu extends Menu {
    private final Scanner scanner;
    private final PlayChessMenuController controller;

    public PlayChessMenu(Menu parentMenu) {
        super("Play Chess", parentMenu);
        this.body = new BodyMenu();
        this.scanner = new Scanner(System.in);
        this.controller = new PlayChessMenuController(this);
    }

    @Override
    public void run() {
        boolean running = true;
        while (running) {
            display();
            String input = scanner.nextLine();
            running = handleUserInput(input);
            if (running) {
                Menu.waitForEnter(scanner);
            }
        }
    }

    @Override
    public boolean handleUserInput(String input) {
        return controller.handleUserInput(input);
    }
}
