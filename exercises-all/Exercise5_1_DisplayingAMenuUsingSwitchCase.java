import javax.swing.JOptionPane;
public class Exercise5_1_DisplayingAMenuUsingSwitchCase {
    private int countryNum;
    public Exercise5_1_DisplayingAMenuUsingSwitchCase(int countryNum)
    {
        this.countryNum = countryNum;
    }
    public int getCountryNum()
    {
        return this.countryNum;
    }
    // ---------------------
    public void display()
    {
        switch(getCountryNum())
        {
            case 1:
            JOptionPane.showMessageDialog(null, "The Capital of Saudi Arabia is Riyadh.");
            break;
            case 2:
            JOptionPane.showMessageDialog(null, "The Capital of the UK is London.");
            break;
            case 3:
            JOptionPane.showMessageDialog(null, "The Capital of the USA is Washington");
            break;
            case 4: // factually accurate capital of Canada is Ontario, not Montreal
            JOptionPane.showMessageDialog(null, "The Capital of Canada is Ontario.");
            break;
            case 5:
            JOptionPane.showMessageDialog(null, "The Capital of France is Paris.");
            break;
            case 6:
            JOptionPane.showMessageDialog(null, "The Capital of Germany is Berlin.");
            break;
            case 7:
            JOptionPane.showMessageDialog(null, "The Capital of Italy is Rome.");
            break;
            case 8:
            JOptionPane.showMessageDialog(null, "The Capital of Tunisia is Tunis.");
            break;
            case 9:
            JOptionPane.showMessageDialog(null, "The Capital of Morocco is Rabat.");
            break;
            case 10:
            JOptionPane.showMessageDialog(null, "The Capital of Algeria is Alger.");
            break;
            default:
            JOptionPane.showMessageDialog(null, "Invalid option.");
            break;
        }
    }

}