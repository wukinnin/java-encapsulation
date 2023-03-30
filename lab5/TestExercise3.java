import java.util.Scanner;
public class TestExercise3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.print("Enter number: ");
        num = s.nextInt();
        s.close();

        for(int i = 1; i<=num; i++)
        {
            Exercise3 j = new Exercise3(num);
            j.counter();
        }
    }
}
