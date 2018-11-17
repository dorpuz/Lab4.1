public class DayCounter {
    public static void main(String[] args) {
        int yearIn = 2000;
        int monthIn = 2;
        for(int m=1;m<13;m++){
            for(int d=1; d<=countDays(m,yearIn);d++) {

                System.out.println(d+ "." +m + "." + yearIn);
            }
        }
        //System.out.println(monthIn + "/" + yearIn+ " ma " + countDays(monthIn,yearIn)+ " dni.");
    }

    //statyczna metoda - mozliwa do wywolania bez tworzenia obiektu
    public static int countDays (int month, int year){
        int count = -1;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:
                if (year % 4 == 0){
                    count = 29;
                    if ((year % 100 == 0) && (year % 400 != 0)) {
                        count = 28;
                    }
                } else {
                    count = 28;
                }
        }
        return count;
    }
}
