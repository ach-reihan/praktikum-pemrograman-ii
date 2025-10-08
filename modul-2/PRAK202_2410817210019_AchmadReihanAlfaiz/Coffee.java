package PRAK202_2410817210019_AchmadReihanAlfaiz;

public class Coffee {
    private String coffeeName, size, customer;
    double price;

    public Coffee(String coffeeName, String size, double price) {
        this.coffeeName = coffeeName;
        this.size = size;
        this.price = price;
    }

    public void setCustomer(String customer) { this.customer = customer; }
    public String getCustomer() { return customer; }
    public double getTax() { return 0.11 * price; }

    public void getCoffeeDetail() {
        System.out.printf("Nama Kopi: %s\nUkuran: %s\nHarga: Rp. %.1f\n", coffeeName, size, price);
    }
}
