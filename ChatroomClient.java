import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.util.*;
public class ChatroomClient{ 
    static Socket s;
    static Scanner sc;
   static Scanner sc2;
    static PrintStream ps;
    static String st,st2;
    static JTextArea textArea;
    public static void read(){
        
        Thread tr=new Thread(new Runnable() {
            @Override
            public void run() {
                    while (true) {
                        st2=sc2.nextLine();
                    System.out.println(st2);
                 textArea.append(st2+"\n");
                }
            }
        });
        tr.start();
    } 
    public static void write(){
        Thread tw=new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    sc=new Scanner(System.in);
                    st=sc.nextLine();
                    ps.println(st);

                    
                }
            }
        });
        tw.start();
    }
    
    public static void main(String[] args) {
        try {
            Socket s=new Socket("localhost",8085);
            System.out.println("server is connected");
          
            ps=new PrintStream(s.getOutputStream(),true);
            sc2=new Scanner(s.getInputStream());
            
            read();
            write();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        JFrame frame=new JFrame("client");
        frame.setSize(500, 500);
            
        textArea=new JTextArea();
        textArea.setBounds(20, 20, 350, 200);

    JTextArea textArea2=new JTextArea();
    textArea2.setBounds(20, 250, 250, 100);

    JButton button =new JButton("send");
    button.setBounds(320, 300, 80, 50);

    
   frame.add(textArea);
    frame.add(textArea2);
    frame.add(button);
    

    ActionListener send=new ActionListener(){
        public void actionPerformed(ActionEvent e2){
            String data=textArea2.getText();
            ps.println(data);
            textArea2.setText(""); 
        }
        
    };
    
    
    button.addActionListener(send);
     
     frame.setLayout(null);
     frame.setVisible(true);
    

    }
}