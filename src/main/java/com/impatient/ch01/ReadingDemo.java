package com.impatient.ch01;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sjchen on 8/7/16.
 */
public class ReadingDemo {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("How old are you?");
        if (in.hasNextLine()) {
            int age = in.nextInt();
            System.out.printf("Hello, %s. NEXT YEAR, YOU WILL BE %d . \n", name, age + 1);

        } else {
            System.out.printf("Hello, %s. Are you too yong to eter an integer?", name);
        }
        /* not working for the console class
        Console terminal = System.console();
        String username = terminal.readLine("User name:");
        System.out.println("Hello="+username);
        char[] passwd = terminal.readPassword("Password: ");
        System.out.println(Arrays.toString(passwd));
        */
    }
}

