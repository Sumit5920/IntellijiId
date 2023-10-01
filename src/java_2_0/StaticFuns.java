package java_2_0;

public class StaticFuns {

    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        Demo2 d = new Demo2();
//        System.out.println(d.sum());

//        int s =Demo.a;
//        System.out.println(s);

//        System.out.println(Demo.sum());


    }
}

class Demo7 {

    String s = "Pravakatr";
    static int a = 10;
    static int b = 20;


//    public int sum()
//    {
//        return a+b;
//    }

    public static int sum() {
        return a + b;
    }

}
