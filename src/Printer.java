public class Printer {
    int x = 0;
    int y = 1;

    void printMe(){
        System.out.println("x: " + x + ", y: " + y);
        System.out.println("Z egzemplarza klasy " + this.getClass().getName());
    }

}
