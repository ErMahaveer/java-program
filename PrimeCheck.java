public class PrimeCheck {
    static void prime(int num){
        int flag=0;
        for(int i=2; i<=num/2;i++)
        {
            if(num%i==0){
                flag=1;
            }
            if(flag==1){
                System.out.println("not prime");
                break;
             }
                else{
                    System.out.println("prime");
                    break;
                }
            }
        
    }
    public static void main(String[] args) {
        prime(5);
    }
    
}
