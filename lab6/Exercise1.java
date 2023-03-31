public class Exercise1 {

    // initialize variables 
    private double length;
    private double width;

    // constructor
    public Exercise1(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    // no argument constructor initialization
    public Exercise1()
    {
        this.length = 0.0;
        this.width = 0.0;
    }

    // setters mutator method
    public void setLength(double length)
    {
        this.length = length;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }

    // getters accessors method
    public double getLength()
    {
        return this.length;
    }
    public double getWidth()
    {
        return this.width;
    }
    // area of a rectangle
    public double getArea()
    {
        return length*width;
    }

}
