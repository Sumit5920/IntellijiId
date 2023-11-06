package com.sumit.collectionss.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapProg {
    public static void main(String[] args) {

        Map<String, Integer> hm = new HashMap<>();

        hm.put("One",1);
        hm.put("Two",2);
        hm.put("Three",3);
        hm.put("Four",4);
        hm.put("Five",5);
        System.out.println(hm);

        hm.put("Four",20);
        System.out.println(hm);//override

        System.out.println(hm.containsValue(5));

        hm.putIfAbsent("One",15);
        System.out.println(hm);
        
        
        //iterating
        for (Map.Entry<String,Integer> e:hm.entrySet()
             ) {
            System.out.println(e);
            System.out.println("==========");
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            System.out.println("=============");
            //System.out.println(e.hashCode());

            System.out.println(hm.containsValue(3));
            System.out.println(hm.isEmpty());

//            hm.remove("Three");
//            System.out.println(hm);

        }


    }
}
