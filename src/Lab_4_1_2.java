import java.awt.*;

public class Lab_4_1_2 extends Point {
    int z,a;
    String name;

    public Lab_4_1_2(int x, int y, int z, int a, String name) {
        super(x, y);
        this.z = z;
        this.a = a;
        this.name = name;
    }

    public static void main(String[] args) {
        Lab_4_1_2 lab_4_1_2 = new Lab_4_1_2(1,2,3,4,"FourDPoint");

        System.out.println("x: " + lab_4_1_2.x + ", y: " + lab_4_1_2.y + ", z: " + lab_4_1_2.z + ", " +
                "a: " + lab_4_1_2.a + ", nazwa: " + lab_4_1_2.name);
    }
}
