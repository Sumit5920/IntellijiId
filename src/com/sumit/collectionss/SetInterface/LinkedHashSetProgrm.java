package com.sumit.collectionss.SetInterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetProgrm {
    public static void main(String[] args) {

        Set<Object> objects = new LinkedHashSet<>();


        objects.add(10);
        objects.add(20);
        objects.add(30);
        objects.add(40);
        objects.add(2.87);
        objects.add("Ram");
        objects.add(null);
        System.out.println(objects);
        //insertion order is preserved

    }
}
