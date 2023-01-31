import java.util.Scanner;

import java.io.*;
public class FileH2{
  static Scanner sc=new Scanner(System.in);
      static void create(){
        try {
        File obj=new File("MyFile.txt");
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
        FileWriter writer=new FileWriter("MyFile.txt",true);
        System.out.println("enter your user name\t");
        String name=sc.nextLine();
        System.out.println("enter your password\t");
        String password=sc.nextLine();
        writer.write("\n "+name+"\t  ");
        writer.write(password);
             writer.close();
        
    } catch (Exception e) {
       System.out.println(e);
    }
}  
static void read(){
    try {
        File obj=new File("MYFile.txt");
        Scanner read=new Scanner(obj);
        while(read.hasNextLine()){
            String data=read.nextLine();
            if(data.contains("surendra")){
            System.out.println("exist");
            break;
            }
            else{
                System.out.println("not exist");
            }
        } 
        read.close();

    } catch (Exception e) {
       System.out.println(e);
    }
}
public static void main(String[] args){
     // create();
    // write();
    read();

    }
}
