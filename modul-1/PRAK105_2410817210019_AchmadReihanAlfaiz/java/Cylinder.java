package PRAK105_2410817210019_AchmadReihanAlfaiz.java;

public class Cylinder {
    private static final double PI = 3.14;
    private double radius;
    private double height;

    public void setRadius(double radius) { this.radius = radius; }
    public double getRadius() { return radius; }
    public void setHeight(double height) { this.height = height; }
    public double getHeight() { return height; }
    public double getVolume() { return PI * radius * radius * height; }
}
