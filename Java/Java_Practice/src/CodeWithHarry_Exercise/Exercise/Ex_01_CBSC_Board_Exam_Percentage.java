package CodeWithHarry_Exercise.Exercise;

import java.util.Scanner;

/**
 * Ex_01_CBSC_Board_Exam_Percentage
 */
public class Ex_01_CBSC_Board_Exam_Percentage {

    public static void main(String[] args) {
        // initialize input object
        Scanner sc = new Scanner(System.in);

        // taking five subject mark
        float mark, sum = 0.0f;
        float percentage;

        System.out.println("Enter the mark of 1st Subject:");
        mark = sc.nextFloat();
        sum = sum + mark;
        System.out.println("Enter the mark of 2nd Subject:");
        mark = sc.nextFloat();
        sum = sum + mark;
        System.out.println("Enter the mark of 3rd Subject:");
        mark = sc.nextFloat();
        sum = sum + mark;
        System.out.println("Enter the mark of 4th Subject:");
        mark = sc.nextFloat();
        sum = sum + mark;
        System.out.println("Enter the mark of 5th Subject:");
        mark = sc.nextFloat();
        sum = sum + mark;
        percentage = (sum / 500.0f) * 100.0f;
        sc.close();
        System.out.println("Your percentage is: " + percentage + "%");
    }
}