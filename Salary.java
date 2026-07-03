import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Read basic salary
        System.out.print("Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Perform salary calculations
        double da = basicSalary * 0.10;
        double hra = basicSalary * 0.15;
        double grossSalary = basicSalary + da + hra;

        // Display the output (formatted to remove decimals for whole numbers)
        System.out.println("\nOutput");
        System.out.printf("DA = %.0f\n", da);
        System.out.printf("HRA = %.0f\n", hra);
        System.out.printf("Gross Salary = %.0f\n", grossSalary);

        // Close the scanner
        scanner.close();
    }
}
