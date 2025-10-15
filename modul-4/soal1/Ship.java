package soal1;

public class Ship extends Vehicle {
    private int maximumWeight;

    public Ship(int id, String brand, String type, int productionYear, int passengerCapacity, int maximumWeight) {
        super(id, brand, type, productionYear, passengerCapacity);
        this.maximumWeight = maximumWeight;
    }
    public void loadCargo() {
        System.out.println("Kargo kapal sedang dimuat.");
    }
}