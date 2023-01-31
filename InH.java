 class A{
    void show(){
        System.out.println("parent");
    }}
 class B extends A {
    void disp(){
        System.out.println("child");
    }}
 class C extends B {
    void view(){
        System.out.println("child2");
    }
}


public class InH {
    public static void main(String[] args){
 A obj1=new A();
 B obj2=new B();
 C obj3=new C();
 obj1.show();
 obj2.show();
 obj3.show();
 obj3.disp();
    }
}
