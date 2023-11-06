package com.sumit.collectionss.OueueIneterface;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriortyOueues {
    public static void main(String[] args) {
//        Queue<Integer> objects = new PriorityQueue<>();
//
//        objects.offer(1000);
//        objects.offer(20);
//        objects.offer(300);
//        objects.offer(40);
//        System.out.println(objects);// [20, 40, 300, 1000] it work on (mini heap)small value have first priority
//
//        System.out.println(objects.peek());//20
//        System.out.println(objects.poll());//20
//        System.out.println(objects);//[40, 1000, 300]


        Queue<Integer> objects = new PriorityQueue<> (Comparator.reverseOrder());

        objects.offer(1000);
        objects.offer(20);
        objects.offer(300);
        objects.offer(40);
        System.out.println(objects);//it works on max heap (Large value priority)

        System.out.println(objects.peek());
        System.out.println(objects.poll());
        System.out.println(objects);
    }
}
