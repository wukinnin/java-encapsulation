public class Exercise1_SumOfNnumbers{
    private int n, i, sum;
    
    // setters
    public void setN(int n)
    {
        this.n = n;
    }
    // getters
    public int getN()
    {
        return this.n;
    }

    public void display()
    {
        for(i = 1; i <= getN(); i++)
        {
            sum = sum+i;
        }
        System.out.print("The sum is: " + sum);
    }
}
