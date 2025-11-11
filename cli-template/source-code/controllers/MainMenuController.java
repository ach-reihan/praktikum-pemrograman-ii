package controllers;

import components.MainMenu;
import components.PlayChessMenu;
import components.ChessPiecesDetailMenu;

public class MainMenuController implements UserActionHandler {
    private final MainMenu menu;

    public MainMenuController(MainMenu menu) {
        this.menu = menu;
        initializeOptions();
    }

    private void initializeOptions() {
        menu.getBody().addOption(1, "Play Chess");
        menu.getBody().addOption(2, "Chess Pieces Detail");
        menu.getBody().addOption(0, "Exit");
    }

    @Override
    public boolean handleUserInput(String input) {
        switch (input) {
            case "1":
                new PlayChessMenu(menu).run();
                break;
            case "2":
                new ChessPiecesDetailMenu(menu).run();
                break;
            case "0":
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option! Please try again.");

        }
        return true;
    }
}
