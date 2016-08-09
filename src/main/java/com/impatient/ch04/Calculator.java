package com.impatient.ch04;

import java.util.Scanner;

/**
 * Created by sjchen on 8/9/16.
 */
public class Calculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("First operand: ");
        int a = in.nextInt();
        System.out.println("Operator: ");
        String opSymbol = in.next();
        System.out.println("Second operand: ");
        int b = in.nextInt();
        for(Operation op :Operation.values()){
            if(op.getSymbol().equals(opSymbol)){
                int result = op.eval(a,b);
                System.out.println(result);
            }
        }
    }
}
