import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        String arr[]={"paper","rock","scissor"};
      System.out.println("enter your choice (rock,scissor,paper)");

       Scanner sc=new Scanner(System.in);
       int us=0, sy=0;

       for(int i=0;i<3;i++){
         String user=sc.nextLine();
       
       Random rd=new Random();
         String system = arr[rd.nextInt(arr.length-1)];
         System.out.println(system);

         if (user.equals(arr[0])){
            if(system.equals(arr[0]))
            {
                System.out.println("game tie");
            }
            else if(system.equals(arr[1]))
            {
                System.out.println("you won");
                us++;
            }
           else if(system.equals(arr[2]))
            {
                System.out.println("system won");
                sy++;
            }
         }
            
      else  if (user.equals(arr[1])){
            if(system.equals(arr[0]))
            {
                System.out.println("system won");
                sy++;
            }
            else if(system.equals(arr[1]))
            {
                System.out.println("game tie");
            }
           else if(system.equals(arr[2]))
            {
                System.out.println("you won");
                us++;
            }
         }

      else  if (user.equals(arr[2])){
            if(system.equals(arr[0]))
            {
                System.out.println("you won");
                us++;
            }
            else if(system.equals(arr[1]))
            {
                System.out.println("system won");
                sy++;
            }
           else if(system.equals(arr[2]))
            {
                System.out.println("game tie");
            }
         }
       }
       if(us>sy){
        System.out.println("you won user point =  "+us+"  system point=  "+sy);
       }
       else{
        System.out.println("system won system point=  "+sy+ "  user point =  "+us );
       }
    }
    
}
