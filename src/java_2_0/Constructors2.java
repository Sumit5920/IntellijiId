package java_2_0;
 class Cons {
    public static void main(String[] args) {
        Child cc = new Child(10, 20);
    }
}


class Parents {

    Parents() {
        System.out.println("inside parent class constructor");
    }

    Parents(int a, int b) {
        System.out.println("inside parent class constructor: " + (a+b));
    }

}

class Child extends Parent {

    Child(int a) {
        System.out.println("inside same constructor class: "+a);
    }
    Child(int a, int b) {
        this(10);
    }
//    Child(int a, int b) {
//        super(a, b);
//    }
}
