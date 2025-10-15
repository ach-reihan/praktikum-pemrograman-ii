package soal1;

public class Car extends Vehicle {
    private String transmission;
    private String fuel;

    public Car(int id, String brand, String type, int productionYear, int passengerCapacity, String transmission, String fuel) {
        super(id, brand, type, productionYear, passengerCapacity);
        this.transmission = transmission;
        this.fuel = fuel;
    }
    public void openTrunk() {
        System.out.println("Bagasi mobil dibuka.");
    }
}