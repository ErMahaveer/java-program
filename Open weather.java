import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.URL;
import java.util.Scanner;
import java.io.*;
import java.net.*;

public class Main
{
    public static void main(String[] agrs)
    {
        try
        {
            // Scan tha user input
            Scanner sca = new Scanner(System.in);
            System.out.println("Enter State" );
            String state =sca.nextLine();
            System.out.println("Enter your city name");
            String city = sca.nextLine();

            JSONParser pas = new JSONParser();
            FileReader fl =new FileReader("State.json");
            Object obe = pas.parse(fl);

            JSONObject ojs = (JSONObject)obe;
            System.out.println(ojs.get(state));

            // connection karne ke liye code.
            URL url = new URL("http://api.openweathermap.org/geo/1.0/direct?q="+city+","+(ojs.get(state))+",IN&appid=40a67ea8f8fa0636b7ea6339f82e2d31");
            HttpURLConnection obj = (HttpURLConnection) url.openConnection();
            obj.setRequestMethod("GET");

            // site se data read karne ke kiye.
            InputStreamReader in = new InputStreamReader(obj.getInputStream());
            BufferedReader in1 = new BufferedReader(in);
            String st = in1.readLine();

            JSONParser pa = new JSONParser();
            JSONArray array = (JSONArray) pa.parse(st);
            JSONObject obj1 = (JSONObject) array.get(0);


            URL url1 = new URL("https://api.openweathermap.org/data/2.5/weather?lat="+(obj1.get("lat"))+"&lon="+(obj1.get("lon"))+"&appid=40a67ea8f8fa0636b7ea6339f82e2d31");
            HttpURLConnection obh = (HttpURLConnection) url1.openConnection();
            obh.setRequestMethod("GET");

            InputStreamReader ins = new InputStreamReader(obh.getInputStream());
            BufferedReader in2 = new BufferedReader(ins);
            String st1 = in2.readLine();


            JSONParser par = new JSONParser();
            JSONArray arr = (JSONArray) par.parse(st1);
            JSONObject obj3 = (JSONObject) array.get(0);
            for(String i : arr)
            {
                System.out.println(i);
            }
            System.out.println(obj3);
        }
        catch(Exception protException)
        {
            System.out.println(protException);
        }
    }
}