package com.sumit.collectionss.OueueIneterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueProgram {
    public static void main(String[] args) {

        Queue<Integer> objects = new LinkedList<>();
        objects.offer(10);
        objects.offer(20);
        objects.offer(30);
        objects.offer(40);
        System.out.println(objects);
        System.out.println(objects.poll());
        System.out.println(objects);
        System.out.println(objects.peek());


        objects.add(100);
        objects.add(200);
        objects.add(300);
        System.out.println(objects);
        objects.clear();
        System.out.println(objects);

        System.out.println(objects.peek());//null
     //   System.out.println(objects.element());//NoSuchElementException

        System.out.println(objects.poll());//null
       // System.out.println(objects.remove());//NoSuchElementException
    }
}
