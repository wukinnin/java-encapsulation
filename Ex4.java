import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        double salary, overtime, deductions;

        System.out.print("Name: ");
        name = scan.nextLine();
        System.out.print("Salary: ");
        salary = scan.nextDouble();
        System.out.print("Deductions: ");
        deductions = scan.nextDouble();
        System.out.print("Overtime: ");
        overtime = scan.nextDouble();
       

        scan.close();

        Ex4_a n = new Ex4_a(name, salary, overtime, deductions);
        n.display();

    }
}
