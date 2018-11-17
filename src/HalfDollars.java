public class HalfDollars {
    public static void main(String[] args) {

        int[] denver = {1_700_000, 4_600_000, 2_100_000};
        //int[] philadelphia = new int[denver.length]; //tablica ma taki sam rozmiar jak tablica denver
        int[] philadelphia = {1_800_000, 5_000_000, 2_500_000};
        int[] total = new int[denver.length];
        int average, sum =0;

        for (int i=0; i<total.length; i++){
            total[i] = denver[i] + philadelphia[i];
            System.out.println("Produkja w " + (2012 + i) + ": ");
            System.out.format("%,d%n", total[i]);
            sum += total[i];
        }

        average = sum/(total.length);
        System.out.println("\nSrednia: ");
        System.out.format("%,d%n", average);
    }
}
