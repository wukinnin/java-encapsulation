import java.util.Scanner;

public class testExercise1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        System.out.print("Enter the value of N: ");
        n=s.nextInt();
        s.close();

        exercise1 j = new exercise1();
        j.setN(n);
        j.display();


    }
}
