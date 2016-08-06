package com.impatient.ch01;

import java.util.Random;

/**
 * Created by sjchen on 8/6/16.
 */
public class MethodDemo {
    public static void main(String[] arg    ){
        System.out.println("Hello World!");
        System.out.println("Hello,World!".length());
        System.out.println(new Random().nextInt());

        Random generator = new Random();
        System.out.println(generator.nextInt());
        System.out.println(generator.nextInt());
    }
}
