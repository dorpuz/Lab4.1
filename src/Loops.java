public class Loops {
    public static void main(String[] args) {

                            //PĘTLA FOR
        /*for(;;){
            System.out.println("Pętla nieskonczona");
        }*/

       /* for (int i=1; i<=100; i++){
            System.out.println("i = " + i);
        }*/

                            //PĘTLA WHILE
        /*int i = 0;
        while(i<100){
            System.out.println("i = " + i);
            i++;
        }*/

                            //PĘTLA DO-WHILE
        /*int i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i <100);*/

        /*final String FORBIDDEN = "cztery";

        int i = 0;
        String[] strings = {"raz", "dwa", "trzy", "cztery", "piec"};

        System.out.println("------------START");
        while (i<strings.length){
            if (strings[i].equals(FORBIDDEN)){
                i++;
                continue;
            }
            System.out.println(strings[i++]);
        }
        System.out.println("------------END");*/

        out: for(int i=0; i<10;i++){
            for(int j=0; j<10;j++){
                System.out.println("i = " + i + " j = " + j);
                if(i==5 && j==5){
                    break out;
                }
            }
        }

    }
}
