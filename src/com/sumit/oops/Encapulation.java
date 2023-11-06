package com.sumit.oops;

public class Encapulation {
    public static void main(String[] args){


        //		Child object = new Child();
        //		object.a = 20;
        ////		object.getAge();
        //
        //		object.setA(100);
        //		System.out.println(object.getA());
        ////		System.out.println(object.a);
        //
        //		System.out.println(object.getName());
        //
        //		object.setName("Rama");
        //
        //		System.out.println(object.getName());


        Childs object = new Childs();
        //     object.getAverage(); // exception handling as Arithmetic exception

       // object.getDivide();


    }


}

class Parents{

    //	Parent(String a, String b, String c) {
    //		System.out.println("inside the parent class" + a + b + c);
    //	}

}

class Childs extends Parents{


    //	Child(){
    //		super("aman","kamal", "shyam");
    ////		System.out.println("inside the child class");
    //
    //	}

    //	Child(String a, String b){
    //
    //		System.out.println("inside the child class "+a + ":"+b);
    //
    //	}
    //
    //	Child(String a, String b, String c){
    //
    //		System.out.println("inside the child class "+a + ":"+b);
    //
    //	}

    	//data hide
    	private int a = 30;
    	public int getA() {
    		return a;
    	}
    	public void setA(int a) {
    		this.a = a;
    	}
    	private void getAge() {
    		System.out.println("inside child class: "+ a);
    		a = 80;
    		System.out.println("inside child class: "+ a);

    	}

    	private String name = "Sumit";

    	public void setName(String name) {

    		this.name = name;//Rama
    	}

    	public String getName() {
    		return name;
    	}


    //Exception handling
    //	void getAverage() {

    //		int sum = 100/10;
    //		System.out.println(sum);
    //		try {
    //			int a = 100/0;
    //			System.out.println(a);
    //		}catch(Exception exc) {
    //			System.out.println("inside exception");
    //			exc.printStackTrace();

    //	}

//    void getDivide()
//    {
//        int ar[] = new int[7];
//
//        for(int i = 0; i <5; i++) {
//            ar[i] = i;
//        }
//        for(int i = 0; i <7; i++) {
//            System.out.println(ar[i]);
//        }
//
//    }

}
