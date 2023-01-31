class A{ int x=5;
    A(){
        System.out.println("constructor A");
    }}
 class B extends A { int y=10;
    B(){
            System.out.println("constructor B");
    }
    void disp(){
        System.out.println("child");
    }
}
 class C extends B {
    int z=20;
    
    }

public class Single{
    public static void main(String[] args){
 
        C my =new C();
        System.out.println(my.x);
         System.out.println(my.y);
      
           }
    
}
