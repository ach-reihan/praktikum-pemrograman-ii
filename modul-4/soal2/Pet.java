package soal2;

public class Pet {
    private final String name;
    private final String breed;

    public Pet(String name, String breed) {
        String[] nameParts = name.split(": ");
        String petName = nameParts[1];

        String[] breedParts = breed.split(": ");
        String petBreed = breedParts[1];

        this.name = petName;
        this.breed = petBreed;
    }
    public void display() {
        System.out.println("\nDetail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah: " + this.name);
        System.out.println("Dengan ras: " + this.breed);
    }
}
