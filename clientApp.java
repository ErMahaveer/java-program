import java.net.Socket;
import java.util.*;

public class clientApp {
    public static void main(String[] args) {
        try {

            Socket s=new Socket("localhost",8000);
            System.out.println("connected to server");
            while (true) {
                Scanner sc=new Scanner(System.in);
             System.out.println("enter your name");
               String name= sc.nextLine();
               System.out.println("enter your name");
                
            }
        } catch (Exception e) {
            System.out.println(e);
    }
    }
}
