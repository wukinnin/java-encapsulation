import java.util.*;

public class TestExercise1
{
   public static void main (String[] args)
   {
      Scanner s = new Scanner(System.in);
      char letter1, letter2;
      double num1, num2;
      
      System.out.print("");
      letter1 = s.next().charAt(0);
      System.out.print("");
      letter2 = s.next().charAt(0);
      System.out.print("");
      num1 = s.nextDouble();
      System.out.print("");
      num2 = s.nextDouble();
      
      Exercise1 j = new Exercise1(letter1, letter2, num1, num2);
      j.toUppercase1();
      j.toUppercase2();
      j.sqrNum1();
      j.sqrNum2();
      
      
      
   }
}
