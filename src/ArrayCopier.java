public class ArrayCopier {
    public static void main(String[] args) {

        int[] arrayIn = {7, 4, 8, 1, 4, 1, 4};
        double[] arrayOut = new double[arrayIn.length];

        System.out.print("arrayIn: [");
        for(int i=0; i<arrayIn.length; i++){
            System.out.print(arrayIn[i] + " ");
        }
        System.out.println("]");

        System.out.print("arrayOut: [");
        int counter = 0;
        while (counter < arrayIn.length && arrayIn[counter] !=1){
            //arrayOut[counter] = (arrayIn[counter]; //niejawna konwersja typów
            arrayOut[counter] = (double)arrayIn[counter];
            System.out.print(arrayOut[counter] + " ");
            counter++;
            //ewentualnie krócej: System.out.print(arrayIn[counter++] + " ");
        }
        System.out.println("]");
    }
}
