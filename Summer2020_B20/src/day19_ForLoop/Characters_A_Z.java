package day19_ForLoop;

public class Characters_A_Z {
    public static void main(String[] args) {

// task05:
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print(ch+" ");
        }

        System.out.println();

        for(int i = 65; i <= 90; i++ ){
            char ch = (char)i;
            System.out.print(  ch+" " );
        }

        System.out.println();

        System.out.println("=============================================");

        //task06:
        for(char ch = 'Z'; ch >= 'A'; ch--){
            System.out.print(ch+" ");
        }

        System.out.println();

        for(int i = 90; i >= 65;  i--){
            System.out.print( (char)i +" " );
        }

        System.out.println();


        System.out.println("======================");

        /*
        for(int i = 0; i < 65000; i++){
            System.out.print((char)i +" ");
        }
         */















    }
}
