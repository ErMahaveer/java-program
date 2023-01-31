import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.*;
public class Urljar {
    public static void main(String[] args) throws IOException{
        try {        
            URL url=new URL("http://api.openweathermap.org/geo/1.0/direct?q=jaipur,rajsthan,+91&limit=5&appid=1839dc90021cf5138717ac80f46a7fef");
               HttpURLConnection dat=(HttpURLConnection)url.openConnection();
               dat.setRequestMethod("GET");
               InputStreamReader in =new InputStreamReader(dat.getInputStream());
               BufferedReader in1=new BufferedReader(in);
                  String st="";
               while (st!=null) {            
                    st=in1.readLine();
                    System.out.println(st); 
                JSONParser par=new JSONParser();
                JSONArray array=(JSONArray) par.parse(st) ;
                JSONObject obj=(JSONObject)array.get(0) ;
             //   for(int i=0; i<array.size();i++){
                System.out.println(obj.get("name"));
              double lat= (double)obj.get("lat");
              System.out.println(lat);
              double lon= (double)obj.get("lon");
              System.out.println(lon);
              File ac=new File("My.txt");            
             //  }
            }                   
            in1.close(); 
            } catch (Exception e) {
              System.out.println(e);  
             }}}



