    import javax.swing.*;
import java.awt.event.*;
public class ONoffSingle {
    static int flag=0;      
  public static void show(){
    JFrame frame1=new JFrame("Action");
    JFrame frame2=new JFrame("Read");
    JButton bt=new JButton();
    bt.setBounds(25, 20, 60, 30);
    bt.setText("off");
        frame1.add(bt); 
       JLabel image=new JLabel();
       image.setBounds(30, 15, 200, 300);      
      // image.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\off4.png")); 
    ActionListener al=new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            
            if(flag==0) {  
                bt.setText("ON");
                flag=1;
                image.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\on4.png"));
            }
            else if(flag==1)  {  
                bt.setText("Off");
                flag=0;
                image.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\off4.png")); 
        }  }
};
      bt.addActionListener(al);
    frame2.add(image);
      frame1.setSize(70,120);
  frame2.setSize(245, 380);
  frame2.setLocation(250, 50);
  frame1.setLayout(null);
  frame2.setLayout(null);
  frame1.setVisible(true);
  frame2.setVisible(true);
  }
  public static void main(String[] args) {
    show();
  }  
}
