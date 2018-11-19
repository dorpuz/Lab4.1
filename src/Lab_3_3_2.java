public class Lab_3_3_2 {
    public static void main(String[] args) {
        String liczba = args[0];
        char litera1 = liczba.charAt(0);
        long liczbaLong = 0;
        switch (litera1){
            case 'j':
                liczbaLong = 1;
                break;
            case 'd':
                if(liczba.charAt(1)=='w'){
                    liczbaLong = 2;
                    break;
                }
                if(liczba.charAt(4)=='w'){
                    liczbaLong = 9;
                    break;
                }
                if(liczba.charAt(4)=='s'){
                    liczbaLong = 10;
                    break;
                }     
            case 't':
                liczbaLong = 3;
                break;
            case 'c':
                liczbaLong = 4;
                break;
            case 'p':
                liczbaLong = 5;
                break;
            case 's':
                if(liczba.charAt(1)=='z'){    
                    liczbaLong = 6;
                    break;
                }else{
                    liczbaLong = 7;
                    break;
                }    
            case 'o':
                liczbaLong = 8;
                break;
        }
        System.out.println(liczba + " to " + liczbaLong);
    }
}
