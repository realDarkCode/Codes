package CodeWithHarry_Exercise;

import java.util.Scanner;

public class Practice_set_04_condition_switch {
    static void problem1() {
        // ? Question 1 : What will be the output of this program:
        // * int a = 10;
        // * if (a=11)
        // * System.out.println(“I am 11”);
        // * else
        // * System.out.println(“I am not 11”);
        int a = 10;
        if (a == 11) {
            System.out.println("I am 11");

        } else {
            System.out.println("I am not 11");
        }

    }

    static void problem2() {
        // ? Question 2: Write a program to find out whether a student is pass or fail;
        // ? if it requires a total of 40% and at least 33% in each subject to pass.
        // ? Assume 3 subjects and take marks as input from the user.
        int mark1, mark2, mark3;
        float percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 3 subject marks:");
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
        mark3 = sc.nextInt();
        sc.close();
        percentage = (mark1 + mark2 + mark3) / 300.0f * 100.0f;
        if (mark1 >= 33 && mark2 >= 33 && mark3 >= 33 && percentage >= 40) {
            System.out.println("you are passed!");
        } else {
            System.out.println("You are failed, better luck next time.");
        }
    }

    static void problem3() {
        // ? Calculate income tax paid by an employee to the government as per the slabs
        // ? mentioned below:
        // 2.5L – 5.0L 5%
        // 5.0L – 10.0L 20%
        // Above 10.0L 30%
        // * Note that there is not tax below 2.5L. Take the input amount as input from
        // * the user.

    }

    public static void main(String[] args) {
        // problem1();
        // problem2();
        problem3();
    }

}