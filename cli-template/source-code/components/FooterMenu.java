package components;

import static utils.TerminalFormatter.*;

public class FooterMenu implements Displayable {
    private final String prompt;

    public FooterMenu() {
        this.prompt = "Choose an option: ";
    }

    public FooterMenu(String prompt) {
        this.prompt = prompt;
    }

    @Override
    public void display() {
        System.out.println("=".repeat(50));
        System.out.println("© 2025 Achmad Reihan Alfaiz. All rights reserved.");
        System.out.println("=".repeat(50));
        addNewLine(1);
        System.out.print(prompt);
    }
}
