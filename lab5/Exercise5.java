import java.lang.Math.*;
public class Exercise5 {
    /* 
    area of a circle = PI*r*2 
    area of a rectangle = length*width;
    area of a triangle = base*height*0.5
    */

    private int select; // selection

    private double radius; // area of a circle 
    private double length, width; // area of a rectangle
    private double base, height; // area of a triangle

    public Exercise5() {
    }



    // start setters
    public void setSelect(int select) {
        this.select = select;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    // end setters group
    



    // getters group
    public int getSelect()
    {
        return this.select;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public double getLength()
    {
        return this.length;
    }
    public double getWidth()
    {
        return this.width;
    }
    public double getBase()
    {
        return this.base;
    }
    public double getHeight()
    {
        return this.height;
    }
    // end getters group




    // methods group
    public void AreaOfACircle()
    {
        double area = Math.PI*getRadius()*2;
        System.out.printf("The area of a circle of %.0f is: ", getRadius());
        System.out.printf("%.0f", area);
    }
    public void AreaOfRectangle()
    {
        double area = getLength()*getWidth();
        System.out.printf("The area of a rectangle of %.0f and %.0f is: ", getLength(), getWidth());
        System.out.printf("%.0f", area);
    }
    public void AreaOfATriangle()
    {
        double area = getBase()*getHeight()*0.5;
        System.out.printf("The area of a triangle of %.0f and %.0f is: ", getBase(), getHeight());
        System.out.printf("%.0f", area);
    }
    
}
