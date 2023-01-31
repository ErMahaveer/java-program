import java.net.*;
public class Server2 {
    public static void main(String[] args) {
              try { 
        ServerSocket ss=new ServerSocket(8080);
        System.out.println("server is running....");
               while (true){
             Socket s=ss.accept(); // to establish the connection
             System.out.println(s.getRemoteSocketAddress());

   // InetSocketAddress ip=(InetSocketAddress)s.getRemoteSocketAddress();
    
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
    
}
