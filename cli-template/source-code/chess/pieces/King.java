package chess.pieces;

import static utils.TerminalFormatter.*;

public class King extends Piece {
    @Override
    public void displayDetails() {
        addNewLine(50);
        System.out.println("""
                  _:_
                 '-.-'
                __.'.__
               |_______|
                \\=====/
                 )___(
                /_____\\
                 |   |
                 |   |
                 |   |
                 |   |
                 |   |
                /_____\\
               (=======)
               }======={
              (_________)

              King:
              - Moves one square in any direction
              - Special move: Castling with a rook
              - Crucial piece; checkmate ends the game""");
    }
}
