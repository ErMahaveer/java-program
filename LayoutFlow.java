import javax.swing.*;
import java.awt.*;
public class LayoutFlow {
    public static void main(String[] args) {
        JFrame frame=new JFrame("CCTNS");             
        frame.setSize(300,500);
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

          for(char i='0';i<='z';i++){
            JButton b=new JButton(Character.toString(i));
            frame.add(b);
          }
        
        frame.setVisible(true);

      
    }
}
