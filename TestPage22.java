import java.util.Scanner;

public class TestPage22
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2, option;
        System.out.print("Enter two integer numbers: ");
        num1 = s.nextInt();
        num2 = s.nextInt();

        System.out.print("*********************************\n");
        System.out.print("*                               *\n");
        System.out.print("* 1. Sum                        *\n");
        System.out.print("* 2. Sum and average            *\n");
        System.out.print("* 3. Sum, average, max, and min *\n");
        System.out.print("*********************************\n");

        System.out.print("Choose you option [1,2,3]: ");
        option = s.nextInt();

        s.close();

        Page22 n = new Page22(num1, num2, option);
        n.display();
        
    }
}