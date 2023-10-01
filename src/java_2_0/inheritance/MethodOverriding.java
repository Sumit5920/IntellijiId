package java_2_0.inheritance;

public class MethodOverriding {
    public static void main(String[] args) {
//        ChildClass obj = new ChildClass();
//        obj.getName();

        ParentClass parentClass = new ParentClass();
        parentClass.getName();
    }
}

class ParentClass{
    public void getName(){
        System.out.println("parent");
    }
}

class ChildClass extends ParentClass{
    public void getName(){
        System.out.println("child");
    }
}