import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("\nSearch: ");
        int searchElement = scanner.nextInt();
        
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == searchElement) {
                position = i + 1; 
                break;
            }
        }
        
        System.out.println("\nOutput");
        if (position != -1) {
            System.out.println("Element found at position " + position);
        } else {
            System.out.println("Element not found in the array.");
        }
        
        scanner.close();
    }
}
