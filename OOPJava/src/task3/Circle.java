package task3;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1.5;
        this.color = "White";
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
