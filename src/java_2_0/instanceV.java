package java_2_0;

public class instanceV {
    public static void main(String[] args) {
        Demo2 d=new Demo2();

    }


}

class Parent{
    static int s = 200;
    static {
        System.out.println("inside static block");
    }
}
class Demo2 extends Parent

{
    int a=10;
     Demo2()
     {
         System.out.println("Inside Constructor");
     }

    {
        System.out.println("Inside the instance block");
    }
}
