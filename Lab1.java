import java.util.Scanner;

public class Lab1
{
    public static void main(String[] args)
    {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter num1: ");
        num1 = input.nextInt();
        System.out.print("Enter num2: ");
        num2 = input.nextInt();
        
        input.close();

        // call in encapsulated methods
        Lab1_a n = new Lab1_a(num1, num2);
        n.display();
    }
}
