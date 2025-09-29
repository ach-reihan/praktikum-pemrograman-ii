package PRAK104_2410817210019_AchmadReihanAlfaiz.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Number of test cases
        int testCases = 3;

        for (int i = 0; i < testCases; i++) {
            RockPaperScissor game = new RockPaperScissor(3);

            String player1Name = "Abu";
            String player2Name = "Bagas";

            System.out.print("Tangan Abu: ");
            String[] player1Input = userInput.nextLine().split(" ");
            game.setPlayer1Choices(player1Input[0], player1Input[1], player1Input[2]);

            System.out.print("Tangan Bagas: ");
            String[] player2Input = userInput.nextLine().split(" ");
            game.setPlayer2Choices(player2Input[0], player2Input[1], player2Input[2]);

            game.playGame();

            if (game.getPlayer1Score() > game.getPlayer2Score()) {
                System.out.println(player1Name);
            } else if (game.getPlayer1Score() < game.getPlayer2Score()) {
                System.out.println(player2Name);
            } else {
                System.out.println("Seri");
            }

            System.out.println();
        }
        userInput.close();
    }
}
