package chess.pieces;

import static utils.TerminalFormatter.*;

public class Queen extends Piece {
    @Override
    public void displayDetails() {
        addNewLine(50);
        System.out.println("""
                   ()
                .-:--:-.
                 \\____/
                 {====}
                  )__(
                 /____\\
                  |  |
                  |  |
                  |  |
                  |  |
                 /____\\
                (======)
                }======{
               (________)
               
               Queen:
               - Moves horizontally, vertically, or diagonally any number of squares
               - Cannot jump over other pieces
               - The most powerful piece on the board""");
    }
}
