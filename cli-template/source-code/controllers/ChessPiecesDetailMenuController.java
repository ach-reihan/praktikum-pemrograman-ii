package controllers;

import components.ChessPiecesDetailMenu;
import chess.pieces.*;

public class ChessPiecesDetailMenuController implements UserActionHandler {
    private final ChessPiecesDetailMenu menu;

    public ChessPiecesDetailMenuController(ChessPiecesDetailMenu menu) {
        this.menu = menu;
        initializeOptions();
    }

    private void initializeOptions() {
        menu.getBody().addOption(1, "Pawn");
        menu.getBody().addOption(2, "Knight");
        menu.getBody().addOption(3, "Bishop");
        menu.getBody().addOption(4, "Rook");
        menu.getBody().addOption(5, "Queen");
        menu.getBody().addOption(6, "King");
        menu.getBody().addOption(0, "Back to Previous Menu");
    }

    @Override
    public boolean handleUserInput(String input) {
        switch (input) {
            case "1":
                Piece pawn = new Pawn();
                pawn.displayDetails();
                break;
            case "2":
                Piece knight = new Knight();
                knight.displayDetails();
                break;
            case "3":
                Piece bishop = new Bishop();
                bishop.displayDetails();
                break;
            case "4":
                Piece rook = new Rook();
                rook.displayDetails();
                break;
            case "5":
                Piece queen = new Queen();
                queen.displayDetails();
                break;
            case "6":
                Piece king = new King();
                king.displayDetails();
                break;
            case "0":
                return false;
            default:
                System.out.println("Invalid option! Please try again.");
        }
        return true;
    }
}
