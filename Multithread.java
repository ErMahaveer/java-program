import java.util.Scanner;
class Thread_one extends Thread{
    public void run(){
        System.out.println("Enter your name");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name+"hello");
    }}
class Thread_two extends Thread{
    public void run(){
       System.out.println("Enter your id");
        Scanner sc=new Scanner(System.in);
        int id =sc.nextInt();
        System.out.println(id+"number");
    }}
public class Multithread {
    public static void main(String[] args) {
        Thread_one t1=new Thread_one();
        Thread_two t2=new Thread_two();
         t1.start();
         try {
             t1.join();
            } catch (Exception e) {
                System.out.println(e);
            }            


            
            t2.start();
    }}
