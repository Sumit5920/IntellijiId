package com.sumit.collectionss;

import java.util.ArrayList;

public class ArrayLIstss {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(null);
        arrayList.add(0);
        ArrayList cc = (ArrayList) arrayList.clone();

        System.out.println(arrayList);
        System.out.println(cc);
    }
}
