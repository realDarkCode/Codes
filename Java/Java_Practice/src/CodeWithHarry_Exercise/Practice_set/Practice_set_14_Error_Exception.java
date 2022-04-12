import java.util.Scanner;

public class Practice_set_14_Error_Exception {

    static void problem1() {
        // ? 1) Write a java program to demonstrate syntax, logical 2 runtime errors.
        // int number = 54 // syntax error
        int age = -452; // logical error

    }

    // ? 2) Write a java program that prints "HaHa" during Arithmetic exception and
    // ? "HeHe" during an Illegal argument exception.
    static void problem2() {
        try {
            int n = 46 / 0; // ArithmeticException

        } catch (ArithmeticException e) {
            System.out.println("Haha");
        } catch (IllegalArgumentException e) {
            System.out.println("Hehe");
        }

    }

    // ? 3) Write a program that allows you to given. If max retries exceed 5 print
    // ? "errors".
    static void problem3() {
        int marks[] = { 5, 10, 18, 20 }, errCount = 0, index;
        Boolean hasToRun = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index number to look at value");
        while (hasToRun) {
            try {
                index = sc.nextInt();
                System.out.printf("value of index %d is %d\n", index, marks[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("invalid index");
                errCount++;
            } finally {
                if (errCount >= 5) {
                    sc.close();
                    System.out.println("too many errors. exiting program...");
                    break;
                }
            }
        }
    }

    // ! 4) Modify program in Q3 to throw a custom Exception if max retries are
    // reached.
    // ! 5) Wrap the program in Q3 inside a method which throws your custom
    // Exception.
    // Todo: could be solved in future
    public static void main(String[] args) {
        // problem1();
        // problem2();
        problem3();
    }
}
