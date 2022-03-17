package Shape;

public class Rectangle extends Shape {
    Rectangle(int dimension1, int dimension2) {
        super(dimension1, dimension2);
    }

    public int volume() {
        return this.dimension1 * this.dimension2;
    }
}
