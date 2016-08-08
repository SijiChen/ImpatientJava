package com.impatient.ch02;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Created by sjchen on 8/7/16.
 */
public class Cal {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now().withDayOfMonth(1);
        int month;
        if (args.length >= 2) {
            month = Integer.parseInt(args[0]);
            int year = Integer.parseInt(args[1]);
            date = LocalDate.of(year, month, 1);
        } else {
            month = date.getMonthValue();
        }
        //System.out.println(date.getMonth());// print out AUGUST
        switch (month) {
            case 8: {
                System.out.println("August");
                break;
            }
            case 9: {
                System.out.println("September");
                break;
            }
            default:
                break;
        }
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat ");
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday
        for (int i = 0; i < value%7; i++)
            System.out.print("    ");
        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 7)
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }

}
