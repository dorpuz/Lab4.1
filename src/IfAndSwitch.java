public class IfAndSwitch {
    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Zbyt mało argumentów");
            System.exit(-1);
        }
        //bez klamr wykona przy ifie wykona sie tylko pierwsza instrukacja, kolejna juz bedzie sie normalnie wykonywac,
        // niezaleznie od warunku

        String server;

        if (args.length < 1){
            server = "localhost";
        } else {
            server = args[0];
        }
        System.out.println(server);
        System.out.println("-----------");

        char grade = 'A';
        /*switch (grade){
            case 'A':
                System.out.println("Wspaniale!");
                break; //bez break'a wykona sie wszystko ponizej od momentu spelnienia warunku
            case 'B':
                System.out.println("Dobrze!");
                break;
            case 'C':
                System.out.println("Moglo być lepiej!");
                break;
            default:
                System.out.println("Rozważ oszukiwanie..");
                break;
        }*/

        if (grade == 'A'){
            System.out.println("Wspaniale!");
        } else if (grade == 'B'){
            System.out.println("Dobrze!");
        } else if (grade == 'C'){
            System.out.println("Mogło byc lepiej");
        } else {
            System.out.println("Rozważ oszukiwanie..");
        }

        System.out.println("-----------");
        int myScore = 5;
        int yourScore = 3;
        int bestScore;

        bestScore = myScore > yourScore ? myScore : yourScore;

        System.out.println(bestScore);

    }
}
