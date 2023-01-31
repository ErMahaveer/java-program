class Modi{
    private class Amichand{}
    private class Satveer{}
    private static int z=10;
   Modi(){
        System.out.println("const A");
    }
   Modi(int a){
       System.out.println("fake documents");
   }
    private void show(){
        System.out.println(z);
    }
    class  Abc{
        static int z=10; 
    }
    public static void main(String[] args){
        Modi obj =new Modi();
    }
}
