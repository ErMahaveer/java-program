import java.util.Scanner;
public abstract class Abst { 
    Scanner sc=new Scanner(System.in);
    static double x,y;
    void add(){
       double  x=sc.nextDouble();
       double  y=sc.nextDouble();
        System.out.println("add"+(x+y));
    }
    void sub(){
        x=sc.nextDouble();
        y=sc.nextDouble();
        System.out.println("sub"+(x-y));
    }
    void mul(){
        x=sc.nextDouble();
         y=sc.nextDouble();
        System.out.println("mul"+(x*y));
    }
    void div(){
        x=sc.nextDouble();
        y=sc.nextDouble();
        System.out.println("div"+(x/y));
    }
    void sqr(){
        x=sc.nextDouble();
        System.out.println("sqr"+(x*x));
    }
    void sin(){
        x=sc.nextDouble();
        System.out.println(Math.sin(Math.toRadians(x)));
    }
    void cos(){
        x=sc.nextDouble();
        System.out.println(Math.cos(Math.toRadians(x)));
    }
    void tan(){
        x=sc.nextDouble();
        System.out.println(Math.tan(Math.toRadians(x)));
    }
  /*  void cot(){
        System.out.println(Math.cot(Math.toRadians(x)));
    }
    void sec(){
        System.out.println(Math.sec(Math.toRadians(x)));
    }
    void cosec(){
        System.out.println(Math.cosec(Math.toRadians(x)));
    } */
    public static void main(String[] args) {
    
    }
}
