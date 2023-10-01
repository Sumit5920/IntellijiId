package com.sumit.Arrayss;

public class TwoD_Array {
    public static void main(String[] args) {

        int ar [][] = new int [3][2]; // 3 row 2 column
       // ar[row][column]=data
        ar[0][0]= 12;
        ar[0][1]= 13;

        ar[1][0]= 14;
        ar[1][1]= 15;

        ar[2][0]= 16;
        ar[2][1]= 17;

        //2nd way
     //   int ar[][] ={{12,13},{14,15},{16,17}};//length is not fixed
        System.out.println("No of row "+ar.length);
        System.out.println("No of column "+ar[0].length);//any row of length property b/c all have same number or column


        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.println(ar[i][j]);
            }
        }
    }
}
