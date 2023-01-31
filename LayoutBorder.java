import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
public class LayoutBorder {
    public static void main(String[] args) {
        JFrame frame=new JFrame("CCTNS");             
        frame.setSize(300,500);
        frame.setLayout(new BorderLayout(20,30));
        
        JButton bt1=new JButton("click Me");       
        JButton bt2=new JButton("submit");  
       JButton bt3=new JButton("Ok");
       JButton bt4=new JButton("done");
       JButton bt5=new JButton("go");
      // JButton bt6=new JButton("All clear");
      
       frame.add(bt1,BorderLayout.EAST);
       frame.add(bt2,BorderLayout.WEST);
       frame.add(bt3,BorderLayout.NORTH);
       frame.add(bt4,BorderLayout.SOUTH);
       frame.add(bt5,BorderLayout.CENTER);
     //  frame.add(bt6,BorderLayout.PAGE_START);           

     bt1.setBackground(Color.CYAN);
     bt2.setBackground(Color.red);
     bt3.setBackground(Color.green);
     bt4.setBackground(Color.MAGENTA);
     bt5.setBackground(Color.ORANGE); 
          
     frame.setVisible(true);
    }
}
