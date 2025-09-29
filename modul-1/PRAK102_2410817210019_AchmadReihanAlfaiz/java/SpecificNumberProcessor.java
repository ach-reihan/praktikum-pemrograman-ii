package PRAK102_2410817210019_AchmadReihanAlfaiz.java;

public class SpecificNumberProcessor {
    private int counter = 10;
    private int idx = 0;
    private int[] value;

    public void count(int valueToBeStored) {
        int idx = 0;
        int counter = 10;
        int currentValue = valueToBeStored;

        this.value = new int[counter + 1];

        while (counter >= 0 && idx <= this.counter) {
            if (currentValue % 5 == 0 && currentValue != 0) {
                int SpecialCase = (currentValue / 5) - 1;
                this.value[idx] = SpecialCase;
            } else {
                this.value[idx] = currentValue;
            }

            idx++;
            currentValue++;
            counter--;
        }

    }
    public int[] getValue() { return this.value; }
    public void decrementCounter() { --this.counter; }
    public int getCounter() { return this.counter; }
    public void incrementIdx() { ++this.idx; }
    public int getIdx() { return this.idx; }
}
