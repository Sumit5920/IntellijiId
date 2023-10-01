package com.sumit.class_object;

public class StundentsMain {
    public static void main(String[] args) {


       // initialize by method
        Students st1 = new Students();
        Students st2 = new Students();
st1.insertRecord("Priya",101);
st2.insertRecord("Rahul",102);

st1.displayInformation();
st2.displayInformation();
    }
}
