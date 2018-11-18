public class SubPrinter extends Printer{

    int z = 3;

    void printMe(){ //przesłoniecie metody
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);
        System.out.println("Z egzemplarza klasy " + this.getClass().getName());
    }

    public static void main(String[] args) {
        SubPrinter subPrinter = new SubPrinter();
        subPrinter.printMe();

        Printer printer = new Printer();
        printer.printMe();

        printer = subPrinter;
        printer.printMe();

    }
}
