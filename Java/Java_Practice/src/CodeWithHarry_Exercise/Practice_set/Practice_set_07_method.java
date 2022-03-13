package CodeWithHarry_Exercise.Practice_set;

public class Practice_set_07_method {
    static void multiplicationTable(int n) {
        // ? 1. Write a Java method to print the multiplication table of a number n.
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    static void pattern(int row) {
        // ? 2. Write a program using functions to print the following
        // *
        // **
        // ***
        // ****
        for (int i = 1; i < row; i++) {
            // printing before space
            for (int l = 0; l < (row - i); l++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sumOfNNaturalNumber(int n) {
        // ? 3. Write a recursive function to calculate the sum of first n natural
        // numbers.

        if (n == 1) {
            return 1;
        } else {

            return n + sumOfNNaturalNumber(n - 1);
        }
    }

    static void reversePattern(int row) {
        // ? 4. Write a program using functions to print the following
        // ****
        // ***
        // **
        // *
        for (int i = row; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int nthFibonacci(int n) {
        // ? 5. Write a function to print the nth term of the Fibonacci series using
        // recursion.
        if (n == 2 || n == 1) {
            return n - 1;
        }
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);

    }

    static float average(int... numbers) {
        // ? 6. Write a function to find the average of a set of numbers passed as
        // arguments.

        float sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        float result = sum / numbers.length;
        return result;
    }

    static void patternRecursive(int n) {
        // ? 7. Repeat problem 4 using Recursion.

        if (n > 0) {
            patternRecursive(n - 1);

            for (byte i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void patternReverseRecursive(byte n) {
        // ? 8. Repeat problem 2 using Recursion
        if (n > 0) {
            patternRecursive(n - 1);

            for (byte i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        // multiplicationTable(19);
        // pattern(10);
        // System.out.println("Sum of 5 number is: " + sumOfNNaturalNumber(5));
        // reversePattern(10);
        // System.out.println("10th term of fibonacci is: " + nthFibonacci(10));
        // System.out.printf("average is: %.3f", average(50, 20, 30, 60, 2, 4, 8, 64));
        patternRecursive(5);
    }
}
