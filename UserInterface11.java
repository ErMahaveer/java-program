import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.PasswordAuthentication; 
public class UserInterface11 {
    public static void main(String[] args) {

        JFrame frame=new JFrame("CCTNS");
        frame.setSize(300,500);
        frame.setLayout(null);
        JButton bt=new JButton("2");
        bt.setBounds(20,40,200,50);
        frame.add(bt);

        JFrame frame2=new JFrame("lab");
        frame2.setSize(250,400);
        frame2.setLayout(null);
        JButton bt2=new JButton("login");
        bt2.setBounds(50,100,100,20);
        bt2.setBackground(Color.CYAN);
        frame2.add(bt2);
        JTextField tf=new JTextField("user name");
        tf.setBounds(40, 20, 100, 20);
        tf.setBackground(Color.ORANGE);
         frame2.add(tf);
         JTextField tf2=new JTextField("Password");
         tf2.setBounds(40,50,100,20);
         frame2.add(tf2);         
        ActionListener click=new ActionListener(){
            public void actionPerformed(ActionEvent e){
                bt.setText("click");;
                frame2.setVisible(true);                
            }
        } ;
        bt.addActionListener(click);
        frame.setVisible(true);
    }
}
