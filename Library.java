import java.util.*;
public class Library{
   static ArrayList <String> books= new ArrayList<String>();  
    static void newBooks(String book){
               for (String string : books){
                if (book.equals(string)){
                    throw new ArithmeticException("Already Exist");
                }
                System.out.println(string);
            }
    }
public static void issue(){
    for (String string : books){
         System.out.println(string);
    }
}
public static void returnBook(){

}
 public static void main(String[] args) {
     newBooks("java");
     newBooks("java");


} 

}


