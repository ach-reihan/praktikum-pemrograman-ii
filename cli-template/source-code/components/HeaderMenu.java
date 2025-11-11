package components;

public class HeaderMenu implements Displayable{
    private final String title;

    public HeaderMenu(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println(title.toUpperCase());
        System.out.println("=".repeat(50));
    }
}
