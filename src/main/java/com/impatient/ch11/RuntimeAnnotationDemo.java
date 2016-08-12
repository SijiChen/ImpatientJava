package com.impatient.ch11;

/**
 * Created by sjchen on 8/12/16.
 */
public class RuntimeAnnotationDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(new Point(10, 10), 20, 30);
        System.out.println(ToStrings.toString(rect));
    }
}
