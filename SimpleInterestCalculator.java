import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Rate: ");
        double rate = scanner.nextDouble();
        
        System.out.print("Time: ");
        double time = scanner.nextDouble();
        
        double si = (principal * rate * time) / 100;
        double amount = principal + si;
        
        System.out.println("\nSimple Interest = " + (int)si);
        System.out.println("Amount = " + (int)amount);
        
        scanner.close();
    }
}
