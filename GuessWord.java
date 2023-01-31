import java.util.Scanner;
public class GuessWord {
    public static void main(String[] args) {
        int num= (int)(Math.random()*50);
        System.out.println(num);
       
                for(int i=0;i<5;i++){
                    System.out.println("enter the number");
                    Scanner sc =new Scanner(System.in);
                 int  a= sc.nextInt();
               
                    if(a>num){
                        System.out.println("the value is lessthan try Again");
                        System.out.println("your left attempt"+(4-i));
                    }
                    else if(a<num){
                        System.out.println(" the value graterthan try Again");
                        System.out.println("your left attempt "+(4-i));
                    }
                        else {
                            System.out.println("you won ");
                            System.out.println("your won attempt"+(i+1)
                            
                            );
                            break;
                        }
                    }
           
        }
       

      }    
