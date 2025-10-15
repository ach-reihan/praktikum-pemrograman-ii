package soal3;

public class Dog extends Pet{
    private final String furColor;
    private final String[] tricks;

    public Dog(String name, String breed, String furColor, String[] tricks) {
        super(name, breed);
        this.furColor = furColor;
        this.tricks = tricks;
    }
    public void displayDogDetails() {
        super.display();
        System.out.println("Memiliki warna bulu: " + this.furColor);
        System.out.print("Memiliki kemampuan: ");
        for (int i = 0; i < this.tricks.length; i++) {
            System.out.print(this.tricks[i]);
            if (i < this.tricks.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
