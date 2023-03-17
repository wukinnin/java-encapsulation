public class Exercise3_SumAndAverageofNnumbers
{
   private int n, average;
   private int sum = 0;
   private int i = 1;
   
   //setters
   public void setN(int n)
   {
      this.n = n;
   }
   //getters
   public int getN()
   {
      return this.n;
   }
   
   public void display()
   {
      do
      {
         sum = sum+i;
         average = sum/n;
         i++;
      }
      while(i <= n);
      
      System.out.println("Sum is: " + sum);
      System.out.print("Average is: " + average);
   }
}