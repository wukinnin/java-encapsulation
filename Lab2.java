import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        double salary;

        System.out.print("Enter your name: ");
        name = scan.nextLine();
        System.out.print("Enter your age: ");
        age = scan.nextInt();
        System.out.print("Enter your salary: ");
        salary = scan.nextDouble();
        scan.close();

        // call in encapsulation
        Lab2_a n = new Lab2_a(name, age, salary);
            n.display();
    }
}
