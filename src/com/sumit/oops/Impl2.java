package com.sumit.oops;

public class Impl2 implements MyInterface{
    @Override
    public void isConnected(String s) {
        System.out.println("ppppppppppp : "+s);
    }

    @Override
    public void isStop() {

    }

    @Override
    public void isStart() {

    }

    @Override
    public void isResume() {

    }

    @Override
    public void isPause() {

    }
}

class Mainssss{
    public static void main(String[] args) {
        Impl2 m2 = new Impl2();
        m2.isConnected("sssssss");
    }
}
