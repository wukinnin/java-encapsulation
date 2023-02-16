import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int distance, speed;

        System.out.print("Enter distance (km): ");
        distance = s.nextInt();
        System.out.print("Enter speed (km/hr): ");
        speed = s.nextInt();
        s.close();

        Ex8_a t = new Ex8_a(distance, speed);
        t.displayTime();

    }
}
