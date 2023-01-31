class A extends Thread{
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(i);
            if(i==3){throw new ArithmeticException ("hello word");}
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }}}}
class B extends Thread{
    public void run() {
        for(int i=10;i<15;i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }}}}
public class MulThread {
    public static void main(String[] args) {
        A obj=new A();
        B obj2=new B();
        System.out.println(obj.getName());
        System.out.println(obj2.getName());
        obj.start();
        obj2.start();
    }}
