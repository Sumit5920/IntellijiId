package sumitOpps.basic;

public class Abstraction {

    public static void main(String[] args) {

//        Car c1 = new Car();
//        c1.start();
//        Scooter sc = new Scooter();
//        sc.start();
        //replace with

        Vechial vc;
        vc =new Car();
        vc.start();
    vc.disp();
        vc=new Scooter();
        vc.start();
        vc.sum(10,20);
    }
}

abstract class Vechial{

    abstract void start();

    abstract  void sum(int a,int b);

    void disp()
    {
        System.out.println("display");
    }
}
class Car extends Vechial{
    void start(){
        System.out.println("Start with kay");
    }
    public void sum(int a,int b){
//        System.out.println("car clss "+(a+b));
    }


}
class  Scooter extends Vechial{

    void start(){
        System.out.println("start with kick");
    }
    public void sum(int a,int b){
        System.out.println("scooter cls "+(a+b));

    }
}