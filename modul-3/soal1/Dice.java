package soal1;

import java.util.Random;

public class Dice {
    private final int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
    public int roll() {
        Random rand = new Random();
        return rand.nextInt(numberOfSides) + 1;
    }
}
