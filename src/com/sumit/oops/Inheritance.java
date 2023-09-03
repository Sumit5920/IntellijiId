package com.sumit.oops;

public class Inheritance {

    public static void main(String[] args) {

        System.out.println("inside the main method");

        Child.getAns();//static method call

        int a = Child.a;

        System.out.println("static variable " + Child.a);

//        Child child = new Child();//non-static method call
//        child.getAns();

    }

    static {
        System.out.println("inside the static block");
    }

}


class Parent {

}

class Child {

    //static variable
    static int a = 10;

    //static method
    static void getAns() {
        int b = 19;
        System.out.println("Sumit");
    }

    //static block
    static {
        System.out.println("static block inside child callback");
    }

}
