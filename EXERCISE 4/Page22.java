public class Page22
{
    private int num1, num2, option;
    public Page22(int num1, int num2, int option)
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
    public int getOption()
    {
        return this.option;
    }
    /// -------
    public void display()
    {
        if(getOption()==1) // sum
        {
            int sum = getNum1() + getNum2();
            System.out.print("Sum: " + getNum1() + " + " + getNum2() + " = " + sum);   
        }
        else if(getOption()==2) // sum, average
        {  
            int sum = getNum1() + getNum2();
            System.out.print("Sum: " + getNum1() + " + " + getNum2() + " = " + sum);
            
            double average = (double)sum/2;
            System.out.printf("\nAverage: %d and %d = %.1f", getNum1(), getNum2(), average);      
        }
        else if(getOption()==3)
        {
            int sum = getNum1() + getNum2();
            System.out.print("Sum: " + getNum1() + " + " + getNum2() + " = " + sum);
            
            double average = (double)sum/2;
            System.out.printf("\nAverage: %d and %d = %.1f", getNum1(), getNum2(), average);   
            
            // max
            System.out.println("Max\t\t: " + getNum1() + " and " + getNum2() + " = " + Math.max(getNum1(), getNum2()));
            // min
            System.out.println("Min\t\t: " + getNum1() + " and " + getNum2() + " = " + Math.min(getNum1(), getNum2()));
        }
        else
        {
            System.out.println("No.");
        }
    }
}