package com.impatient.ch06;

import java.util.function.Predicate;

/**
 * Created by sjchen on 8/16/16.
 */
public class Arrays {
    public static <T> void swap(T[] array, int i, int j)
    {
        T temp = array[i];
        array[i] = array[j];
        array[j]=temp;
    }
    public static <T> T[] swap(int i, int j, T... values){
        T temp = values[i];
        values[i] = values[j];
        values[j]= temp;
        return values;
    }
    public static <T> void printAll(T[] elements, Predicate<? super T> filter){
        for(T e: elements){
            if(filter.test(e))
                System.out.println(e.toString());
        }
    }
}
