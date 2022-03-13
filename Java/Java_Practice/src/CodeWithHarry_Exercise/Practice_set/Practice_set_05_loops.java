package CodeWithHarry_Exercise;

/**
 * Practice_set_05_loops
 */
public class Practice_set_05_loops {
    public static void problem1() {
        // ? Question 1: Write a program to print the following pattern :
        // ****
        // ***
        // **
        // *
        byte i = 4;
        while (i >= 0) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            i--;
        }
    }

    public static void problem2() {
        // ? Question 2: Write a program to sum first n even numbers using a while loop.
        int sum = 0, n = 100;
        while (n > 0) {
            sum += n;
            n--;
        }
        System.out.println("sum: " + sum);
    }

    public static void problem3() {
        // ? Question 3: Write a program to print the multiplication table of a given
        // number n.
        byte n = 5, i = 1;
        while (i < 11) {
            System.out.println(n + " x " + i + " => " + n * i);
            i++;
        }
    }

    public static void problem4() {
        // ? Question 4: Write a program to print a multiplication table of 10 in
        // reverse order.

        byte n = 5, i = 10;
        while (i > 0) {
            System.out.println(n + " x " + i + " => " + n * i);
            i--;
        }
    }

    public static void problem5() {
        // ? Question 5: Write a program to find the factorial of a given number using
        // for loops.
        int n = 5, factorial = 1;
        for (byte i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + n + " is :" + factorial);
    }

    public static void problem6() {
        // ? Question 6: Repeat problem 5 using a while loop.
        int n = 5, factorial = 1;
        byte i = 2;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("The factorial of " + n + " is :" + factorial);
    }

    public static void problem7() {
        // ? Question 7: Repeat problem 1 using for/while loop.

        byte n = 4;
        byte i = n, j = 0;
        while (i > 0) {
            j = 0;
            while (j < i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    public static void problem9() {
        // ? Question 9: Write a program to calculate the sum of the numbers occurring
        // in the multiplication table of 8.
        byte n = 8, i = 1;
        int sum = 0;
        while (i <= n) {
            sum += n * i;
            i++;
        }
        System.out.println("sum ->" + sum);
    }

    public static void main(String[] args) {
        // problem1();
        // problem2();
        // problem3();
        // problem4();
        // problem5();
        // problem6();
        // problem7();
        problem9();
    }
}