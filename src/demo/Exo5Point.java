package demo;

public class Exo5Point {

    int x;
    int y;


    public Exo5Point() {

    }

    public Exo5Point(int x1, int y1) {
        this.x = x1;
        this.y = y1;
    }

    public double distance(Exo5Point point1) {

        double xDistance = (point1.x - x) * (point1.x - x);
        double yDistance = (point1.y - y) * (point1.y - y);

        double distance = Math.sqrt(xDistance + yDistance);

        return distance;
    }

    @Override
    public String toString() {
        return "EXO5POINT{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
