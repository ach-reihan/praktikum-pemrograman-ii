package PRAK103_2410817210019_AchmadReihanAlfaiz.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Number of test cases
        int testCases = 3;

        for (int i = 0; i < testCases; i++) {
            OddNumberChecker oddNumberChecker = new OddNumberChecker();

            oddNumberChecker.setNumberOfN(userInput.nextInt());
            oddNumberChecker.setCounter();
            oddNumberChecker.count(oddNumberChecker.getNumberOfN(), userInput.nextInt());

            do {
                if (oddNumberChecker.getIdx() == oddNumberChecker.getNumberOfN() - 1) {
                    System.out.print(oddNumberChecker.getValue()[oddNumberChecker.getIdx()] + "\n\n");
                    break;
                }
                System.out.print(oddNumberChecker.getValue()[oddNumberChecker.getIdx()] + ", ");
                oddNumberChecker.decrementCounter();
                oddNumberChecker.incrementIdx();
            } while (oddNumberChecker.getCounter() >= 0 && oddNumberChecker.getIdx() < oddNumberChecker.getNumberOfN());
        }
        userInput.close();
    }
}
