import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  

public class UserInterface {
    public static void main(String[] args) {
        JFrame frame=new JFrame("CCTNS");
        frame.setSize(300,500);
        frame.setLayout(null);
        
       
        JButton bt=new JButton("2");
        
        
        bt.setBounds(10,40,100,30);
        frame.add(bt);
        ActionListener click=new ActionListener(){
            public void actionPerformed(ActionEvent e){
                bt.setText("Clicked");
                bt.getText();
            }
        } ;
        bt.addActionListener(click);
        frame.setVisible(true);
    }
}
