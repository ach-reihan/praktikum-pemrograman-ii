package PRAK104_2410817210019_AchmadReihanAlfaiz.java;

public class RockPaperScissor {
    private String[] player1Choices;
    private String[] player2Choices;
    private int player1Score = 0;
    private int player2Score = 0;

    public RockPaperScissor(int rounds) {
        this.player1Choices = new String[rounds];
        this.player2Choices = new String[rounds];
    }
    public int getRounds() {
        return 3;
    }
    public void setPlayer1Choices(String choice1, String choice2, String choice3) {
        this.player1Choices = new String[]{choice1, choice2, choice3};
    }
    public void setPlayer2Choices(String choice1, String choice2, String choice3) {
        this.player2Choices = new String[]{choice1, choice2, choice3};
    }
    public void playGame() {
        for (int i = 0; i < getRounds(); i++) {
            String p1 = this.player1Choices[i];
            String p2 = this.player2Choices[i];
            if (p1.equals(p2)) {
                continue;
            } else if (((p1.equals("rock") || p1.equals("B")) && (p2.equals("scissor") || p2.equals("G"))) ||
                    ((p1.equals("paper") || p1.equals("K")) && (p2.equals("rock") || p2.equals("B"))) ||
                    ((p1.equals("scissor") || p1.equals("G")) && (p2.equals("paper") || p2.equals("K")))) {
                this.player1Score++;
            } else {
                this.player2Score++;
            }
        }
    }
    public int getPlayer1Score() { return this.player1Score; }
    public int getPlayer2Score() { return this.player2Score; }
}
