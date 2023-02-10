import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius, height;

        System.out.print("Radius: ");
        radius = scan.nextDouble();
        System.out.print("Height: ");
        height = scan.nextDouble();
        scan.close();

        Ex6_a n = new Ex6_a(radius, height);
        n.display();
    }
}
