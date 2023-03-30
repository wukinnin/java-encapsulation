import java.util.Scanner;
public class Exercise4 {

    // similar in use to Math.max()
    public static int maxNum(int num1, int num2)
    {
        if(num1 > num2)
        {
            return num1;
        }
        else
        {
            return num2;
        }
    }

    // similar in use to Math.max()
    public static double maxNum(double doub1, double doub2)
    {
        if(doub1 > doub2)
        {
            return doub1;
        }
        else
        {
            return doub2;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num1, num2;
        double doub1, doub2;
        
        System.out.println("| Enter any two integers ");
        System.out.print("Integer #1 > ");
        num1 = s.nextInt();
        System.out.print("Integer #2 > ");
        num2 = s.nextInt();
        System.out.println("| Now, enter any two floating numbers ");
        System.out.print("Double #1 > ");
        doub1 = s.nextDouble();
        System.out.print("Double #2 > ");
        doub2 = s.nextDouble();
        s.close();

        int result1 = maxNum(num1, num2);
        System.out.println("--> The maximum number between " + num1 + " and " + num2 + " is " + result1);
        
        double result2 = maxNum(doub1, doub2);
        System.out.println("--> The maximum number between " + doub1 + " and " + doub2 + " is " + result2);
    }    
}
