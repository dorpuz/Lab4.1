public class ShowArray {
    public static void main(String[] args) {

        int[][][] array = {{{1,2,3},{1,2}}};
        //System.out.println(array[0][0].length);

        //ZADANIE: wyświetl wszystkie elementy tablicy:
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                for(int k=0; k<array[i][j].length;k++){
                    System.out.println("array[" +i + "][" + j + "][" + k + "]\t " + array[i][j][k]);
                }
            }
        }
    }
}
