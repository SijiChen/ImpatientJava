package com.impatient.ch01;

/**
 * Created by sjchen on 8/7/16.
 */
public class Greeting {
    public static void main(String[] args){
        for(int i=0;i<args.length;i++){
            String arg=args[i];
            if(arg.equals("-h")) arg="Hello";
            else if(arg.equals("-g")) arg="Goodbye";
            System.out.print(arg);
        }
    }
}
