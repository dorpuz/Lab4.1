import java.awt.*;

public class NamedPoint extends Point {
    String name;

    public NamedPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    public static void main(String[] args) {
        NamedPoint namedPoint = new NamedPoint(5,5, "point1");
        System.out.println("x: " + namedPoint.x + ", y: " + namedPoint.y + ", nazwa: " + namedPoint.name);
    }
}
