package com.impatient.ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by sjchen on 8/7/16.
 */
public class ArrayListDemo {
    public static void main(String[] arg){
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Peter");
        friends.add("Paul");
        friends.remove(1);
        friends.add(0,"Paul");
        System.out.println(friends);

        ArrayList<String> copiedFriends;
        copiedFriends = new ArrayList<>(friends);
        copiedFriends.set(0,"Fred");
        System.out.println("copiedFriends: "+copiedFriends);
        System.out.println("friends:"+friends);

        String[] temp = {"Peter","Paul","Mary"};
        friends=new ArrayList<>(Arrays.asList(temp));
        String[] names=friends.toArray(new String[0]);
        System.out.println("names="+Arrays.toString(names));

        ArrayList<String> moreFriends = new ArrayList<>(Arrays.asList(names));
        System.out.println("moreFriends: "+moreFriends);

        Collections.reverse(friends);
        System.out.println("after reversing, friends="+friends);
        Collections.shuffle(friends);
        System.out.println("after reversing, friends="+friends);
        Collections.sort(friends);
        System.out.println("after reversing, friends="+friends);

    }
}
