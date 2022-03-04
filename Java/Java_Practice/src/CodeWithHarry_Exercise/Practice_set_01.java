package CodeWithHarry_Exercise;

import java.util.Scanner;

public class Practice_set_01 {
    static void sumOfThreeNumber() {
        // ? Problem Steatment: Write a program to sum three numbers in Java.
        System.out.println("Sum of three Number");
        int num1, num2, num3, sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st Number:");
        num1 = sc.nextInt();
        System.out.println("Enter the 2nd Number:");
        num2 = sc.nextInt();
        System.out.println("Enter the 3rd Number:");
        num3 = sc.nextInt();
        sc.close();
        sum = num1 + num2 + num3;
        System.out.println("Sum of the three number is: " + sum);
    }

    static void calculateCGPA() {
        // ? Write a program to calculate CGPA using marks of three subjects (out of
        // 100)
        int markSubject1 = 90;
        int markSubject2 = 84;
        int markSubject3 = 76;
        float CGPA = (markSubject1 + markSubject2 + markSubject3) / 30;
        System.out.println("CGPA is: " + CGPA);

    }

    static void greedUser() {
        // ? Write a Java program that asks the user to enter his/her name and greets
        // ? them with “Hello <name>, have a good day” text.
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\tGreed User Program\t\t");
        System.out.println("Enter your name Please:");
        String userName = sc.next();
        System.out.println("Hello " + userName);
        sc.close();
    }

    public static void main(String[] args) {
        // sumOfThreeNumber();
        // calculateCGPA();
        greedUser();
    }
}
