class A{ int x=5;
        void show(){
        System.out.println("class A");
    }
}
 class B extends A { 
    void show(){ int x=10;
     System.out.println(x*x);
     super.show();
    }
       }
public class Single{
    public static void main(String[] args){
         B obj =new B();
        obj.show();
           }   
}