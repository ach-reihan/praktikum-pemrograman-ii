package components;

import java.util.List;
import java.util.ArrayList;

import static utils.TerminalFormatter.*;

public class BodyMenu implements Displayable{
    private final List<String> options;

    public BodyMenu() {
        this.options = new ArrayList<>();
    }

    public void addOption(int number, String label) {
        options.add(number + ". " + label);
    }

    public void clearOptions() {
        options.clear();
    }

    @Override
    public void display() {
        addNewLine(5);
        for (String option : options) {
            System.out.println(option);
        }
        addNewLine(5);
    }
}
