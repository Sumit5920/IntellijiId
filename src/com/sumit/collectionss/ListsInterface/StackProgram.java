package com.sumit.collectionss.ListsInterface;

import java.util.Stack;

public class StackProgram {
    public static void main(String[] args) {

        Stack<String> objects = new Stack<>();
        objects.push("Lion");
        objects.push("Horse");
        objects.push("Cat");
        objects.push("Dog");
        System.out.println("Stack"+objects);
        System.out.println(objects.peek());
        System.out.println(objects.pop());
        System.out.println(objects);
        System.out.println(objects.peek());
        System.out.println(objects.search("Lion"));
    }
}
