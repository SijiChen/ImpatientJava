package com.impatient.ch01;

import java.util.Arrays;

/**
 * Created by sjchen on 8/7/16.
 */
public class ArrayDemo {

    public static void main(String[] arg) {
        /*
        Array initilize
         */
        String[] names = new String[10];
        for (int i = 0; i < 5; i++)
            names[i] = "";
        names[0]= "Fred";
        names[1]=names[0];
        System.out.println("names="+ Arrays.toString(names));

        int[] primes = {17,19,23,29,31};
        primes = new int[]{2,3,5,7,11,13};

        int sum=0;
        for(int n:primes){
            sum+=n;
        }
        System.out.println("sum = "+sum);
        /*
        Array deep copy
         */
        int[] copiedPrimes=Arrays.copyOf(primes,primes.length);
        copiedPrimes[5]=100;
        System.out.println(Arrays.toString(primes));
        System.out.println(Arrays.toString(copiedPrimes));
    }
}
