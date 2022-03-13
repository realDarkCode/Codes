package CodeWithHarry_Exercise;

// ? 1. Create a class Employee with the following properties and methods:
// Salary (property) (int)
// name (property) (String)
// getSalary (method returning int)
// getName (method returning String)
// setName (method changing name)
class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
        System.out.println("name has been changed to " + newName);
    }
}

// ? 2. Create a class cellphone with methods to print “ringing…”, “vibrating…”,
// etc.
class cellPhone {
    public void callSomeone() {
        System.out.println("ringing.....");
    }

    public void vibrate() {
        System.out.println("Vibrating.....");
    }
}

// ? 3.Create a class Square with a method to initialize its side, calculating
// area, perimeter etc.
class Square {
    float area, perimeter;

    public void init(float side) {
        area = side * side;
        perimeter = 4 * side;
    }

    public float getArea() {
        return area;
    }

    public float getPerimeter() {
        return perimeter;
    }
}

// ? 4. Create a class Rectangle & problem 3.
class Rectangle {
    float area, perimeter;

    public void init(float length, float height) {
        area = length * height;
        perimeter = 2 * (length + height);
    }

    public float getArea() {
        return area;
    }

    public float getPerimeter() {
        return perimeter;
    }
}

// ? 5. Create a class TommyVecetti for Rockstar Games capable of hitting (print
// hitting…), running, firing, etc.
class TommyVecetti {
    public void hit() {
        System.out.println("Hitting....");
    }

    public void run() {
        System.out.println("Running....");
    }

    public void fire() {
        System.out.println("Firing....");
    }
}

// ? 6. Repeat problem 4 for a circle.
class Circle {
    float circumference, area;

    public void init(float radius) {
        float pi = 3.1416f;

        circumference = (pi * radius) * 2;
        area = (radius * radius) * pi;
    }

    public float getCircumference() {
        return circumference;
    }

    public float getArea() {
        return area;
    }
}

public class Practice_set_08_class {
    static void problem1() {
        Employee redwan = new Employee();
        redwan.salary = 10000;
        redwan.name = "Redwan Haider";
        System.out.println("salary is " + redwan.getSalary());
        System.out.println("name is " + redwan.getName());
        redwan.setName("RED1");
        System.out.println("name is " + redwan.getName());
    }

    static void problem2() {
        cellPhone nokia = new cellPhone();
        nokia.callSomeone();
        nokia.vibrate();
    }

    static void problem3() {
        Square a = new Square();
        a.init(7.546f);
        System.out.println("Area is: " + a.getArea());
        System.out.println("perimeter is: " + a.getPerimeter());
    }

    static void problem4() {
        Rectangle a = new Rectangle();
        a.init(5, 10);
        System.out.println("Area is: " + a.getArea());
        System.out.println("perimeter is: " + a.getPerimeter());
    }

    static void problem5() {
        TommyVecetti player = new TommyVecetti();
        player.run();
        player.hit();
        player.fire();
        player.run();
    }

    static void problem6() {
        Circle a = new Circle();
        a.init(4.5f);
        System.out.println("circumference is " + a.getCircumference());
        System.out.println("area is " + a.getArea());

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
