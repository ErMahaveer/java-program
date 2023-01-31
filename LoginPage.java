import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.text.JTextComponent;

public class LoginPage {
    public static void main(String[] args) {
        
        JFrame frame=new JFrame("Login Page");
        JLabel lab=new JLabel("user name");
        lab.setBounds(30, 15, 120, 30);
        frame.add(lab);
        JLabel lab2=new JLabel("password");
        lab2.setBounds(30, 45, 120, 30);
        frame.add(lab2);
        JTextField tf=new JTextField();
        tf.setBounds(120, 20, 120, 20);
        frame.add(tf);
        JPasswordField tf2=new JPasswordField();
        tf2.setBounds(120,50,120,20);
        frame.add(tf2);
        JButton bt=new JButton("Login");
        bt.setBounds(70, 90, 100, 20);
        bt.setBackground(Color.GREEN);
        frame.add(bt);

        JLabel lab3=new JLabel();
        lab3.setBounds(10, 150, 650, 30);
        lab3.setFont(new Font("Times New Roman", Font.PLAIN, 20));      
        
        ActionListener al=new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                File obj= new File("SwingServerdata.txt");
                obj.createNewFile();
                FileWriter fw=new FileWriter("SwingServerdata.txt",true);
               fw.write(" ");
               fw.close();
                
                String user=tf.getText();
                String pass=tf2.getText();                
                System.out.println(user+"\n"+pass);

                File rd=new File("SwingServerdata.txt");
                Scanner read=new Scanner(rd);
                String data=read.nextLine();

                if(data.contains(user)){
                    lab3.setText("try again.... ");
                }
                else{
                    lab3.setText(" login successfully"+"  userId-  "+user+"   password-  "+pass);
                    FileWriter fw1=new FileWriter("SwingServerdata.txt",true);
                                      fw1.write(user+pass);
                                          fw1.close();
                }

            } catch (Exception e1) {
                System.out.println(e1);
             }
                
            }};         
        frame.add(lab3);
        bt.addActionListener(al);
        frame.setSize(700,400);
        frame.setLayout(null);
        frame.setVisible(true);
       
    }}
