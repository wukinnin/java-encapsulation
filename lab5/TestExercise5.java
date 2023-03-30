import java.util.Scanner;
public class TestExercise5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Exercise5 j = new Exercise5();
        int select;
        double radius, length, width, base, height;

        // prompt
        System.out.println("1. Calculate the Area of a Circle");
        System.out.println("2. Calculate the Area of a Rectangle");
        System.out.println("3. Calculate the Area of a Triangle");
        System.out.println("4. Quit");
        System.out.println("");
        System.out.print("Enter your choice (1-4): ");
        select = s.nextInt();

        switch(select)
        {
            case 1:
               System.out.print("Enter variable radius: ");
               radius = s.nextDouble();
               double areaCircle = j.CalculateCircle(radius);
               System.out.printf("The area of a circle of %.0f is: ", radius);
               System.out.printf("%.0f", areaCircle);
               break;
            case 2:
               System.out.print("Enter variable length: ");
               length = s.nextDouble();
               System.out.print("Enter variable width: ");
               width = s.nextDouble();
               double areaRectangle = j.CalculateRectangle(length, width);
               System.out.printf("The area of a rectangle of %.0f and %.0f is: ", length, width);
               System.out.printf("%.0f", areaRectangle);               
               break;
            case 3:
               System.out.print("Enter variable base: ");
               base = s.nextDouble();
               System.out.print("Enter variable height: ");
               height = s.nextDouble();
               double areaTriangle = j.CalculateTriangle(base, height);
               System.out.printf("The area of a circle of %.0f and %.0f is: ", base, height);
               System.out.printf("%.0f", areaTriangle);               
               break;
            case 4:
               System.out.println("Quitting program.");
               break;
            default:
               System.out.println("Invalid Option. Terminating.");
        }
        s.close();
    }
}
