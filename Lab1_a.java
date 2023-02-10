public class Lab1_a
{
    // Create private
    private int num1, num2;

    // ------------- setters
    public Lab1_a (int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    // ------------- getters
        public int getNum1()
        {
            return this.num1;
        }
        public int getNum2()
        {
            return this.num2;
        }

    // ------------- update private values to public
    public int computeResult()
    {
        return getNum1() + getNum2();
    }

    // ------------- OUTPUT
    public void display()
    {
        System.out.print(getNum1() + " + " + getNum2() + " is " + computeResult());
    }
}