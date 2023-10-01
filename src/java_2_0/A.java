package java_2_0;

public class A {
    public static void main(String[] args) {

        Constructors obj = new Constructors(10);

        Constructors obj1 = new Constructors(10,20);
//        Constructors obj2 = new Constructors(10,"hello");

        System.out.println("inside method: "+obj.getAAA());
        System.out.println("inside method: "+obj1.getAAA());


    }
}
