import java.net.*;
import java.util.Scanner;
import java.io.*;
public class Server {
public static void main(String[] args) {
    try {  String str="",str2="";
        ServerSocket ss=new ServerSocket(8086);
        System.out.println(InetAddress.getLocalHost());
        System.out.println(InetAddress.getLocalHost().getHostName());
        Scanner sc1=new Scanner (System.in);
        
        while (true){
          System.out.println("connection reset");
     Socket s=ss.accept(); // to establish the connection
    InetSocketAddress socketAddress=(InetSocketAddress)s.getRemoteSocketAddress();
    System.out.println(socketAddress);
    String clientIpAddress=socketAddress.getAddress().getHostAddress();
    System.out.println(clientIpAddress);
    Scanner sc=new Scanner(s.getInputStream());
     PrintStream ps=new PrintStream(s.getOutputStream());
     while(true){
     str=sc1.nextLine();
     ps.println(str);
     if(str.equals("Bye")){   break;}   
      str2=sc.nextLine();
      System.out.println(str2);
      if(str2.equals("Bye")){     break;     }
      ps.flush();
        }
    s.close();
  } 
   } catch (Exception e) {   System.out.println(e);  }
} }