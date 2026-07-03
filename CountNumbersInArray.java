import java.util.Scanner;

public class CountNumbersInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Array:");
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        
        System.out.println("\nOutput");
        System.out.println("Positive numbers = " + positiveCount);
        System.out.println("Negative numbers = " + negativeCount);
        System.out.println("Zeros = " + zeroCount);
        
        scanner.close();
    }
}
