import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int walk; 
        int prep; 
        int workTime; 
    
        System.out.print("Enter time in minutes to walk: "); 
        walk = input.nextInt(); 
        System.out.print("Enter time in minutes to prepare: "); 
        prep = input.nextInt(); 
        System.out.print("Enter to report to work: "); 
        workTime = input.nextInt(); 
        input.close();
    
        Ex7_a n = new Ex7_a(walk, prep, workTime); 
        n.displayTime();
       } 
    }