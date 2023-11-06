package java_2_0;

public class Encapsulation {

    public static void main(String[] args) {



//        SuperClass s = new SuperClass();
//        int res = s.a;
//        //int res2 = s.b;//'b' has private access in 'java_2_0.SuperClass'
//        System.out.println(res);
//
//        DerivedClass s  = new DerivedClass();
//        s.setApple(500);
//        System.out.println(s.getApple());

//        System.out.println(Singleton.getInstance().s);
//        System.out.println(Singleton.getInstance().getSum());x

        SuperClass x = new SuperClass();
        SuperClass y = new SuperClass();
        SuperClass z = new SuperClass();

        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());
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
