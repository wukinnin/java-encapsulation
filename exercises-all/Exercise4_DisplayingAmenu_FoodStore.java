import javax.swing.JOptionPane;
public class Exercise4_DisplayingAmenu_FoodStore
{
   /* 
      Create your own java program using any looping statements that will display a menu in a food store
      Choose an item using the number (1, 2, or 3) that corresponds to the item, or to enter 0 to quit the application.
   */
   
   private int choice;
   private double burger = 25.00;
   private double coke = 25.00;
   private double fries = 15.00;
   private double total = 0.00;

   //setters
   public void setChoice(int choice)
   {
      this.choice = choice;
   }
   //getters
   public int getChoice()
   {
      return this.choice;
   }

   //displayMenu
   public void displayMenu()
   {
      JOptionPane.showMessageDialog(null, "\nJUAN FOOD STORE\n************************\n(1) Burger   Php 25.00\n(2) Coke      Php 25.00\n(3) Fries       Php 15.00\n(0) Exit\n************************");
   }

   //if statement
   public void choiceStatement()
   {
      if(getChoice()==1)
      {
      // add assignment operator "+=" to add burger value to total (0.00 + 25.00)
         total+=burger;
      }
      else if(getChoice()==2)
      {
         total+=coke;
      }
      else if(getChoice()==3)
      {
         total+=fries;
      }
      else if(getChoice()==0)
      {
         JOptionPane.showMessageDialog(null, "Total Cost: Php " + total + "0");
         System.exit(0);
      }
      else
      {
         JOptionPane.showMessageDialog(null, "Invalid Option. Exiting.");
         System.exit(0);
      
      }
   }
}