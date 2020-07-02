package task4;

public class Shape {
    private String color;

    public Shape(){
        this.color = "White";
    }
    public Shape(String color){
        this.color = color;
    }

    public double getArea(){
        System.out.println("Фигура неизвестна! Невозможно вычислить площадь!");
        return 0;
    }

    @Override
    public String toString() {
        return "color= " + color;
    }
}
