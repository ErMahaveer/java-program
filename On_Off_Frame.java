import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class On_Off_Frame {
      
  public static void show(){
    JFrame frame1=new JFrame("Action");
    JFrame frame2=new JFrame("Read");

    JButton bt1=new JButton("ON");
    bt1.setBounds(60, 50, 80, 40);
    frame1.add(bt1);

    JButton bt2=new JButton("OFF");
    bt2.setBounds(180, 50, 80, 40);
        frame1.add(bt2);

    JLabel lab=new JLabel();
    lab.setBounds(20, 20, 150, 40);
        frame2.add(lab); 

       JLabel image=new JLabel();
       image.setBounds(40, 50, 300, 400);      


    ActionListener al=new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            Object obj= e.getSource();
           if(obj==bt1){
          lab.setText("Label ON");
          image.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\on4.png"));
         }
            else if(obj==bt2) {  
               lab.setText("label OFF") ; 
               
        image.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\off4.png"));
        
    }
}

};
bt1.addActionListener(al);
bt2.addActionListener(al);

    frame2.add(image);
  frame1.setSize(300, 400);
  frame2.setSize(300, 500);
  frame1.setLayout(null);
  frame2.setLayout(null);
  frame1.setVisible(true);
  frame2.setVisible(true);

  }

    public static void main(String[] args) {
       show();
        
    }
}
