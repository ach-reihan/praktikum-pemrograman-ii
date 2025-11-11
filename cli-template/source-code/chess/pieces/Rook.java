package chess.pieces;

import static utils.TerminalFormatter.*;

public class Rook extends Piece {
    @Override
    public void displayDetails() {
        addNewLine(50);
        System.out.println("""
                 |'-'-'|
                 |_____|
                  |===|
                  |   |
                  |   |
                  )___(
                 (=====)
                 }====={
                (_______)

               Rook:
               - Moves horizontally or vertically any number of squares
               - Cannot jump over other pieces
               - Essential for controlling open files and ranks""");
    }
}
