import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(8000);
            System.out.println("server is running....");
            while(true){
                Socket s= ss.accept();
                System.out.println("connected");
            }
            
        } catch (Exception e) {
            System.out.println(e);
    }
}
}