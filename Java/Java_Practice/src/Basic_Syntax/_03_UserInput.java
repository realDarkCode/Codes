package Basic_Syntax;
import java.util.Scanner;

public class _03_UserInput {
    public static void main(String[] args) {
        // int number; 
        Scanner input = new Scanner(System.in);
        // int number = input.nextInt();
        boolean hasInteger = input.hasNextInt();
        System.out.println(hasInteger);
    }
}
