import javax.swing.JOptionPane;
public class Exercise4_TestDisplayingAmenu_FoodStore
{
    public static void main(String[] args) {
        // 0. import encapsulation
        Exercise4_DisplayingAmenu_FoodStore j = new Exercise4_DisplayingAmenu_FoodStore();
        int choice;
        int i = 1;
        
        // 1. display menu
        j.displayMenu();
        
        // i = 1; if i is less than 100 (99); then increase i (iterations) by one
        for(i = 1; i < 100; i++)
        {
            // 2. display choice input
            choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your choice: "));
            // 3. set choice value
            j.setChoice(choice);
            // 4. select conditional statement;
            // any choice that is not 0 will loop continually
            j.choiceStatement();
            // 5. menu display
            j.displayMenu();
            // 6. loop starts again until 0 is chosen
            //
        }
    }
}