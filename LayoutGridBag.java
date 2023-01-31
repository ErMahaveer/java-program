import javax.swing.*;
import java.awt.*;
public class LayoutGridBag {
    public static void main(String[] args) {
        JFrame frame=new JFrame("CCTNS");             
        frame.setSize(300,500);
  
       frame.setLayout(new GridBagLayout());
       GridBagConstraints gc=new GridBagConstraints();
       gc.fill=GridBagConstraints.HORIZONTAL;
       frame.add(bt,gc);
        JButton bt1=new JButton("1");
        JButton bt2=new JButton("2");
        JButton bt3=new JButton("3");
        JButton bt4=new JButton("4");
        JButton bt5=new JButton("5");
        
       frame.setVisible(true);

      
    }
}
