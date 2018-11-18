public class Lab_4_1_3 {
    public static void main(String[] args) {
        new AA();
        System.out.println("--------");
        new BB();
        System.out.println("--------");
        new CC();
        System.out.println("-------- part 3");
        new AA(true);
        new BB(true);
        new CC(true);
        System.out.println("-------- part 4");
        new AA(false);
        System.out.println("--------");
        new BB(false);
        System.out.println("--------");
        new CC(false);

    }
}

class AA {
    AA() {
        System.out.println("Konstruktor klasy AA");
    }
    AA(boolean tf) {
        if (tf == false ){
            System.out.println("AA");
        }
    }
}

class BB extends AA {
    BB() {

        System.out.println("Konstruktor klasy BB");
    }
    BB(boolean tf) {
        super (true);
        if(tf == false){
            System.out.println("BB");
        }
    }
}

class CC extends BB {
    CC() {
        //super(true);
        System.out.println("Konstruktor klasy CC");
    }
    CC(boolean tf) {
        super (true);
        if(tf == false) {
            System.out.println("CC");
        }
    }

}

