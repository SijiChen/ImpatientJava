package com.impatient.ch01;

/**
 * Created by sjchen on 8/6/16.
 */
public class NumberDemo {
    public static void main(String[] arg){
        System.out.println(4000000000L);
        System.out.println(0xCAFEBABE);
        System.out.println(0b1001);//fix error for binary literals not supported in project structer->Module->language level
        System.out.println(011);//fix source release 1.8 release requires target release 1.8 by : File > Settings > Build, Execution, Deployment > Java Compiler

    }
}
