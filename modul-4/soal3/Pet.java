package soal3;

public class Pet {
    private final String name;
    private final String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public void display() {
        System.out.println("\nDetail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah: " + this.name);
        System.out.println("Dengan ras: " + this.breed);
    }
}