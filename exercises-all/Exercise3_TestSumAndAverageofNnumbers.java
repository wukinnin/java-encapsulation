import java.util.Scanner;
public class Exercise3_TestSumAndAverageofNnumbers
{
   public static void main (String[] args)
   {
      Scanner s = new Scanner(System.in);
      int n;
      System.out.print("Enter the value of N: ");
      n = s.nextInt();
      s.close();
      
      Exercise3_SumAndAverageofNnumbers j = new Exercise3_SumAndAverageofNnumbers();
      j.setN(n);
      j.display();
   }
}