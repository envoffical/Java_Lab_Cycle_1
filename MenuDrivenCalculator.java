import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Operations:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();
        
        System.out.print("A = ");
        int a = scanner.nextInt();
        System.out.print("B = ");
        int b = scanner.nextInt();
        
        System.out.println("\nOutput");
        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;
            case 2:
                System.out.println("Result = " + (a - b));
                break;
            case 3:
                System.out.println("Result = " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is undefined.");
                }
                break;
            default:
                System.out.println("Invalid Choice!");
        }
        
        scanner.close();
    }
}
