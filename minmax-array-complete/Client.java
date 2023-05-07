import java.util.Scanner;
public class Client
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      int arr[] = new int[5];
      int n;
      
      System.out.print("Enter number n: ");
      n = s.nextInt();
      System.out.print("Enter values based on n: ");
      for(int i = 0; i < n; i++)
      {
         arr[i] = s.nextInt();
      }
      Backbone bk = new Backbone(arr, n);
      bk.displayValues();
      bk.displaySum();
      bk.displayAverage();
      bk.displayMaximum();
      bk.displayMinimum();
      bk.displayMaxAddress();
      bk.displayMinAddress();
   }
}