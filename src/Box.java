import java.awt.*;

public class Box {

    int x1, y1;
    int x2, y2;

    Box (int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    Box (Point topLeft, Point bottomRight) {
        this(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);
    }

    Box (Point topLeft, int width, int height){
        this(topLeft.x, topLeft.y, topLeft.x +width, topLeft.y + height);
    }

    void printBox (){
        System.out.println("Box: <" + this.x1 + "," + y1 + ", " + x2 + "," + y2 + ">");
    }
    public static void main(String[] args) {
        System.out.println("Wywolanie bulidBox ze wspolrzednymi box.buildBox(25,25),(50,50)");
        Box box = new Box(25,25,50,50);
        box.printBox();
        System.out.println("Wywolanie bulidBox ze punktami box.buildBox(10,10),(20,20)");
        Point a = new Point(10,10);
        Point b = new Point(20,20);
        Box box2 = new Box(a,b);
        box2.printBox();
        System.out.println("Wywolanie bulidBox ze punktami box.buildBox(10,10), wys 50 i szer 50");
        Point c = new Point(10,10);
        Box box3 = new Box (c,50,50);
        box.printBox();

    }
}
