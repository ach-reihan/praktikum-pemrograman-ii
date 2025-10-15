package soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Pet pet = new Pet(userInput.nextLine(), userInput.nextLine());
        pet.display();

        userInput.close();
    }
}