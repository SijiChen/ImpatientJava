package com.impatient.ch02;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by sjchen on 8/7/16.
 */
public class RandomNumbers {

    private static Random generator = new Random();

    /**
     * generate a random number from [low to high)
     * @param low included
     * @param high not included
     * @return
     */
    public static int nextInt(int low, int high) {
        return low + generator.nextInt(high - low);
        // Ok to access the static generator variable
    }
    public static int randomElement(ArrayList<Integer> list){
        if(list.isEmpty()) return 0;
        int ran= RandomNumbers.nextInt(0,list.size()-1);
        return  list.get(ran);
    }
}
