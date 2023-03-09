public class Page24
{
    private int num1, num2;
    private char option;
    public Page24(int num1, int num2, char option)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.option = option;
    }
    public int getNum1()
    {
        return this.num1;
    }
    public int getNum2()
    {
        return this.num2;
    }
    public char getOption()
    {
        return this.option;
    }
    // ---------------------
    public void display()
    {
        switch(getOption())
        {
            case 'A':
            int sum = getNum1() + getNum2();
            System.out.print("The answer is: " + sum);
            break;
            case 'S':
            int difference = getNum1() - getNum2();
            System.out.print("The answer is: " + difference);
            break; 
            case 'M':
            int product = getNum1() * getNum2();
            System.out.print("The answer is: " + product);
            break;
            case 'D':
            int quotient = getNum1() / getNum2();
            System.out.print("The answer is: " + quotient);
            break;
            default:
            System.out.print("Invalid option.");
            break;
        }

    }
    
}