package PRAK201_2410817210019_AchmadReihanAlfaiz;

public class Fruit {
    String fruitName;
    double weight;
    double price;
    double discountPer4Kg = 0.02;

    public Fruit(String fruitName, double weight, double price){
        this.fruitName = fruitName;
        this.weight = weight;
        this.price = price;
    }

    public double calculateBasePrice(double totalBought) {
        return this.price * (totalBought / this.weight);
    }

    public double calculateDiscountPrice(double totalBought) {
        int discountUnits = (int) (totalBought / 4);
        return discountUnits * this.discountPer4Kg * (4 * this.price);
    }

    public double calculateTotalPrice(double totalBought) {
        double basePrice = calculateBasePrice(totalBought);
        double discountPrice = calculateDiscountPrice(totalBought);
        return basePrice - discountPrice;
    }

    public String getPurchaseInfo(double totalBought) {
        double basePrice = calculateBasePrice(totalBought);
        double totalPrice = calculateTotalPrice(totalBought);
        double discountPrice = calculateDiscountPrice(totalBought);
        return String.format("Nama Buah: %s\nBerat: " + this.weight + "\nHarga: %.1f\nJumlah Beli: %.1fkg\n" +
                        "Harga Sebelum Diskon: Rp%.2f\nTotal Diskon: Rp%.2f\nHarga Setelah Diskon: Rp%.2f",
                this.fruitName,
                this.price,
                totalBought,
                basePrice,
                discountPrice,
                totalPrice);
    }
}