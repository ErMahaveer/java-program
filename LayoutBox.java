import javax.swing.*;
import java.awt.*;
public class LayoutBox {
    public static void main(String[] args) {
        JFrame frame=new JFrame("CCTNS");             
        frame.setSize(300,500);
        frame.setLayout (new BoxLayout (, BoxLayout.Y_AXIS));   
        frame.setVisible(true);

        JButton bt1=new JButton("click Me");       
        JButton bt2=new JButton("submit");  
       JButton bt3=new JButton("Ok");
       JButton bt4=new JButton("done");
       JButton bt5=new JButton("go");
     
       frame.add(bt1,BorderLayout.EAST);
       frame.add(bt2,BorderLayout.WEST);
       frame.add(bt3,BorderLayout.NORTH);
       frame.add(bt4,BorderLayout.SOUTH);
       frame.add(bt5,BorderLayout.CENTER);
     

      
    }
}
