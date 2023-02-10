public class Ex6_a {
    private double radius, height, volume;
    private double PI = 3.1416;

    public Ex6_a(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return volume;
    }
    public double getPI(){
        return PI;
    }

    public double calculateVolume(){
        return volume = PI*radius*radius*height/3;
    }

    public void display()
    {
        System.out.printf("The volume of a cone is: %.2f", calculateVolume());
    }
}
