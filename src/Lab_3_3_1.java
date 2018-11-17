public class Lab_3_3_1 {

    public static void main(String[] args) {
        int yearIn = 2000;

        for(int m=1;m<13;m++){
            for(int d=1; d<=DayCounter.countDays(m,yearIn);d++) {
                System.out.println(d+ "." +m + "." + yearIn);
            }
        }
    }
}
