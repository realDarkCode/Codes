// package CustomCalculator;
package Practice_set_12_customPackages_accessModifier;

// ? 1. Create three classes calculator , Sc calculator and Hybridcalculator and group them into a package 

class Calculator {
    public void calculate(int a, int b) {
        System.out.println("the sum of A and B is " + a + b);
    }
}

class ScientificCalculator {
    public void calculate(int a, int b) {
        System.out.println("the sin  of A and B is " + Math.sin(a + b));
    }
}

class HybridCalculator {
    public void calculate(int a, int b) {
        System.out.println("the subtraction of A and B is " + (a - b));
    }
}

public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Im the main method");
    }
}
