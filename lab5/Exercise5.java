import java.lang.Math.*;
public class Exercise5 {
    double radius; 
    double length, width;
    double base, height;

    // Calculate areas
    public static double CalculateCircle(double radius)
    {    
        double area;
        return area = Math.PI * radius * 2;
    }
    public static double CalculateRectangle(double length, double width)
    {
       double area;
       return area = length * width;
    }
    public static double CalculateTriangle(double base, double height)
    {
       double area;
       return area = base * height * 0.5;
    }
}

