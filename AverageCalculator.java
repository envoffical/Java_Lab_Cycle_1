import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        
        double average = (num1 + num2 + num3) / 3.0;
        
        System.out.println("\nOutput");
        System.out.printf("Average = %.1f\n", average);
        
        scanner.close();
    }
}
