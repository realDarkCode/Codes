package CodeWithHarry_Exercise;

public class Practice_set_09_access_modifier_constructor {
    static void problem1() {
        Cylinder a = new Cylinder();
        a.setHeight(5);
        a.setRadius(7);
        System.out.println("Cylinder Height is " + a.getHeight());
        System.out.println("Cylinder Radius is " + a.getRadius());
    }

    static void problem2() {
        Cylinder a = new Cylinder();
        a.setHeight(5);
        a.setRadius(7);
        System.out.println("Cylinder Volume is " + a.getVolume());
        System.out.println("Cylinder surface is " + a.getSurface());
    }

    static void problem3() {
        Cylinder yourCylinder = new Cylinder(5, 7);
        System.out.println("Cylinder Volume is " + yourCylinder.getVolume());
        System.out.println("Cylinder surface is " + yourCylinder.getSurface());
    }

    static void problem4() {
        BasicRectangle a = new BasicRectangle();
        a.printRectangle();
        BasicRectangle b = new BasicRectangle(18, 10);
        b.printRectangle();
    }

    public static void main(String[] args) {
        // problem1();
        // problem2();
        // problem3();
        problem4();
    }
}

// ? 1. create a class cylinder and use getter and setters to set its radius and
//

// ? 2. use ➊ to calculate surface and volume of the cylinder

// ? 3. Use a constructor and repeat ➊

class Cylinder {
    private float radius, height;
    double volume, surface;

    // contractor method
    Cylinder() {
        this.radius = 0;
        this.height = 0;
    }

    Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    void calculateVolume() {
        // Cylinder volume = πr²h
        this.volume = Math.PI * this.radius * this.radius * this.height;

    }

    void calculateSurface() {
        // Cylinder surface = 2πrh + 2πr²
        this.surface = (Math.PI * radius * height * 2) + (this.radius * this.radius * Math.PI * 2);
    }

    // setters
    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // getters
    public double getRadius() {
        return this.radius;
    }

    public double getHeight() {
        return this.height;
    }

    public double getSurface() {
        this.calculateSurface();
        return this.surface;
    }

    public double getVolume() {
        this.calculateVolume();
        return this.volume;
    }
}

// ? 4 . Overload a constructor used to initialize a rectangle of length and
// width 5 for using custom parameters
class BasicRectangle {
    private float height, width;

    BasicRectangle() {
        this.height = 5;
        this.width = 5;
    }

    BasicRectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    void printRectangle() {
        System.out.println("the height of the rectangle  is " + this.height);
        System.out.println("the width of the rectangle  is " + this.width);
    }
}