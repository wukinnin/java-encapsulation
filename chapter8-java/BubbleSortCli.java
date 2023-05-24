import java.util.Scanner;
public class BubbleSortCli
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int arr[] = new int[10];
      for(int i = 0; i < arr.length; i++)
      {
         arr[i] = input.nextInt();
      }
      BubbleSortBack b = new BubbleSortBack(arr);
      b.displayAscend();
      b.displayDescend();
   }
}