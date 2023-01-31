import javax.swing.*;
import java.awt.*;
public class LayoutGrid {
    public static void main(String[] args) {
        JFrame frame=new JFrame("CCTNS");             
        frame.setSize(300,500);
             for(char i='0';i<='z';i++){
            JButton b=new JButton(Character.toString(i));
            frame.add(b);
        }  
        frame.setLayout(new GridLayout(25,3));
       frame.setVisible(true);

      
    }
}
