package com.impatient.ch01;

import java.math.BigInteger;

/**
 * Created by sjchen on 8/7/16.
 */
public class BigNumberDemo {
    public static void main(String[] arg){
        BigInteger n = BigInteger.valueOf(123456789123789234L);//static member method
        BigInteger k = new BigInteger("123456789123789234");//contructor

        System.out.println(n);
        System.out.println(k);
    }
}
