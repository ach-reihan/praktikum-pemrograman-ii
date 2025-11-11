package utils;

public final class TerminalFormatter {
    private TerminalFormatter(){};

    public static void addNewLine() { System.out.println(); }

    public static void addNewLine(int count) {System.out.print("\n".repeat(Math.max(0, count))); }
}
