package soal1;

import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        LinkedList<Integer> rollResults = new LinkedList<>();

        int numberOfTestCases = 3;

        for (int i = 0; i < numberOfTestCases; i++) {
            int sum = 0;
            int numberOfRolls = userInput.nextInt();
            for (int j = 0; j < numberOfRolls; j++) {
                Dice dice = new Dice(6);
                rollResults.add(dice.roll());
                System.out.println("Dadu ke-" + (j + 1) + " bernilai " + rollResults.get(j));
                sum += rollResults.get(j);
            }
            System.out.println("Total nilai dadu keseluruhan " + sum);
            System.out.println();
        }
        userInput.close();
    }
}
