import java.util.Scanner;
public class testExercise2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of N: ");
        n = s.nextInt();
        s.close();

        exercise2 j = new exercise2();
        j.setN(n);
        j.display();
    }
}
