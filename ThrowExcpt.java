import java.util.Scanner;
class AgeException extends Exception{
    AgeException(String st){
       // super(st);
      // System.out.println(st);
      System.out.println("you are not eligible");
    }
}
public class ThrowExcpt {
    
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter your age");
       int age =obj.nextInt();
           obj.close();
        try {
            if(age<18){
                throw new AgeException("not eligible ");
            }
            else{
                System.out.println("Eligible for voting");
            }   
        } catch (Exception e) {
            System.out.println(e);
        }
             
    }
}
