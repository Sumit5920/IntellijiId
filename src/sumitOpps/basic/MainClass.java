package sumitOpps.basic;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Person p1 = new Person();
        p1.age =24;
        p1.name="Sumit";

        Person p2 = new Person();
        p2.age =34;
        p2.name="Amit";
        System.out.println(p1.name+" and "+p1.age);

       // p1.eat();
        p1.walk(30 );

//        p2.eat();
         p2.walk();

    }
}
class Person{
    String name;
    int age;

    void walk()
    {
        System.out.println(name + " is walking");
    }
    void eat(){
        System.out.println(name+" is eating");
    }
    void walk(int steps)
    {
        System.out.println(name+" is walking steps is :-"+steps);
    }
}
