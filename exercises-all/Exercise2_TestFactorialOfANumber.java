import java.util.Scanner;
public class Exercise2_TestFactorialOfANumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of N: ");
        n = s.nextInt();
        s.close();

        Exercise2_FactorialOfANumber j = new Exercise2_FactorialOfANumber();
        j.setN(n);
        j.display();
    }
}
