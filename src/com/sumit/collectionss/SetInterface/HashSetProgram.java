package com.sumit.collectionss.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetProgram {
    public static void main(String[] args) {
        Set<Object> objects = new HashSet<>();

        objects.add(10);
        objects.add(20);
        objects.add(30);
        objects.add(40);
        objects.add(2.87);
        objects.add("Ram");
        objects.add(null);
        //insertion order is not preserved
       objects.add("Ram");//duplicate is not allowed

        System.out.println(objects);

        System.out.println("===============");

        objects.remove(null);
        System.out.println(objects);

        System.out.println("=================");

        System.out.println("cont  "+objects.contains(2.87));
        System.out.println(objects.isEmpty());
        System.out.println(objects.size());
      // objects.clear();


    }
}
