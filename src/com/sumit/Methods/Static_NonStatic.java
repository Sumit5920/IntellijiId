package com.sumit.Methods;

public class Static_NonStatic {

    /*static*/ void printMsg() {
        System.out.println("Welcome java");
    }

    public static void main(String[] args) {
        //call method if method is static
      //  printMsg();//b/c it is a static() so we don't need to create an object

        //if method is non-static the create a method n then call
        Static_NonStatic cl = new Static_NonStatic();
        cl.printMsg();
    }
}
