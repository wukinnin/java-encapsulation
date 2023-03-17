import java.util.Scanner;

public class Exercise1_TestSumOfNnumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        System.out.print("Enter the value of N: ");
        n=s.nextInt();
        s.close();

        Exercise1_SumOfNnumbers j = new Exercise1_SumOfNnumbers();
        j.setN(n);
        j.display();


    }
}
