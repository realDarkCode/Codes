// package Problem2;
package CodeWithHarry_Exercise.Practice_set.Practice_set_12_customPackages_accessModifier;

// ? 2. Use a build-in package in java to write a class which displays a message ( by using sout ) after taking input from the user 

class DisplayMessage {
    public void displayInput() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("You have entered " + sc.nextLine());
        sc.close();
    }
}

// public class Problem2 {
// public static void main(String[] args) {

// }
// }
