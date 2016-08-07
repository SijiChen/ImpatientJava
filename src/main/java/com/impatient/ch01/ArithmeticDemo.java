package com.impatient.ch01;

/**
 * Created by sjchen on 8/7/16.
 */
public class ArithmeticDemo {
    public static void main(String[] arg){
        System.out.println(17/5);
        System.out.println(17%5);
        System.out.println(Math.floorMod(17,5));

        System.out.println(-17/5);
        System.out.println(-17%5);
        System.out.println(Math.floorMod(-17,5));//always return a positive number

        int[] a = {17,29};
        int n =0;
        System.out.printf("%d %d\n",a[n++],n);
        n=0;
        System.out.printf("%d %d\n",a[++n],n);


        System.out.println(Math.pow(10,9));
        System.out.println(Math.sqrt(1000000));

        double x=3.75;
        n=(int) x;
        System.out.println(n);
        n=(int) Math.round(x);
        System.out.println(n);

        n=(int) 3000000000L;
        System.out.println(n);


    }
}
