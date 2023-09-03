package com.sumit.oops;

public class InheritanceDemo {
    public static void main(String[] args) {

        int a = 10, b = 20;
//        Mathematics m = new Mathematics();
//        int ans = m.getSum(a, b);
//        System.out.println(ans);
//
//        Mathematics m2 = new Mathematics2();
//        System.out.println( m2.getSum(30,50));

//        Mathematics2 child = new Mathematics2();
//        System.out.println(child.getSum(10, 40));

    }
}

class Mathematics {

    public int getSum(int abs, int bds) {
        return abs + bds;
    }

}

class Mathematics2 extends Mathematics {

    //method-overloading -> compile time polymorphism
    public String getSum1(String abs, String bds) {
        return abs + bds;
    }

    public int getSum1(int abs, int bds) {
        return abs + bds;
    }

    //method-overriding -> run time polymorphism
    public int getSum(int abs, int bds) {
        return abs * bds;
    }

}
