package task2;

public class Point {
    private int x,y;

    public Point(){
        this.x = x;
        this.y = y;
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return x +" "+ y;
    }

    public int[] getXY(){
        int[] result = new int[2];
        result[0] = this.x;
        result[1] = this.y;
        return result;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }

    public double distance(Point another){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    public double distance(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }
}
