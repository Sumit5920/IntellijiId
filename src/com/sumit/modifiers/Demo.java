package com.sumit.modifiers;

public class Demo {

    //same work as  private default and public  variable
    //instance variable
    String schoolName = "Gayn Mandir";//here default so access anywhere in package
    void welComeMsg(String name)//it is default modifier so call the whole package
            //if we write private modifier the call only this class only
            // if we write public modifier the call anywhere of project (crete object od this class and call)


    {
        System.out.println("WelCome "+name);
    }
}
