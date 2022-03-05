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
        byte mark1, mark2, mark3;
        float percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 3 subject marks:");
        mark1 = sc.nextByte();
        mark2 = sc.nextByte();
        mark3 = sc.nextByte();
        sc.close();
        percentage = (mark1 + mark2 + mark3) / 3.0f;
        if (percentage >= 40 && mark1 >= 33 && mark2 >= 33 && mark3 >= 33) {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in Lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        sc.close();
        if (income <= 2.5) {
            tax = tax + 0;
        } else if (income > 2.5f && income <= 5f) {
            tax = tax + 0.05f * (income - 2.5f);
        } else if (income > 5f && income <= 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        } else if (income > 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is: " + tax);
    }

    static void problem4() {
        // ? Question 4: Write a Java program to find out the day of the week given the
        // * number [1 for Monday, 2 for Tuesday … and so on!]
        int day = 1;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Do you live in Mars?");
        }
    }

    static void problem5() {
        // ? Question 5:Write a Java program to find whether a year entered by the user
        // ? is a leap year or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check it is leap year or not");
        int year = sc.nextInt();
        sc.close();
        if ((year % 4 == 0) || (year % 100 == 0 && year % 400 == 0)) {

            System.out.println("Year: " + year + " is a leap year");
        } else {

            System.out.println("Year: " + year + " is not a leap year");
        }
    }

    static void problem6() {
        // ? Question 6:Write a program to find out the type of website from the URL:
        // .com – commercial website
        // .org – organization website
        // .in – Indian website

        // String url = "https://www.google.com";
        String url = "https://www.darkCode.org";
        if (url.endsWith(".com")) {
            System.out.println("Commercial Website");
        } else if (url.endsWith(".org")) {
            System.out.println("Organization Website");
        } else if (url.endsWith(".in")) {
            System.out.println("Indian Website");
        }
    }

    public static void main(String[] args) {
        // problem1();
        // problem2();
        // problem3();
        // problem4();
        // problem5();
        problem6();
    }

}