package PRAK201_2410817210019_AchmadReihanAlfaiz;

public class Soal1Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apel", 0.4, 7000);
        Fruit mango = new Fruit("Mangga", 0.2, 3500);
        Fruit avocado = new Fruit("Alpukat", 0.25, 10000);

        System.out.println(apple.getPurchaseInfo(40));
        System.out.println();

        System.out.println(mango.getPurchaseInfo(15));
        System.out.println();

        System.out.println(avocado.getPurchaseInfo(12));
        System.out.println();
    }
}
