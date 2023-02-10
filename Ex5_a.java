public class Ex5_a {
    private double price, salesTax, finalPrice;

    private double taxRate = 0.12;

    public Ex5_a(double price) {
        this.price = price;
    }
    
    public double getPrice(){
        return price;
    }
    public double getTaxRate(){
        return taxRate;
    }
    public double computeSalesTax(){
        return salesTax = price * taxRate;
    }
    public double computeFinalPrice(){
        return finalPrice = price + salesTax;
    }
    public double getFinalPrice() {
        return finalPrice;
    }
    
    public void display(){
        System.out.printf("Sales Tax: Php%.2f\n", computeSalesTax());
        System.out.printf("Final Price: Php%.2f\n", computeFinalPrice());
    }
}