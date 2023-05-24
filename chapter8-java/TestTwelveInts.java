import java.util.Scanner;
public class TestTwelveInts
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int nums[] = new int[12];
      for(int i = 0; i < nums.length; i++)
      {
         System.out.print("Enter integer" + "(" + (i+1) + ")" + ":");
         nums[i] = input.nextInt();
      }
      TwelveInts n = new TwelveInts(nums);
      n.displayFtL(); 
      n.displayLtF();
   }
}