import java.util.*;
import java.lang.*;

// bubble sort algorithm is used.


public class BubbleSortBack
{
   private int arr[] = new int[10];
   public BubbleSortBack(int[] arr)
   {
      this.arr = arr;
   }
   public int[] getArr()
   {
      return this.arr;
   }
   
   // using the bubble sort algorithm
   public void displayAscend()
   {
      int temp;
      for(int i = 0; i < arr.length ; i++)
      {
         for(int j = i+1; j < arr.length; j++)
         {
            // for ascending sort code, use greater than sign.
            if(arr[i] > arr[j])
            {
              temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
            }
         }
      }

      System.out.println();
      for(int sort : arr)
      {
         System.out.print(sort + " ");
      }         
   }
   
   // using the bubble sort algorithm
   public void displayDescend()
   {
      int temp;
      for(int i = 0; i < arr.length ; i++)
      {
         for(int j = i+1; j < arr.length; j++)
         {
            // for descending sort code, use less than sign.
            if(arr[i] < arr[j])
            {
              temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
            }
         }
      }
      
      System.out.println();
      for(int sort : arr)
      {
         System.out.print(sort + " ");
      }    
      
   }
}