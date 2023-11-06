package java_2_0.polymophism;

public class PolyMophismClass {
    public static void main(String[] args) {

//        Child1 child1 = new Child1();
//        child1.cry1();
//        Child2 child2 = new Child2();
//        child2.cry2();

        ParentMain pm;
        ParentMain pms = new ParentMain();
        pms.cry();
        pm = new Child1();
        pm.cry();

        pm = new Child2();
        pm.cry();
        pm = new Child3();
        pm.cry();



    }
}

class ParentMain {

    public void cry() {

        System.out.println("parent cry");
    }
}

class Child1 extends ParentMain {
    public void cry() {

        System.out.println("child1 cry");
    }
}

class Child2 extends ParentMain {
    public void cry() {

        System.out.println("child2 cry");
    }
}

class Child3 extends ParentMain {
    public void cry() {
        System.out.println("child3 cry");

    }
}