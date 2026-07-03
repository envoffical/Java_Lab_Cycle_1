import java.util.Scanner;

public class SwapNumbers {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter first number: "); // Prompt the user
        int a = x.nextInt();
        System.out.print("Enter second number: "); // Prompt the user
        int b = x.nextInt();

        // 1. Keep a backup of the original user inputs
        int backupA = a;
        int backupB = b;

        System.out.println("--- Method 1: Using Temporary Variable ---");
        System.out.println("Before Swap:\nA = " + a + "\nB = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap:\nA = " + a + "\nB = " + b);

        System.out.println("\n--- Method 2: Without Temporary Variable ---");
        
        // 2. Restore the original user inputs so Method 2 starts fresh
        a = backupA; 
        b = backupB;
        
        System.out.println("Before Swap:\nA = " + a + "\nB = " + b);

        a = a + b; 
        b = a - b; 
        a = a - b; 

        System.out.println("After Swap:\nA = " + a + "\nB = " + b);

        x.close(); // Good practice to close scanner
    }
}
