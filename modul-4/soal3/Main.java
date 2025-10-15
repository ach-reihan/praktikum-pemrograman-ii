package soal3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int numberOfTestCases = 2;

        for (int i = 0; i < numberOfTestCases; i++) {
            System.out.print("""
                    Pilih jenis hewan yang ingin diinputkan:
                    1 = Kucing
                    2 = Anjing
                    Masukkan pilihan:\s""");
            switch (userInput.nextInt()) {
                case 1:
                    System.out.print("Nama hewan peliharaan: ");
                    String catName = userInput.next();

                    System.out.print("Ras: ");
                    String catBreed = userInput.next();

                    System.out.print("Warna bulu: ");
                    String catFurColor = userInput.next();

                    Cat cat = new Cat(catName, catBreed, catFurColor);
                    cat.displayCatDetails();
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Nama hewan peliharaan: ");
                    String dogName = userInput.next();

                    System.out.print("Ras: ");
                    String dogBreed = userInput.next();

                    System.out.print("Warna bulu: ");
                    String dogFurColor = userInput.next();

                    System.out.print("Kemampuan: ");
                    userInput.nextLine();
                    String[] dogTricks = userInput.nextLine().split(", ");

                    Dog dog = new Dog(dogName, dogBreed, dogFurColor, dogTricks);
                    dog.displayDogDetails();
                    System.out.println();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    System.out.println();
                    break;
            }
        }
        userInput.close();
    }
}