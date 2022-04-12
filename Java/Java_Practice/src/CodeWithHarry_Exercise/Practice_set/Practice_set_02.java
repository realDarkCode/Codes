
import java.util.Scanner;

public class Practice_set_02 {
    static void problem1() {
        // ? What will be the result of the following expression:
        float a = 7 / 4 * 9 / 2;
        System.out.println(a);
    }

    static void problem2() {
        // ? Write a java program to encrypt a grade by adding 8 to it. Decrypt it to
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char) (grade - 8);
        System.out.println(grade);
    }

    static void problem3() {
        // ? Use comparison operators to find out whether a given number is greater than
        // the user entered number or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a the number to check given number is greater than 66 or not.");
        int number = sc.nextInt();
        System.out.println(number + " is greater than 66 : ");
        System.out.println(number > 66);
        sc.close();

    }

    static void problem4() {
        // ? Write the following expression in a java program:
        // * (v^2-u^2)/2as
        int v = 5, u = 4, a = 1, s = 2;
        int result = (v * v - u * u) / (a * s * 2);
        System.out.println(result);
    }

    static void problem5() {
        // ? Find the value of 'a' in expression given below
        // int x = 7;
        int a = 7 * 49 / 7 + 35 / 7;
        System.out.println(a);
    }

    public static void main(String[] args) {
        // problem1();
        // problem2();
        // problem3();
        // problem4();
        // problem5();
    }
}
