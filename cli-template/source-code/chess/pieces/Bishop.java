package chess.pieces;

import static utils.TerminalFormatter.*;

public class Bishop extends Piece {
    @Override
    public void displayDetails() {
        addNewLine(50);
        System.out.println("""
                    ()
                    /\\
                   //\\\\
                  (    )
                   )__(
                  /____\\
                   |  |
                   |  |
                  /____\\
                 (======)
                 }======{
                (________)
                
                 Bishop:
                 - Moves diagonally any number of squares
                 - Cannot jump over other pieces
                 - Strong on long diagonals and in open positions""");
    }
}
