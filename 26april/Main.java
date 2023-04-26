import java.util.Scanner;
public class Main
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      int arr[] = new int[5];
      int n;
      int sum = 0;
      int average = 0;
      
      System.out.print("Enter the size of the array: ");
      n = s.nextInt();
      
      System.out.println("Enter the integer values in the array");
      for(int i = 0; i < n; i++)
      {
         arr[i] = s.nextInt();
      }
      
      Backbone j = new Backbone(n, arr);
      j.display();
      j.displaySum();
      j.displayAverage();
      j.displayMaximum();
      j.displayMinimum();
   }
   
}