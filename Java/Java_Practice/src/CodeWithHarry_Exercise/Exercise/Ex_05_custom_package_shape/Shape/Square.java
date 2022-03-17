package Shape;

public class Square extends Shape {
    Square(int dimension1) {
        super(dimension1, -1);
    }

    public int volume() {
        return this.dimension1 * this.dimension1;
    }
}
