package com.sumit.commonprogram;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        String temp = "";

        for (int i = 0; i < s.length(); i++){
            temp = s.charAt(i) + temp;
        }

        System.out.println("Reverse of "+ s +" is: "+temp);
    }
}
