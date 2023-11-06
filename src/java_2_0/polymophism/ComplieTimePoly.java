package java_2_0.polymophism;

public class ComplieTimePoly {
    public static void main(String[] args) {

        Sumit s = new Sumit();
        s.m1();
        Chsumit ch = new Chsumit();
        ch.m1();
        s.sum(10,20);
    }
}
class Sumit{

    void m1(){
        System.out.println("Sumit");
    }
    int a ;
    int b;
    void sum(int a ,int b){
        System.out.println(a+b);
    }

}

class Chsumit extends Sumit{

    void m1(){
        System.out.println("Chsumit");
    }
}