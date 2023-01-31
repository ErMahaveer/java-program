import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class Url {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://api.openweathermap.org/data/2.5/weather?lat=26.9124&lon=75.7873&appid=1839dc90021cf5138717ac80f46a7fef");
            HttpURLConnection dat=(HttpURLConnection)url.openConnection();
            dat.setRequestMethod("GET");

           InputStreamReader in =new InputStreamReader(dat.getInputStream());
           BufferedReader in1=new BufferedReader(in);
              String st="";
           while (st!=null) {            
                st=in1.readLine();
               System.out.println(st);              
            }                   
            in1.close(); 
         } catch (Exception e) {
           System.out.println(e);
        }
    }
}