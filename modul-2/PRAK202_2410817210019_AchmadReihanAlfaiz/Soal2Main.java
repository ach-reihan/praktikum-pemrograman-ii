package PRAK202_2410817210019_AchmadReihanAlfaiz;

public class Soal2Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("Espresso", "Medium", 25000);

        coffee.getCoffeeDetail();
        coffee.setCustomer("Alice");
        System.out.println("Pembeli Kopi: " + coffee.getCustomer());
        System.out.println("Pajak Kopi: Rp. " + coffee.getTax());
    }
}
