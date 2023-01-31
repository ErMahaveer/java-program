import java.net.Socket;

public class Client2 {  // 10.68.98.197
public static void main(String[] args) {
           try {  
               Socket s=new Socket("172.18.201.204", 8000);
                 System.out.println("hello");  
            
           }            
               
    catch (Exception e) {
        // TODO: handle exception
    }
    
}
}
