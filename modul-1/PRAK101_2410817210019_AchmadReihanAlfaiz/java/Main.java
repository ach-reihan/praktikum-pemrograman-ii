package PRAK101_2410817210019_AchmadReihanAlfaiz.java;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        userInput.useLocale(Locale.US);
        Person person = new Person();

        System.out.print("Masukkan Nama Lengkap: ");
        person.setFullName(userInput.nextLine());

        System.out.print("Masukkan Tempat Lahir: ");
        person.setBirthPlace(userInput.nextLine());

        System.out.print("Masukkan Tanggal Lahir: ");
        person.setBirthDay(userInput.nextInt());
        userInput.nextLine();

        System.out.print("Masukkan Bulan Lahir: ");
        person.setBirthMonth(userInput.nextLine());

        System.out.print("Masukkan Tahun Lahir: ");
        person.setBirthYear(userInput.nextInt());

        System.out.print("Masukkan Tinggi Badan: ");
        person.setHeight(userInput.nextInt());

        System.out.print("Masukkan Berat Badan: ");
        person.setWeight(userInput.nextDouble());

        System.out.print(person.getInfo());

        userInput.close();
    }
}
