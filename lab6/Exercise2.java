public class Exercise2
{
   // declare variables
   private String id, desc;
   private double unitPrice;
   private int qty;
   
   // create constructor
   public Exercise2(String id, String desc, double unitPrice, int qty)
   {
      this.id = id;
      this.desc= desc;
      this.unitPrice = unitPrice;
      this.qty = qty;
   }
   
   // set mutators
   public void setQty(int qty)
   {
      this.qty = qty;
   }
   public void setUnitPrice(double unitPrice)
   {
      this.unitPrice = unitPrice;
   }
   
   // get accessors
   public String getID()
   {
      return this.id;
   }
   public int getQty()
   {
      return this.qty;
   }
   public String getDesc()
   {
      return this.desc;
   }
   public double getUnitPrice()
   {
      return this.unitPrice;
   }
   
   // return total price
   public double getTotal()
   {
      return unitPrice*qty;
   }
   
   // return information
   public String toString()
   {
      return "ID:\t\t\t\t: " + getID() + "\nDESCRIPTION\t\t: " + getDesc() + "\nPRICE\t\t\t\t: " + "Php " + String.format("%.2f", getUnitPrice()) + "\nQUANTITY\t\t\t: " + getQty() + "\nTOTAL\t\t\t\t: " + "Php " +  String.format("%.2f", getTotal());
   }

}