package day06_ComparisonOperators;

public class Implicit_explicit {

    public static void main(String[] args) {
        short s1 = 100;
        long l1 = s1; // implicit casting: automatically done

        long l2 = (long)s1; // if we implicit manually

        int I1 = 300;
        double D1 = I1; // 300.0

        double D2 = (double) I1;

        System.out.println("============================");

        double d1 = 400.55555;
        int i1 = (int)d1; //400

        System.out.println(i1);

        long L1 = 4400;
        short sh1 =(short) L1;
        System.out.println(L1);

        int n1 = 1000;
        byte b1 = (byte)n1;
        System.out.println(b1); //-24


        double m1 = 34.5;
        float f1 = (int) m1;
        System.out.println(f1);

        long r1 = -500;
        int p1 = (int)r1;
        System.out.println(p1);

        long r2 = 13;
        byte t1 = (byte)r2;
        System.out.println(t1);
      long a = 30l;
      long b= (short) a;
        System.out.println(b);


        int o = 3,  f = 2;

        long c = (a+b) * 2 / 3 % 2 ;
        System.out.println(c);

        System.out.println(10/0.3);

    }





}
