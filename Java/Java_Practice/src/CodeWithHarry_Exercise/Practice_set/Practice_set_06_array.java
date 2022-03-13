package CodeWithHarry_Exercise.Practice_set;

public class Practice_set_06_array {
    public static void problem1() {
        // ? Create an array of 5 floats and calculate their sum.
        float sum = 0;
        float[] numbers = { 15.54f, 20.89f, 80.5f, 79.79f, 0.0f };
        for (float f : numbers) {
            sum += f;
        }
        System.out.println("sum of the array is: " + sum);
    }

    public static void problem2() {
        // ? Write a program to find out whether a given integer is present in an array
        // or not.
        byte[] numbers = { 5, 10, 15, 17, 22, 64, 72 };
        byte n = 99;
        for (byte i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                System.out.println(n + " is present in given array at index: " + i);
                break;
            }
            if (i == (numbers.length - 1)) {
                System.out.println(n + " is not present in given array");

            }
        }
    }

    public static void problem3() {
        // ? Calculate the average marks from an array containing marks of all students
        // in physics using a for-each loop.
        float[] marks = { 88.5f, 85, 90, 99.5f, 45.5f };
        float sum = 0, average;
        for (float mark : marks) {
            sum += mark;
        }
        average = sum / marks.length;

        System.out.println("Average of student mark is: " + average);
    }

    public static void problem4() {
        // ? Create a Java program to add two matrices of size 2x3.
        int[][] a = { { 5, 10, 15 }, { 15, 10, 5 } };
        int[][] b = { { 5, 10, 15 }, { 15, 10, 5 } };
        int[][] result = new int[2][3];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void problem5() {
        // ? Write a Java program to reverse an array.
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] reverseArray = new int[array.length];
        for (int i = (array.length - 1); i >= 0; i--) {
            reverseArray[(array.length - 1) - i] = array[i];
        }
        for (int i : reverseArray) {
            System.out.print(i + " ");
        }
    }

    public static void problem6() {
        // ? Write a Java program to find the maximum element in an array.
        int maximum = Integer.MIN_VALUE;
        int[] number = { 5, 9, 4, 6, 2, 9, 5 };
        for (int i : number) {
            if (i > maximum) {
                maximum = i;
            }
        }
        System.out.println("the maximum element of given array is: " + maximum);
    }

    public static void problem7() {
        // ? Write a Java program to find whether an array is sorted or not.
        byte[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5 };
        boolean isSorted = true;
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] > n[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("given array is sorted");
        } else {
            System.out.println("given array is NOT sorted");

        }
    }

    public static void main(String[] args) {
        // problem1();
        // problem2();
        // problem3();
        // problem4();
        // problem5();
        // problem6();
        problem7();

    }
}
