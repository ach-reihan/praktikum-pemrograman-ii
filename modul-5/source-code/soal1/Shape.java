package soal1;

abstract public class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    abstract protected double calculateArea();

    public String toString() {
        return shapeName;
    }
}
