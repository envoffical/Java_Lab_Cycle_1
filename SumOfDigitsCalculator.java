import java.util.Scanner;

public class SumOfDigitsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Number = ");
        int num = scanner.nextInt();
        
        int temp = Math.abs(num); 
        int sum = 0;
        
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        System.out.println("\nOutput");
        System.out.println("Sum of digits = " + sum);
        
        scanner.close();
    }
}
