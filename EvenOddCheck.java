public class EvenOddCheck {
    public static void main(String[] args) {
        // Test Input 1
        int number1 = 24;
        checkEvenOrOdd(number1);

        // Test Input 2
        int number2 = 17;
        checkEvenOrOdd(number2);
    }

    public static void checkEvenOrOdd(int number) {
        // A number is even if the remainder when divided by 2 is 0
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}