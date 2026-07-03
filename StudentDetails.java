import java.util.Scanner;

public class StudentDetails
{
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Read student details from the user
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        System.out.print("Course: ");
        String course = scanner.nextLine();

        System.out.print("Percentage: ");
        double percentage = scanner.nextDouble();

        // Display the formatted output
        System.out.println("\nStudent Details");
        System.out.println("---------------");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Course     : " + course);
        System.out.println("Percentage : " + percentage);

        // Close the scanner
        scanner.close();
    }
}
