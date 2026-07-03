public class ArithmeticOperations
{
    public static void main(String[] args) {
        // Input values
        int a = 20;
        int b = 6;

        // Performing operations
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        
        // Note: Integer division drops the decimal remainder (20 / 6 = 3)
        int division = a / b; 
        
        // Modulus returns the remainder of the division (20 % 6 = 2)
        int modulus = a % b; 

        // Displaying outputs
        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);
        System.out.println("Modulus = " + modulus);
    }
}