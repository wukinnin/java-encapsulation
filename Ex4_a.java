public class Ex4_a {

    private String name;
    private double salary, overtime, grosspay, deductions, netpay; 



    public Ex4_a(String name, double salary, double overtime, double deductions){
        this.name = name;
        this.salary = salary;
        this.overtime = overtime;
        this.deductions = deductions;
    }

    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public double getOvertime(){
        return overtime;
    }
    public double getDeductions(){
        return deductions;
    }
    
    public double getGrosspay() {
        return grosspay;
    }

    public double getNetpay() {
        return netpay;
    }
    
    //---------------------------------------------


    public double computeGrossPay(){
        return grosspay = salary + overtime;
    }
    public double computeNetpay(){
        return netpay = grosspay - deductions;
    }


    public void display(){
        System.out.println("Name: " + name);
        System.out.printf("Php %.2f\n", salary);
        System.out.printf("Php %.2f\n", overtime);
        System.out.printf("Php %.2f\n", deductions);
        System.out.printf("Php %.2f\n", computeGrossPay());
        System.out.printf("Php %.2f\n", computeNetpay());
    }
}