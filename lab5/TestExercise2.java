import java.util.Scanner;

public class TestExercise2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num1, num2;
        int choice;

        // print menu
        System.out.println("| Enter any two numbers.");
        System.out.println("| Numbers can have decimals up to the hundredth place.");
        System.out.print("> Enter 1st number: ");
        num1 = s.nextDouble();
        System.out.print("> Enter 2nd number: ");
        num2 = s.nextDouble();
        System.out.println(" ");
        System.out.println("| ");
        System.out.println("| [1] Add");
        System.out.println("| [2] Subtract");
        System.out.println("| [3] Multiply");
        System.out.println("| [4] Divide");
        System.out.println("| ");
        System.out.println("| Now select a number from [1] to [4] that corresponds to the operation of your choice.");
        System.out.print("> Enter the [number] of the operator: ");
        choice = s.nextInt();
        s.close();

        Exercise2 j = new Exercise2(num1, num2, choice);
        
        // if statement
        if(choice == 1)
        {
            j.add();
        }
        else if(choice == 2)
        {
            j.subtract();
        }
        else if(choice == 3)
        {
            j.multiply();
        }
        else if(choice == 4)
        {
            j.divide();
        }
        else
        {
            System.out.print("| Invalid choice. Terminating program.");
        }
    }    
}
