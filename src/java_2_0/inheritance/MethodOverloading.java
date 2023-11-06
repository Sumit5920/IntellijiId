package java_2_0.inheritance;

public class MethodOverloading {

    public static void main(String[] args) {
//        School obj = new School();
//        System.out.println("ng: "+obj.Sum(1, 2));
//        System.out.println("ngt: "+obj.Sum(1, 2, 3));
//        System.out.println("nosegay: "+obj.Sum(1, 2, 3, 4));

        ParentClass pp = new ChildClass();
        pp.getName();
    }
}

class School{

    public int Sum(int noOfGirls, int noOfBoys ){

        return noOfBoys+noOfGirls;
    }
    public int Sum(int noOfGirls, int noOfBoys, int transGender ){

        return noOfBoys+noOfGirls+transGender;
    }

    public int Sum(int noOfGirls, int noOfBoys, int transGender, int noOfGay ){

        return noOfBoys+noOfGirls+transGender+noOfGay;
    }
}

class NJGM extends School
{
    public int Sum(int noOfGirls, int noOfBoys ){

        return noOfBoys+noOfGirls;
    }
}
