import java.util.*;
import java.lang.*;

public class Main
{
   public static void main(String[] args)
   {
      String fullname, email;
      int password;
      Scanner s = new Scanner(System.in);
      
      // prompt
      fullname = s.nextLine();
      email = s.nextLine();
      // maximum is 8 characters
      password = s.nextInt();
      
      System.out.println("");
      
      
      // instantiate
      Register r = new Register(fullname, email, password);
      r.verifyPassword();
     
            
   }
}