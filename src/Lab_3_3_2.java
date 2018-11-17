public class Lab_3_3_2 {
    public static void main(String[] args) {
        String liczba = args[0];
        long liczbaLong = 0;
        switch (liczba){
            case "jeden":
                liczbaLong = 1;
                break;
            case "dwa":
                liczbaLong = 2;
                break;
            case "trzy":
                liczbaLong = 3;
                break;
            case "cztery":
                liczbaLong = 4;
                break;
            case "piec":
                liczbaLong = 5;
                break;
            case "szesc":
                liczbaLong = 6;
                break;
            case "siedem":
                liczbaLong = 7;
                break;
            case "osiem":
                liczbaLong = 8;
                break;
            case "dziewiec":
                liczbaLong = 9;
                break;
            case "dziesiec":
                liczbaLong = 10;
                break;
        }
        System.out.println(liczba + " to " + liczbaLong);
    }
}
