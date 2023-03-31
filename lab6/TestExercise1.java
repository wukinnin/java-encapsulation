import java.util.Scanner;
public class TestExercise1 {
    //main class
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // input length and width
        double length, width;
        System.out.print("Enter length: ");
        length = s.nextDouble();
        System.out.print("Enter width = ");
        width = s.nextDouble();
        s.close();

        // rectangle object
        Exercise1 j = new Exercise1(length, width);

        // display the area of a rectangle
        System.out.printf("The area of a rectangle is %.1f", j.getArea());        
    }
}
