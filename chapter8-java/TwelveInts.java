public class TwelveInts
{
   private int nums[] = new int[12];
   public TwelveInts(int[] nums)
   {
      this.nums = nums;
   }
   public int[] getNums()
   {
      return this.nums;
   }
   
   /* Write an application that stores 12 integers in an array. Display the integers from
first to last, and then display the integers from last to first. */
   
   public void displayFtL()
   {
      for(int i = 0; i < nums.length; i++)
      {
         System.out.println(nums[i]);
      }  
   }
   public void displayLtF()
   {
      for(int i = nums.length - 1; i >= 0; --i)
      {
         System.out.println(nums[i]);
      }  
   }
}