import java.util.Scanner;

public class DataTypeDemonstration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter integer value: ");
        int intVal = scanner.nextInt();
        
        System.out.print("Enter long value: ");
        long longVal = scanner.nextLong();
        
        System.out.print("Enter float value: ");
        float floatVal = scanner.nextFloat();
        
        System.out.print("Enter double value: ");
        double doubleVal = scanner.nextDouble();
        
        System.out.print("Enter character: ");
        char charVal = scanner.next().charAt(0);
        
        System.out.print("Enter boolean: ");
        boolean boolVal = scanner.nextBoolean();
        
        System.out.println("\nExpected Output");
        System.out.println("Integer value : " + intVal);
        System.out.println("Long value    : " + longVal);
        System.out.println("Float value   : " + floatVal);
        System.out.println("Double value  : " + doubleVal);
        System.out.println("Character    : " + charVal);
        System.out.println("Boolean      : " + boolVal);
        
        scanner.close();
    }
}
