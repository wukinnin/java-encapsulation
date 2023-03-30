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
        j.setSelect(select);




        // if statement
        if(select == 1) // calculate area of a circle
        {
            System.out.print("Enter variable radius: ");
            radius = s.nextDouble();
            j.setRadius(radius);
            j.AreaOfACircle();
        }
        else if(select == 2) // calculate area of a rectangle
        {
            System.out.print("Enter variable length: ");
            length = s.nextDouble();
            System.out.print("Enter variable width: ");
            width = s.nextDouble();
            j.setLength(length);
            j.setWidth(width);
            j.AreaOfRectangle();
        }
        else if(select == 3) // calculate area of a triangle
        {
            System.out.print("Enter variable base: ");
            base = s.nextDouble();
            System.out.print("Enter variable height: ");
            height = s.nextDouble();
            j.setBase(base);
            j.setHeight(height);
            j.AreaOfATriangle();
        }
        else if(select == 4)
        {
            System.out.println("Quitting program.");
        }
        else
        {
            System.out.println("Invalid option. Terminating program.");
        }

        s.close();
    }
}
