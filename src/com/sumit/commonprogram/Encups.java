package com.sumit.commonprogram;

public class Encups {
    public static void main(String[] args) {
        Demo demo = new Demo();
       // demo.a = 10;
       // System.out.println( demo.sum());

       // System.out.println(demo.getData());
       demo.setData(100);
        System.out.println(demo.getData());
       // System.out.println(demo.a);


    }
}

class Demo
{
//    int a = 10;
private int a = 10;
    public int getData()
    {
       return a;
    }

    public void setData (int a)
    {
        this.a= a;
    }
}
