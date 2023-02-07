import java.net.*;
import java.util.Scanner;
import java.io.*;
public class Client {
    public static void main(String[] args) {
        try { String str="",str2="";
        while (true) {
          Scanner sc1=new Scanner(System.in);
          String ch=sc1.nextLine();
          if(ch.equals("on")){
             Socket s=new Socket("localhost", 8080);
             Scanner sc=new Scanner(s.getInputStream());
             PrintStream ps=new PrintStream(s.getOutputStream());
          
             while(true){
             str=sc.nextLine();
            System.out.println(str);
            str2=sc1.nextLine();
            ps.println(str2);
         if(str.equals("Bye")){   break;      }
         ps.flush();
           }
           s.close();
          }  }   
        } catch (Exception e) {  System.out.println(e);}      
    }
}