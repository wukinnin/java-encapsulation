public class Register
{
   private String fullname, email, passString;
   private int password, spaceIndex, passCount;
   
   // setters
   public Register(String fullname, String email, int password)
   {
      this.fullname = fullname;
      this.email = email;
      this.password = password;
   }
   
   // getters
   public String getFullName()
   {
      return this.fullname;
   }
   public String getEmail()
   {
      return this.email;
   }
   public int getPassword()
   {
      return this.password;
   }
   
   
   public void verifyPassword()
   {
      // convert int password to String
      passString = Integer.toString(password);
      // count length
      passCount = passString.length();
      
      // check password length validity
      // maximum is 8
      if (passCount>=8)
      {
         System.out.print("Password is valid");
         displayInfo(); 
      }
      else
      {
         System.out.print("Password is invalid");
      }
   
   }
   // complete registration
   public void displayInfo()
   {
      // determine spaces' index using indexOf()
      spaceIndex = fullname.indexOf(" ");
      
      // determine space " " characters  via if statements
      if(spaceIndex>0)
      {
         System.out.println("\nWelcome to PSO " + this.fullname.substring(0, spaceIndex) + "!");
         System.out.println("Full name: " + this.fullname.toUpperCase());
         System.out.println("Email: " + this.email.toLowerCase());
      }
      else
      {
         System.out.println("You cannot proceed");
      }
   }
      
}