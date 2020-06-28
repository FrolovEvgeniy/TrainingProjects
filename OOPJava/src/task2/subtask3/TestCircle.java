package task2.subtask3;

import task2.Point;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(1,2,3.3);
        Circle c3 = new Circle(new Point(4,5),6.6);

        System.out.println(c3);

        c1.setCenter(new Point(11, 12));
        c1.setRadius(13.3);
        System.out.println(c1);
        System.out.println("center is: " + c1.getCenter());
        System.out.println("radius is: " + c1.getRadius());
        c1.setCenterX(21);
        c1.setCenterY(22);
        System.out.println(c1);
        System.out.println("координата x центра: " + c1.getCenterX());
        System.out.println("координата y центра: " + c1.getCenterY());
        c1.setCenterXY(31,32);
        System.out.println(c1);
        System.out.println("center's x is: " + c1.getCenterXY()[0]);
        System.out.println("center's y is: " + c1.getCenterXY()[1]);

        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
}
