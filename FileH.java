import java.io.*;

import java.util.Scanner;
public class FileH {
   static Scanner sc=new Scanner(System.in);
        static void create(){try {
            File obj=new File("NewFile.txt");
            if(obj.createNewFile()){
                System.out.println("sucessfully exist");
            }
            else{
                System.out.println("already exist");
            }
        } catch (Exception e) {
            System.out.println(e);
           
        }
           
    }
    static void write(){
        try {
            FileWriter writer=new FileWriter("NewFile.txt",true);
            System.out.println("enter your user name\t");
            String name=sc.nextLine();
            System.out.println("enter your password\t");
            String password=sc.nextLine();
            writer.write("\n user name "+name+"\t user password ");
            writer.write(password);
          //  writer.write("first line\n");
          //  writer.write("second  line\n");
            writer.close();
            
        } catch (Exception e) {
           System.out.println(e);
        }
    }
    static void read(){
        try {
            File obj=new File("NewFile.txt");
            Scanner read=new Scanner(obj);
            while(read.hasNextLine()){
                String data=read.nextLine();
                System.out.println(data);
            } 
            read.close();

        } catch (Exception e) {
           System.out.println(e);
        }
    }
    static void del(){try {
        File obj=new File("NewFile.txt");
        obj.delete();
    } catch (Exception e) {
       System.out.println(e);
    }
       
    }
    public static void main(String[] args){
       // create();
     //  write();
        read();
      //del();

    }
}
