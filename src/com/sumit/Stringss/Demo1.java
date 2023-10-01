package com.sumit.Stringss;

public class Demo1 {
    public static void main(String[] args) {

//        String s = "Hello";
//        System.out.println(s.charAt(3));//l
//        System.out.println(s.length());//5
//        System.out.println(s.toLowerCase());//hello
//        System.out.println(s.toUpperCase());//HELLO
        String s= "Hello java";


      //  System.out.println(s.replace('a','i'));//s.replace('a','i')
        System.out.println(s.replace("java","Python"));//Hello Python
        System.out.println(s.indexOf('o'));//4
        System.out.println(s.isEmpty());//false
        System.out.println(s.substring(4));// o java
        System.out.println(s.substring(0,5));//Hello strat for indexing from 0 and end for indexing from 1

        String t="  Wel come  ";
        System.out.println(t.contains("come"));//true
        System.out.println(t.trim());//Wel come
        //compare both string
        System.out.println(s.equals(t));//false
        System.out.println(s+t);//Hello java  Wel come

    }
}
