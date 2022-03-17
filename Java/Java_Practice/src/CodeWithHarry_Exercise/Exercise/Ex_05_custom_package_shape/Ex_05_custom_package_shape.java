package CodeWithHarry_Exercise.Exercise.Ex_05_custom_package_shape;

import CodeWithHarry_Exercise.Exercise.Ex_05_custom_package_shape.lib.Shape.Circle;
import CodeWithHarry_Exercise.Exercise.Ex_05_custom_package_shape.lib.Shape.Rectangle;

public class Ex_05_custom_package_shape {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5, 10);
        System.out.println("Volume of the rec is " + rec.volume());
        Circle cir = new Circle(5);
        System.out.println("area of the circle is " + cir.volume());

    }
}
