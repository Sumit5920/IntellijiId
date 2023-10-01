package com.sumit.Arrayss;

import java_2_0.utility.Utilities;

public class Demo1 {

    //store 5 student's roll number
    public static void main(String[] args) {
        int[] ar = new int[5];
        //insert value;
        ar[0] = 12;
        ar[1] = 22;
        ar[2] = 32;
        ar[3] = 45;
        ar[4] = 25;


        //2nd way
       // int [] ar={12,22,32,45,25};// size is not fixed



        //size of array
        System.out.println("Size 0f Array "+ar.length);
        //read value of array
        System.out.println("value of 4th element "+ ar[3]);
        //read all value
        for(int i=0;i<ar.length;i++)
        {
            //System.out.println(ar[i]);
        }


    }
}
