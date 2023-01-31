import java.util.Stack;
    public class Dsa {
        public static void main(String[] args) {
           Stack<String> st=new Stack<>();
           Stack<Integer> marks=new Stack<>();
           st.push("A");
           st.push("B");
           st.push("C");
            System.out.println(st);
          st.peek();
          st.capacity();
          System.out.println(st);
         // System.out.println(st.pop()); 
          System.out.println(st.peek());       
          System.out.println(st.capacity());
        
         }
}
