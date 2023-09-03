package com.sumit.oops;

class Abstractions {
    public static void main(String[] args) {

//        ImplementationClass impl = new ImplementationClass();
//        impl.getSum(10, 20);
//        impl.getGoCart();
//
//
//        ImplementationClass1 imp1 = new ImplementationClass1();
//        imp1.getSum(40, 20);
//
//        ImplementationClass2 imp2 = new ImplementationClass2();
//        imp2.getSum(70, 20);

//      create reference of an abstract class
        Mains impl;
        impl = new ImplementationClass();
        impl.getSum(10, 50);
        impl.getSum1(10, 40);
        impl = new ImplementationClass1();
        impl.getSum(10, 20);
        impl.getSum1(10, 40);
        impl = new ImplementationClass2();
        impl.getSum(30, 10);
        impl.getSum1(120, 40);
    }
}

class ImplementationClass extends Mains {


    @Override
    void getSum(int a, int b) {
        System.out.println("ImplementationClass : " + (a + b));
    }

    @Override
    void getSum1(int a, int b) {

    }
}

class ImplementationClass1 extends Mains {

    @Override
    void getSum(int a, int b) {
        System.out.println("ImplementationClass1 : " + (a * b));
    }

    @Override
    void getSum1(int a, int b) {

    }
}

class ImplementationClass2 extends Mains {

    @Override
    void getSum(int a, int b) {
        System.out.println("ImplementationClass2 : " + (a / b));
    }

    @Override
    void getSum1(int a, int b) {

    }
}

abstract class Mains {
    abstract void getSum(int a, int b);

    abstract void getSum1(int a, int b);

//    void getGoCart(){
//        System.out.println("inside the abstract class with non-abstract method");
//    }
}



