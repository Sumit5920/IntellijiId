package java_2_0.inheritance;

public class ClassMain {
    public static void main(String[] args) {
//        Bmw bmw = new Bmw();
//        bmw.engine("BMW engine");
//        bmw.getColor();

        Car c= new Car();
        c.engine("bmw");



        Mahindra mahindra = new Mahindra();
        mahindra.engine("mahindra engine");

    }
}

class Car {

    public void engine(String engineType) {
        System.out.println(engineType);
    }
}

class Bmw extends Car {

    public void getColor(){
        System.out.println("BMW color");
    }
}

class Tata extends Car {
}

class Mahindra extends Car {

    public void getColor(){
        System.out.println("MAH color");
    }
}

class maruti extends Car {

}
