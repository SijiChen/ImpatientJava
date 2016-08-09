package com.impatient.ch03;

/**
 * Created by sjchen on 8/9/16.
 */
public class ScopeDemo {
    public static void main(String[] args){
        repeatMessage("hello",10);
        for(String s:args)
            new Thread(()->System.out.println(s));
    }
    public static void repeatMessage(String text,int count){
        Runnable r = ()->{
            for(int i=0;i<count;i++){
                System.out.println(text);
            }
        };
        new Thread(r).start();
    }
}
