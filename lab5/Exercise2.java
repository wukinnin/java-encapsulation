public class Exercise2
{
    private double num1, num2;
    private int select;

    public Exercise2(double num1, double num2, int select)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.select = select;
    }

    public double getNum1()
    {
        return this.num1;
    }
    public double getNum2()
    {
        return this.num2;
    }
    public int getSelect()
    {
        return this.select;
    }
    
    // methods begin

    public void add()
    {
        double sum = num1 + num2;
        System.out.printf("\n>> %.2f plus %.2f equals %.2f", num1, num2, sum);
    }
    public void subtract()
    {
        double difference = num1 - num2;
        System.out.printf("\n>> %.2f minus %.2f equals %.2f", num1, num2, difference);
    }
    public void multiply()
    {
        double product = num1 * num2;
        System.out.printf("\n>> %.2f multiplied by %.2f equals %.2f", num1, num2, product);
    }
    public void divide()
    {
        double quotient = num1 / num2;
        System.out.printf("\n>> %.2f divided by %.2f equals %.2f", num1, num2, quotient);
    }
   
    
}