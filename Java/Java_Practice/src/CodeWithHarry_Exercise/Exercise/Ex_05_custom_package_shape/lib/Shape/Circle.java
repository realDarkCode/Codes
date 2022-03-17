package CodeWithHarry_Exercise.Exercise.Ex_05_custom_package_shape.lib.Shape;

public class Circle extends Shape {

    public Circle(int dimension1) {
        super(dimension1, -1);
    }

    public double volume() {
        return Math.PI * this.dimension1 * this.dimension1;
    }
}
