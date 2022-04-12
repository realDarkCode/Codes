
/* Exercise 6: You have to create a custom calculator with following operations:
1. + -> Addition
2. - -> Subtraction
3. * -> Multiplication
4. / -> Division
which throws the following exceptions:
1. Invalid input Exception ex: 8 & 9
2. Cannot divide by 0 Exception
3. Max Input Exception if any of the inputs is greater than 100000
4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
*/
class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "Input numbers can't be 8 or 9";
    }
}

class ZeroDivideException extends Exception {
    @Override
    public String toString() {

        return "Can't divide any number by Zero you fool";
    }

    @Override
    public String getMessage() {
        return "You are trying to divide a number by zero which is illegal ";
    }
}

class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "Input can't be greater than 100000";
    }

    @Override
    public String getMessage() {
        return "Max Input Exception - if any of the inputs is greater than 100000";
    }
}

class MaxMultiplierReachedException extends Exception {

    @Override
    public String toString() {
        return "Multiplication Input can't be greater than 7000";
    }

    @Override
    public String getMessage() {
        return "Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000";
    }
}

class Custom_Calculator {
    public float calculate(float number1, String operation, float number2)
            throws InvalidInputException, MaxInputException, MaxMultiplierReachedException, ZeroDivideException {
        if ((number1 == 8 || number1 == 9) || (number2 == 8 || number2 == 9)) {
            throw new InvalidInputException();
        } else if (number1 >= 100000 || number2 >= 100000) {
            throw new MaxInputException();
        }
        switch (operation) {
            case "+" -> {
                return Addition(number1, number2);
            }
            case "-" -> {
                return Subtraction(number1, number2);
            }
            case "*" -> {
                return Multiplication(number1, number2);
            }
            case "/" -> {
                return Division(number1, number2);
            }
            default -> {
                throw new InvalidInputException();
            }
        }

    }

    private float Addition(float number1, float number2) throws InvalidInputException, MaxInputException {
        return number1 + number2;
    }

    private float Subtraction(float number1, float number2) {
        return number1 - number2;
    }

    private float Division(float number1, float number2) throws ZeroDivideException {
        if (number2 == 0) {
            throw new ZeroDivideException();
        }
        return number1 / number2;
    }

    private float Multiplication(float number1, float number2) throws MaxMultiplierReachedException {
        if (number1 >= 7000 || number2 >= 7000) {
            throw new MaxMultiplierReachedException();
        }
        return number1 * number2;
    }
}

public class Ex_06_Custom_calculator {
    public static void main(String[] args) {
        Custom_Calculator cusCal = new Custom_Calculator();
        try {
            System.out.println(cusCal.calculate(50, "+", 25));
            // System.out.println(cusCal.calculate(8, "+", 9)); // throws invalid input
            // System.out.println(cusCal.calculate(100000, "-", 50)); // throws Max Input
            System.out.println(cusCal.calculate(5560, "-", 5054));
            // System.out.println(cusCal.calculate(1, "/", 0)); // throws zero division
            System.out.println(cusCal.calculate(60, "*", 44));
            // System.out.println(cusCal.calculate(5, "*", 7000)); // throws maxMultipli
            System.out.println(cusCal.calculate(30, "/", 7));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
