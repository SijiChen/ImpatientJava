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
        System.out.println('\u263a');

        System.out.println(1_000_000_000);
        System.out.println(0b1111_0100_0010_0000);
        System.out.println(Byte.toUnsignedInt((byte)-1));
        System.out.println(3.14 );
        System.out.println(0x1.0p-3);//hex double literal

        System.out.println(1.0/0/0);
        System.out.println(-1.0/0.0);
        System.out.println(0.0/0.0);

        System.out.println(-1.0/0.0==Double.NEGATIVE_INFINITY);
        System.out.println(2.0-1.1);//print out as 0.8999999



    }
}
