package chess.pieces;

import static utils.TerminalFormatter.*;

public class Pawn extends Piece {
    @Override
    public void displayDetails() {
        addNewLine(50);
        System.out.println("""
                   __
                  /  \\
                  \\__/
                 /____\\
                  |  |
                  |__|
                 (====)
                 }===={
                (______)
                
                Pawn:
                - Moves forward one square
                - Captures diagonally
                - Can promote to another piece upon reaching the opposite end of the board""");
    }
}
