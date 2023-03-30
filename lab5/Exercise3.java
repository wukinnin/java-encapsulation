public class Exercise3 {
    private int num;
    public Exercise3(int num)
    {
        this.num = num;
    }
    public int getNum()
    {
        return this.num;
    }

    public void counter()
    {
        for(int i = 0; i<getNum(); i++)
        {
            System.out.println(i+1);
        }
    }

}
