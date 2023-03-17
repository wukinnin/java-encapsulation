public class Exercise2_FactorialOfANumber {
    private int n;
    private int fact = 1;
    private int i = 1;
    
    //setters
    public void setN(int n)
    {
        this.n = n;
    }
    //getters
    public int getN()
    {
        return this.n;
    }

    public void display()
    {
        while (i <= n) {
            fact = fact*i;
            i++;
        }
        System.out.print("Factorial is: " + fact);
    }
}
