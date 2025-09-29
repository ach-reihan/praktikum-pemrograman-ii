package PRAK103_2410817210019_AchmadReihanAlfaiz.java;

public class OddNumberChecker {
    private int counter;
    private int idx = 0;
    private int numberOfN;
    private int[] value;

    public void count(int numberOfN, int firstNumber) {
        int idx = 0;
        int counter = numberOfN;
        int currentValue = firstNumber;

        this.value = new int[counter + 1];

        do {
            if (currentValue % 2 != 0) {
                this.value[idx] = currentValue;
                idx++;
                currentValue++;
                counter--;
            } else {
                currentValue++;
            }
        } while (counter >= 0 && idx < this.counter);

    }
    public int[] getValue() { return this.value; }
    public void setCounter() { this.counter = this.numberOfN; }
    public int getCounter() { return this.counter; }
    public void decrementCounter() { --this.counter; }
    public void incrementIdx() { ++this.idx; }
    public int getIdx() { return this.idx; }
    public void setNumberOfN(int numberOfN) { this.numberOfN = numberOfN; }
    public int getNumberOfN() { return this.numberOfN; }
}
