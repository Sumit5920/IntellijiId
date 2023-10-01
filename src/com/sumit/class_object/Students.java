package com.sumit.class_object;

public class Students {
    //instance variable
    String name;
    int roll;

    //method to insert record

    void insertRecord(String studentName, int studentRollNumber) {
        name = studentName;
        roll = studentRollNumber;
    }

    //method to display information
    void displayInformation() {
        //code executed void have nothing return if return anything replace void and provide datatype

        System.out.println("Name :-" + name);
        System.out.println("Roll No :-" + roll);
    }



    //create main function in a separate class
 //   public static void main(String[] args) {
        //object are created in main method

       //initialize by reference variable
//        Students st1 = new Students();
//        Students st2 = new Students();
//        //store data for one student /initialize
//        st1.name="priya";
//        st1.roll=101;
//        st2.name="Rahul";
//        st2.roll=102;
//
//        //print information
//        st1.displayInformation();
//        st2.displayInformation();


        //initialize by method (insert)
//        Students st1 = new Students();
//        Students st2 = new Students();
//st1.insertRecord("Priya",101);
//st2.insertRecord("Rahul",102);
//
//st1.displayInformation();
//st2.displayInformation();

   // }
}
