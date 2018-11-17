public class Blocks {
    public static void main(String[] args) {
        int x = 5;

        {//początek bloku
            int y = 10;
            y += x; //y = y + x

            System.out.println("y = " + y);
        } //koniec bloku

        System.out.println("x = " + x);
        //System.out.println("y = " + y); zmienna y nie jest widoczna poza blokiem

    }
}

