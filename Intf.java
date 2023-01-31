interface  Tcg{
    void Sho();
}
interface Java {
     void Sp();
      void  Co();
      void Asp();
 }
 interface Python{
       void Asp();
      void Co();       
}
class Scrb implements Python,Java,Tcg{
   public void Sho(){}
  public  void Co(){}
  public  void Sp(){}
  public void Asp(){System.out.println("hello word");}
}
public class Intf {
    public static void main(String[] args) { 
        Scrb obj=new Scrb();
        obj.Asp(); 
      
    }
}
