package Shape;

public class Circle extends Shape {

    Circle(int dimension1) {
        super(dimension1, -1);
    }

    public double volume() {
        return Math.PI * this.dimension1 * this.dimension1;
    }
}
