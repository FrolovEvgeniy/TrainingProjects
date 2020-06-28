package task2.subtask3;

import task2.Point;

public class Circle {
    private double radius;
    private Point center;

    public Circle(){
        this.radius = 1.0;
        this.center = new Point();
    }

    public Circle(int xCanter, int yCenter, double radius){
        this.radius = radius;
        center = new Point(xCanter, yCenter);
    }

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getCenterX(){
        return center.getX();
    }

    public void setCenterX(int x){
        center.setX(x);
    }

    public double getCenterY(){
        return center.getY();
    }

    public void setCenterY(int y){
        center.setY(y);
    }

    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double distance(Circle another){
        return center.distance(another.center);
    }

    public double getCircumference(){
        return 2*(Math.PI * radius);
    }
}
