package soal1;

public class Paint
{
    private double coverage; //number of square feet per gallon

    //-----------------------------------------
    // Constructor: Sets up the paint object.
    //-----------------------------------------
    public Paint(double coverage)
    {
        this.coverage = coverage;
    }

    //---------------------------------------------------
    // Returns the amount of paint (number of gallons)
    // needed to paint the shape given as the parameter.
    //---------------------------------------------------
    public double amount(Shape shape)
    {
        System.out.println ("Computing amount for " + shape);
        return shape.calculateArea() / coverage;
    }
}
