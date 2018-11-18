public class Poli {
    public static void main(String[] args) {
        X x = new X();
        x.introduce();

        Y y = new Y();
        y.introduce();

        System.out.println("-------");

        Letter letter1 = new X();
        Letter letter2 = new Y();

        letter1.introduce();
        letter2.introduce();
        //letter2.show; // nie zadziała bo show nie ma w interface

    }
}

interface Letter{
    void introduce();
}

class X implements Letter{
    @Override
    public void introduce() {
        System.out.println("Jestem z archiwum X");
    }
    public void show(){}
}

class Y extends X implements Letter{
    @Override
    public void introduce(){
        System.out.println("Jestem z archiwum Y");
    }
}