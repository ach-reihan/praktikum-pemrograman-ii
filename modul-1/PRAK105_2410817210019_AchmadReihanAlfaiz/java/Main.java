package PRAK105_2410817210019_AchmadReihanAlfaiz.java;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        userInput.useLocale(Locale.US);

        // Number of test cases
        int testCases = 3;

        for (int i = 0; i < testCases; i++) {
            Cylinder cylinder = new Cylinder();

            System.out.print("Masukkan jari-jari: ");
            cylinder.setRadius(userInput.nextDouble());

            System.out.print("Masukkan tinggi: ");
            cylinder.setHeight(userInput.nextDouble());

            System.out.printf("""
                            Volume tabung dengan jari-jari %.1f cm dan
                            tinggi %.1f cm adalah %.3f cm^3%n
                            """,
                    cylinder.getRadius(), cylinder.getHeight(), cylinder.getVolume());
        }
        userInput.close();
    }
}
