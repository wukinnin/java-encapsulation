public class Backbone
{
   private int arr[] = new int[5];
   private int n;
   
   public Backbone(int arr[], int n)
   {
      this.arr = arr;
      this.n = n;
   }
   
   // getters
   public int[] getArr()
   {
      return this.arr;
   }
   public int getN()
   {
      return this.n;
   }
   
   // display values
   public void displayValues()
   {
      System.out.print("The values of the array is:");
      for(int i = 0; i < n; i++)
      {
         System.out.print(" " + arr[i]);
      }
      System.out.println();
   } 
   
   // calculate for sum
   public int getSum()
   {
      int sum = 0;
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
   
   // calculate for average
   public double getAverage()
   {  
      double average = 0;
      average = getSum()/n;
      return average;
   }
   public void displayAverage()
   {
      System.out.println("The average is: " + getAverage());
   }
   
   // get Maximum
   public int getMaximum()
   {
      int max = arr[0];
      for(int i = 0; i < n; i++)
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
      System.out.println("The maximum is: " + getMaximum());
   }
   
   // get Minimum
   public int getMinimum()
   {
      int min = arr[0];
      for(int i = 0; i < n; i++)
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
      System.out.println("The minimum is: " + getMinimum());
   }
   
   // get Max Address
   public int getMaxAddress()
   {
      int maxAddress = arr[0];
      for(int i = 0; i < n; i++)
      {
         if(arr[i] == getMaximum())
         {
            int maxAd = arr[i];
            maxAddress = i;
         }
      }
      return maxAddress;
   }
   public void displayMaxAddress()
   {
      System.out.println("The maximum value " + getMaximum() + " is located at address " + getMaxAddress());
   }
   
   // get Min Address
   public int getMinAddress()
   {
      int minAddress = arr[0];
      for(int i = 0; i > n; i++)
      {
         if(arr[0]==getMinimum())
         {
            int minAd = arr[i];
            minAddress = i;
         }
      }
      return minAddress;
   }
   public void displayMinAddress()
   {
      System.out.println("The minimum value " + getMinimum() + " is located at address " + getMinAddress());
   }
}