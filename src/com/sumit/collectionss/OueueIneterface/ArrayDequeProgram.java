package com.sumit.collectionss.OueueIneterface;

import java.util.ArrayDeque;

public class ArrayDequeProgram {
    public static void main(String[] args) {

        ArrayDeque<Integer> objects = new ArrayDeque<>();

        objects.offer(400);
        objects.offer(10);
        objects.offer(20);
        objects.offer(40);
        objects.offer(30);
        objects.offer(1000);
        System.out.println(objects);

        System.out.println("============");

        System.out.println(objects.peek());
        System.out.println(objects.peekFirst());
        System.out.println(objects.peekLast());

        System.out.println("====================");

        System.out.println(objects.poll());
        System.out.println(objects.pollFirst());
        System.out.println(objects.pollLast());

        System.out.println("====================");

        System.out.println(objects.offerFirst(2));
        System.out.println(objects);
        System.out.println(objects.offerLast(3));
        System.out.println(objects);
    }
}
