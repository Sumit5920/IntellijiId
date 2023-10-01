package com.sumit.Methods;

public class Parameterized {

    //no return
//    static void sum(int a,int b)
//    {
//        System.out.println("sum of a and b is "+(a+b));
//    }

    //return

    static int sum(int a,int b)
        {
       // System.out.println("sum of a and b is "+(a+b));
            return (a+b);
   }
    public static void main(String[] args) {

        Parameterized p = new Parameterized();
      //  sum(4,6);//method accept only 2 parameters//without return statement

        int result = sum(4,6);
        System.out.println("sum of a n b "+result);
    }
}

