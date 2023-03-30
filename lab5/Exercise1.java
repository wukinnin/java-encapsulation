import java.lang.Character.*;
import java.lang.Math.*;

public class Exercise1
{
   private char letter1, letter2;
   private double num1, num2;
   public Exercise1(char letter1, char letter2, double num1, double num2)
   {
      this.letter1 = letter1;
      this.letter2 = letter2;
      this.num1 = num1;
      this.num2 = num2;
   }
    
   // start getters
   public char getLetter1()
   {
      return this.letter1;
   }
   public char getLetter2()
   {
      return this.letter2;
   }
   public double getNum1()
   {
      return this.num1;
   }
   public double getNum2()
   {
      return this.num2;
   }
   // end getters
   
   // start methods
   public void toUppercase1()
   {
      System.out.printf("\nThe uppercase of %c is: ", letter1);
      System.out.print(Character.toUpperCase(letter1));
   }
   public void toUppercase2()
   {
      System.out.printf("\nThe lowercase of %c is: ", letter2);
      System.out.print(Character.toUpperCase(letter2));
   }
   public void sqrNum1()
   {
      System.out.printf("\nMath.sqrt(%.0f) = ", num1);
      double finNum1 = Math.sqrt(num1);
      System.out.printf("%.1f", finNum1);
   }
   public void sqrNum2()
   {
      System.out.printf("\nMath.sqrt(%.0f) = ", num2);
      double finNum2 = Math.sqrt(num2);
      System.out.printf("%.1f", finNum2);
   }
   // end methods
}