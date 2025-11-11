package controllers;

import components.PlayChessMenu;

public class PlayChessMenuController implements UserActionHandler {
    private final PlayChessMenu menu;

    public PlayChessMenuController(PlayChessMenu menu) {
        this.menu = menu;
        initializeOptions();
    }

    private void initializeOptions() {
        menu.getBody().addOption(1, "New Game");
        menu.getBody().addOption(2, "Load Game");
        menu.getBody().addOption(0, "Back to Main Menu");
    }

    @Override
    public boolean handleUserInput(String input) {
        switch (input) {
            case "1":
                System.out.println("Starting a new game...");
                break;
            case "2":
                System.out.println("Loading a saved game...");
                break;
            case "0":
                return false;
            default:
                System.out.println("Invalid option. Please try again.");
        }
        return true;
    }
}
