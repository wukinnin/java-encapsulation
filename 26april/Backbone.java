import java.lang.Math;
public class Backbone
{
   private int arr[] = new int[5];
   private int n;
   private int sum = 0;
   private double average = 0;
    
   public Backbone(int n, int arr[])
   {
      this.n = n;
      this.arr = arr;
   }
   public int getN()
   {
      return this.n;
   }
   public int[] getArr()
   {
      return this.arr;
   }
   
   // display
   public void display()
   {
      System.out.print("The values in the array are:");
      for(int i = 0; i < n; i++)
      {
         System.out.print(" " + arr[i]);
      }
      System.out.println();
   }
   
   // get sum
   public int getSum()
   {
      for(int i = 0; i < n; i++)
      {
         sum = sum+arr[i];
      }
      return sum;
   }
   public void displaySum()
   {
      System.out.println("The sum is: " + getSum());
   }
   
   // get average
   public double getAverage()
   {
      average = sum/n;
      return average;
   }
   public void displayAverage()
   {
      System.out.println("The average is: " + getAverage());
   }
   
   // get maximum
   public int getMaximum()
   {
      int max = arr[0];
      for (int i = 0; i < n; i++)
      {
         if(arr[i] > max)
         {
            max = arr[i];   
         }
      }
      return max;
   }
   public void displayMaximum()
   {
      System.out.println("The maximum value is: " + getMaximum());
   }
   
   // get minimum
   public int getMinimum()
   {
      int min = arr[0];
      for (int i = 0; i < n; i++)
      {
         if(arr[i] < min)
         {
            min = arr[i];
         }
      }
      return min;
   }
   public void displayMinimum()
   {
      System.out.println("The minimum value is: " + getMinimum());
   }
   
   // nextL find index of maxiumum and index of minimum
   
}