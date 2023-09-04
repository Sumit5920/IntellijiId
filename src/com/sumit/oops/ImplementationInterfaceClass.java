package com.sumit.oops;

public class ImplementationInterfaceClass implements MyInterface {

    @Override
    public void isConnected(String s) {

        System.out.println("isConnected()"+s);

    }

    @Override
    public void isStop() {

        System.out.println("isStop()");

    }

    @Override
    public void isStart() {

        System.out.println("isStart()");

    }

    @Override
    public void isResume() {
        System.out.println("isResume()");
    }

    @Override
    public void isPause() {

        System.out.println("isPause()");
    }
}

class MainClass{
    public static void main(String[] args) {

//        ImplementationInterfaceClass m = new ImplementationInterfaceClass();
        MyInterface m = new ImplementationInterfaceClass();
        m.isConnected("sumit");

    }
}
