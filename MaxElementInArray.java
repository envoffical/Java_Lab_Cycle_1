import java.util.Scanner;

public class MaxElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("N = ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("\nOutput");
        System.out.println("Largest element = " + max);
        
        scanner.close();
    }
}
