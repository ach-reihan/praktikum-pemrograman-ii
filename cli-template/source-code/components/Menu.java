package components;

import controllers.UserActionHandler;

public abstract class Menu implements Displayable, UserActionHandler {
    protected String title;
    protected Menu parentMenu;
    protected HeaderMenu header;
    protected BodyMenu body;
    protected FooterMenu footer;

    public Menu(String title) {
        this.title = title;
        this.header = new HeaderMenu(title);
        this.footer = new FooterMenu();
    }

    public Menu(String title, Menu parentMenu) {
        this(title);
        this.parentMenu = parentMenu;
    }

    public final void display() {
        clearConsole();
        header.display();
        body.display();
        footer.display();
    }

    public Menu getParentMenu() {
        return parentMenu;
    }

    public BodyMenu getBody() {
        return body;
    }

    public abstract void run();

    public static void clearConsole() {
        for (int i = 0; i < 50; ++i) { System.out.println(); }
    }

    public static void waitForEnter(java.util.Scanner scanner) {
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }
}
