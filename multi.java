class A {
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(i);
            if(i==3){{throw new ArithmeticException("hello word");}}
           }}}
class B {
    public void run() {
        for(int i=10;i<15;i++){
            System.out.println(i);
            }}} 
public class multi {
    public static void Show(){

    }
    public static void main(String[] args) {
        A obj=new A();
        B obj2=new B();

        obj2.run();
        obj.run();
        obj2.run();
    }
}
