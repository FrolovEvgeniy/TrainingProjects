package task4;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("red", 4,5);
        System.out.println(s1);
        System.out.println("Площадь равна " + s1.getArea());

        Shape s2 = new Triangle("blue",4,5);
        System.out.println(s2);
        System.out.println("Площадь равна " + s2.getArea());

        Shape s3 = new Shape();
        System.out.println(s3);
        System.out.println("Площадь равна " + s3.getArea());
    }
}
