package java_2_0;

public class Encapsulation {

    public static void main(String[] args) {

//        SuperClass s = new SuperClass();
//        int res = s.a;
//        //int res2 = s.b;//'b' has private access in 'java_2_0.SuperClass'
//        System.out.println(res);

        DerivedClass s  = new DerivedClass();
        s.setApple(500);
        System.out.println(s.getApple());
    }
}

class SuperClass {

    int a = 10;
    private int b = 10;
}

class DerivedClass {

    int apple = 3;//apple = 500

    public int getApple(){
        return apple;
    }

    public void setApple(int apple){
        this.apple = apple;
    }

}
