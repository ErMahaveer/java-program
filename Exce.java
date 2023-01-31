

public class Exce{
    static void div(int a,int b){
        try{
            int c=a/b;
            System.out.println(c);
        } catch(Exception e){
            
            System.out.println(e);
        }
    
}
 public static void main(String[] args) {
  div(10,0);

}
}

