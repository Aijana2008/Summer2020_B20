package day27_recup;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        //            0  1  2  3  4
        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(arr[i] +" " );
        }
        System.out.println();
        System.out.println("============================");
        for(int each  : arr){
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("=================================");
        for(int i = arr.length-1; i >=0; i--){
            System.out.print(arr[i] +" " );
        }
        System.out.println();
        System.out.println("=================================");

        int[] scores = {10,20,30,40,50,60,70,80,90,100,110, 99};
        int countDivisibleBy3 = 0;
        for(int each  : scores ){
            if( each %3 != 0 ){
                continue;
            }
            countDivisibleBy3++;
            System.out.print(each+" ");
        }

        System.out.println();
        System.out.println(countDivisibleBy3);


        System.out.println("=============================================");
        String[] names = {"AB", "ABC", "A", "AB", "ABCD"};

        for ( String each : names) {
            if(!each.contains("C")){
                continue;
            }
            System.out.print(each+" ");
        }

        System.out.println();
        System.out.println("==========================================");











    }
}
