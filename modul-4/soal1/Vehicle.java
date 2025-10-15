package soal1;

public class Vehicle {
    private int id;
    private String brand;
    private String type;
    private int productionYear;
    private int passengerCapacity;

    public Vehicle(int id, String brand, String type, int productionYear, int passengerCapacity) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.productionYear = productionYear;
        this.passengerCapacity = passengerCapacity;
    }
    public void startEngine() {
        System.out.println("Mesin kendaraan dinyalakan.");
    }
    public void stopEngine() {
        System.out.println("Mesin kendaraan dimatikan.");
    }
}