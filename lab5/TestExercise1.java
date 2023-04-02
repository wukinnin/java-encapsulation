import java.util.*;

public class TestExercise1
{
   public static void main (String[] args)
   {
      Scanner s = new Scanner(System.in);
      char upper, lower;
      double sqrt1, sqrt2;
      
      // refer to object
      Exercise1 j = new Exercise1();
      
      // prompt
      System.out.print("Enter a character: ");
      upper = s.next().charAt(0);
      System.out.print("Enter a character: ");
      lower = s.next().charAt(0);
      System.out.print("Enter a number: ");
      sqrt1 = s.nextDouble();
      System.out.print("Enter a number: ");
      sqrt2 = s.nextDouble();
      System.out.println();
      s.close();
    
      // display
      System.out.println("The uppercase of " + upper + " is : " + j.toUppercase(upper));
      System.out.println("The lowercase of " + upper + " is : " + j.toLowercase(lower));
      System.out.println("Math.sqrt(" + String.format("%.0f", sqrt1) + ") = " + String.format("%.1f", j.toSqrt1(sqrt1)));
      System.out.println("Math.sqrt(" + String.format("%.0f", sqrt2) + ") = " + String.format("%.1f", j.toSqrt1(sqrt2)));
      
   }
}