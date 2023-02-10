// declare private
public class Lab2_a {
    private String name;
    private int age;
    private double salary;

    // constructor
    public Lab2_a(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // getters
    public String getString() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // method
    public void display() {
        System.out.print("Your name is " + name + " at age of " + age);
        System.out.printf(" and has a salary of PHP %.2f", salary);
    }
}
