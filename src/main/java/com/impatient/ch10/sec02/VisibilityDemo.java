package com.impatient.ch10.sec02;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by sjchen on 8/15/16.
 */
public class VisibilityDemo {
    private  boolean done = false;

    public static void main(String[] args) {
        VisibilityDemo v = new VisibilityDemo();
        Runnable hellos = ()->{
            for(int i =1;i<=1000;i++){
                System.out.println("Hello "+i);
            }
            v.done=true;
        };
        Runnable goodbyes = ()->{
            int i =1;
            while(!v.done) i++;
            System.out.println("Goodbye "+i);
        };
        Executor executor= Executors.newCachedThreadPool();
        executor.execute(hellos);
        executor.execute(goodbyes);
    }

}
