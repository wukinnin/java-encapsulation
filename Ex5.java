import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price;

        System.out.print("Name: ");
        price = scan.nextDouble();
        scan.close();

        Ex5_a n = new Ex5_a(price);
        n.display();

    }
}
