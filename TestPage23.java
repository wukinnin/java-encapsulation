import javax.swing.JOptionPane;
public class TestPage23
{
    public static void main(String[] args) 
    {
        int countryNum;
        countryNum = Integer.parseUnsignedInt(JOptionPane.showInputDialog(null, "Enter the number of a country: \n1. Saudi Arabia\n2. United Kingdom\n3. United States\n4. Canada\n5. France\n6. Germany\n7. Italy\n8. Tunisia\n9. Morocco\n10. Algeria"));
        Page23 n = new Page23(countryNum);
        n.display();
    }
}