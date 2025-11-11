package chess.pieces;

import static utils.TerminalFormatter.*;

public class Knight extends Piece {
    @Override
    public void displayDetails() {
        addNewLine(50);
        System.out.println("""
                 (\\=,
                //  .\\
               (( \\_  \\
                ))  `\\_)
               (/     \\
                | _.-'|
                 )___(
                (=====)
                }====={
               (_______)
               
                Knight:
                - Moves in an 'L' shape: two squares in one direction and then one square perpendicular
                - Can jump over other pieces
                - Valuable for controlling the center of the board""");
    }
}
