package PRAK102_2410817210019_AchmadReihanAlfaiz.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Number of test cases
        int testCases = 3;

        for (int i = 0; i < testCases; i++) {
            SpecificNumberProcessor specificNumberProcessor = new SpecificNumberProcessor();
            specificNumberProcessor.count(userInput.nextInt());
            while (specificNumberProcessor.getCounter() >= 0 && specificNumberProcessor.getIdx() <= 10) {
                if (specificNumberProcessor.getIdx() == 10) {
                    System.out.print(specificNumberProcessor.getValue()[specificNumberProcessor.getIdx()] + "\n\n");
                    break;
                }
                System.out.print(specificNumberProcessor.getValue()[specificNumberProcessor.getIdx()] + ", ");
                specificNumberProcessor.decrementCounter();
                specificNumberProcessor.incrementIdx();
            }
        }
        userInput.close();
    }
}
