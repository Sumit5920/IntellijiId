package sumitOpps.basic;

public class Encapsl {
    public static void main(String[] args) {

        Numbers n = new Numbers();

        // int a=10 ke lia
//        int  s = n.a;
//        System.out.println(s);


        //int b ke lia
        n.setb(10,25);
        System.out.println(n.getb());



    }

}
class Numbers{
   // int a=10;
   private int b;
   private int c;

   public void setb(int b,int c){
       this.b=b;
       this.c=c;
   }
   public  int getb(){
       int d=b+c;
       return d;
   }


}

