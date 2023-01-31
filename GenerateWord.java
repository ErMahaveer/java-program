import java.util.*;
public class GenerateWord {
   String word(){
        String [] movies={"jeene nahi dunga","ddlj","indian","kgf2","pk"};
        Random obj=new Random();
        int index=obj.nextInt(movies.length-1);
        String word=movies[index];
        System.out.println(word);
        return word;
    }
    void check(){
        String word=word();
       System.out.println("Guess the bollywood movie! length = "+word.length());
       Scanner obj=new Scanner(System.in);
         String temp[]=new String[word.length()];
       for(int i=0,j=0;j<=4 & i<word.length();){
        String guess=obj.next();


        if(word.contains(guess)){
            int ind=word.indexOf(guess);
            temp[ind]=guess;
         word=word.replaceFirst(guess, "_");
           // System.out.println(word);
        //   System.out.println("Exist");
        i++;
        if(i==word.length()){
            System.out.println("You won");
        }
           for(String string : temp){
            System.out.print(string);
             
            }
                      
        } 
        else{
            System.out.println("try again");
            j++;
        }
       }
       System.out.println("you lose");
    }
    public static void main(String[] args) {
        GenerateWord obj=new GenerateWord();
        obj.check();
    }
}
