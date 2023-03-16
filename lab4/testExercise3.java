import java.util.Scanner;
public class testExercise3
{
   public static void main (String[] args)
   {
      Scanner s = new Scanner(System.in);
      int n;
      System.out.print("Enter the value of N: ");
      n = s.nextInt();
      s.close();
      
      exercise3 j = new exercise3();
      j.setN(n);
      j.display();
   }
}