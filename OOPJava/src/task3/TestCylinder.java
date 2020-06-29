package task3;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println("Радиус = "+cy1.getRadius()+"\nВысота = "+cy1.getHeight()+"\nЦвет - "+cy1.getColor()+"\nПлощадь основания ="+cy1.getArea()+"\nОбъем = "+cy1.getVolume());

        Cylinder cy2 = new Cylinder(5.0, 2.0);
        System.out.println("Радиус = "+cy2.getRadius()+"\nВысота = "+cy2.getHeight()+"\nЦвет - "+cy2.getColor()+"\nПлощадь основания ="+cy2.getArea()+"\nОбъем = "+cy2.getVolume());
    }
}
