package Practice;
/*
    2.  print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *

 */
public class WarmTask2 {
    public static void main(String[] args) {
        System.out.println("* * * * * *");

        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("==================================");
/*

    3. print the following shape:
                    * * * * * *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    * * * * * *
            Hint: in the loop body , only place the statements that you need to repeat

 */
           System.out.println("* * * * * *");
       for(int a =0; a <8; a++){
           System.out.println("*         *");

       }
        System.out.println("* * * * * *");





        }
}
