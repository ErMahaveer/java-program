class Queue{
    int size=10;
    int arr[]=new int[10];
    int f=-1;
    int r=-1;
    void enque(int x){
        if(f==0&& r==size-1){
            System.out.println("queue is full");
        }
        else{
            if(f==-1){
                f=0;
            }
            r=r+1;
            arr[r]=x;
        }

    }
    int deque(){
        int val=0;
        if (f==-1 && r==-1){
            System.out.println("Queue is empty");
        }
        else{
            if(f==r){
                f=-1;r=-1;}
                else{f++;} }
                return val;
        }
    }
    void disp(){
        for(int i=f;i<=r;r++){
            System.out.println(arr[i]);
        }
    }

       
public class Que {
    public static void main(String[] args) {
        Queue obj=new Queue();
        obj.enque(10);
    }
}
