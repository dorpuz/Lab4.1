import java.awt.*;

public class Arrays {
    public static void main(String[] args) {
        String[] requests;
        Point[] points;

        //int temps[] = new int[99]; //poprawnie ale niewskazane tak pisac
        int[] temps = new int[99];
        temps[0] = 6;
        temps[1] = 90;
        //temps[123] = 78; //poza zakresem tablicy

        //System.out.println(temps[66]); //nieprzypisane komórki mają wartosc 0

        Point[] markup = {new Point(1,2), new Point(1,5), new Point(4,3)};
        int[] i = {1,2,3};

        String[] titles = {"Pan", "Pani", "Państwo"};

        System.out.println(titles.length);
        System.out.println(markup.length); //rozmiar tablicy

    }
}
