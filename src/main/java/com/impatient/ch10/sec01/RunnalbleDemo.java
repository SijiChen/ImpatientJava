package com.impatient.ch10.sec01;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by sjchen on 8/15/16.
 */
public class RunnalbleDemo {
    public static void main(String[] args) {
        Runnable hellos = () -> {
            for(int i =0;i<1000;i++)
                System.out.println("Hello "+i);
        };

        Runnable goodbyes = ()->{
            for(int i = 0;i<1000;i++){
                System.out.println("Goodbye " + i);
            }
        };

        Executor executor = Executors.newCachedThreadPool();
        executor.execute(hellos);
        executor.execute(goodbyes);
    }
}
