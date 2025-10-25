package soal2;

import java.util.Objects;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);

        int numberOfTestCases = 2;

        for (int i = 0; i < numberOfTestCases; i++) {
            List<Country> countryList = new LinkedList<>();
            int numberOfCountries = userInput.nextInt();
            userInput.nextLine();
            for (int j = 0; j < numberOfCountries; j++) {
                Country country = new Country(
                    userInput.nextLine(),
                    userInput.nextLine(),
                    userInput.nextLine()
                );
                if (!Objects.equals(country.getTypeOfLeadership(), "Monarki")) {
                    country.setIndependenceDate(
                        userInput.nextInt(),
                        userInput.nextInt(),
                        userInput.nextInt()
                    );
                    userInput.nextLine();
                }
                countryList.add(country);
            }
            System.out.println();
            for (Country country : countryList) {
                System.out.println(country.introduceCountry());
                System.out.println();
            }
            countryList.clear();
        }
        userInput.close();
    }
}
