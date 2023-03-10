import java.util.Scanner;
public class TestPage24
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2;
        char option;

        System.out.print("Enter number 1: ");
        num1 = s.nextInt();
        System.out.print("Enter number 2: ");
        num2 = s.nextInt();
        System.out.println();
        System.out.println("A - Addition");
        System.out.println("S - Subtraction");
        System.out.println("M - Multiplication");
        System.out.println("D - Division");
        System.out.println();
        System.out.print("Enter a character for the operation: ");
        option = s.next().charAt(0);
        s.close();
        
        Page24 n = new Page24(num1, num2, option);
        n.display();
    }   
}