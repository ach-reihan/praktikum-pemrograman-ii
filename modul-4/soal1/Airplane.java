package soal1;

public class Airplane extends Vehicle {
    private String airline;
    private int maximumAltitude;
    private String engine;

    public Airplane(int id, String brand, String type, int productionYear, int passengerCapacity, String airline, int maximumAltitude, String engine) {
        super(id, brand, type, productionYear, passengerCapacity);
        this.airline = airline;
        this.maximumAltitude = maximumAltitude;
        this.engine = engine;
    }
    public void takeOff() {
        System.out.println("Pesawat lepas landas.");
    }
    public void land() {
        System.out.println("Pesawat mendarat.");
    }
}