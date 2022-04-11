package Exception;

public class Throw {
    public static int divide(int a, int b) throws ArithmeticException {
        int c = a / b;
        return c;
    }

    public static void main(String[] args) {
        int result;
        try {
            result = divide(5, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("exception");
        }

    }
}
