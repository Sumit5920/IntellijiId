package com.sumit.collectionss.ListsInterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayLIstss {

    public static void main(String[] args) {
//        ArrayList<String> ac = new ArrayList<>();//empty array list
//        ac.add("Rahul");

        List<Integer> list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);
        System.out.println(list);
        list.add(1,50);
        System.out.println(list);

        List<Integer> newlist =new ArrayList();
        newlist.add(101);
        newlist.add(103);
        System.out.println(newlist);
        list.addAll(newlist);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.contains(2));
        list.set(2,40);
        System.out.println(list);
        System.out.println("=================================");
        List<Integer> al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        al.add(70);
        al.add(80);
        al.add(90);
        System.out.println(al);

        al.remove(0);
        System.out.println(al);
        al.remove(4);
        System.out.println(al);
        al.remove(Integer.valueOf(40));
        System.out.println(al);

        al.set(2,10000);
        System.out.println(al);
        //al.clear(); // remove all al list

        
        //iterating
        //forloop
        for (int i =0;i<al.size();i++)
        {
            //System.out.println(i);//index value
            System.out.println("forloop :"+al.get(i));//value
        }
        
        
        //foreach loop

        for (Integer element:al) {
            System.out.println("foreachloop :"+ element);
        }
    }

}
