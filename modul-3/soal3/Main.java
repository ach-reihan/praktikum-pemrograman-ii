package soal3;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        while (true) {
            System.out.print("""
                    Menu:
                    1. Tambah Mahasiswa
                    2. Hapus Mahasiswa berdasarkan NIM
                    3. Cari Mahasiswa berdasarkan NIM
                    4. Tampilkan Daftar Mahasiswa
                    0. Keluar
                    Pilihan:\s""");

            switch (userInput.nextInt()) {
                case 1:
                    userInput.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String name = userInput.nextLine();

                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String studentID = userInput.nextLine();

                    boolean exists = false;
                    for (Student studentToAdd : studentList) {
                        if (studentToAdd.getStudentID().equals(studentID)) {
                            exists = true;
                            break;
                        }
                    }
                    if (!exists) {
                        Student newStudent = new Student(name, studentID);
                        studentList.add(newStudent);
                        System.out.println("Mahasiswa " + newStudent.getName() + " ditambahkan.");
                    } else {
                        System.out.println("NIM sudah ada. Mahasiswa tidak ditambahkan.");
                    }
                    break;
                case 2:
                    userInput.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String idToRemove = userInput.nextLine();
                    boolean removed = false;

                    String studentIdToRemove = null;
                    for (Student s : studentList) {
                        if (s.getStudentID().equals(idToRemove)) {
                            studentIdToRemove = s.getStudentID();
                            break;
                        }
                    }
                    if (studentIdToRemove != null) {
                        studentList.removeIf(s -> s.getStudentID().equals(idToRemove));
                        System.out.println("Mahasiswa dengan NIM " + studentIdToRemove + " dihapus.");
                        removed = true;
                    }
                    if (!removed) {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                    }
                    break;
                case 3:
                    userInput.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa yang ingin dicari: ");
                    String idToFind = userInput.nextLine();
                    boolean found = false;
                    for (Student studentToFind : studentList) {
                        if (studentToFind.getStudentID().equals(idToFind)) {
                            System.out.println("Mahasiswa ditemukan: " + studentToFind.getName());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Student s : studentList) {
                        System.out.println("NIM: " + s.getStudentID() + ", Nama: " + s.getName());
                    }
                    break;
                case 0:
                    studentList.clear();
                    System.out.println("Semua data mahasiswa telah dihapus.");
                    System.out.println("Keluar dari program.");
                    System.out.println("Terima kasih!");
                    userInput.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
