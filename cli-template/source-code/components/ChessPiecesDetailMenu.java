package components;

import controllers.ChessPiecesDetailMenuController;
import java.util.Scanner;

public class ChessPiecesDetailMenu extends Menu {
    private final Scanner scanner;
    private final ChessPiecesDetailMenuController controller;

    public ChessPiecesDetailMenu(Menu parentMenu) {
        super("Chess Pieces Detail Menu", parentMenu);
        this.body = new BodyMenu();
        this.scanner = new Scanner(System.in);
        this.controller = new ChessPiecesDetailMenuController(this);
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
