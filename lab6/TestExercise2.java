import java.util.Scanner;
public class TestExercise2
{
   public static void main (String[] args)
   {
      Scanner s = new Scanner(System.in);
      String id, desc;
      double unitPrice;
      int qty;
      
      // input id, desc, qty, and unitPrice
      id = s.nextLine();
      desc = s.nextLine();
      unitPrice = s.nextDouble();
      qty = s.nextInt();
      
      // create object
      Exercise2 j = new Exercise2(id, desc, unitPrice, qty);
      
      // display info to string
      System.out.print(j.toString());
   }
}