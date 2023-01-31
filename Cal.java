import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Cal { 
    public static void main(String[] args) {
        JFrame frame=new JFrame("Add and sub"); 
        JTextField text=new JTextField();
        JTextField text2=new JTextField();
        JTextField text3=new JTextField();

        JButton button=new JButton("+");
        JButton button2=new JButton("-");

        text.setBounds(20,50,70,20);
        text2.setBounds(150,50,70,20);
        text3.setBounds(100,200,70,20);

        button.setBounds(50,120,50,20);
        button2.setBounds(120,120,50,20);
        
        ActionListener add=new ActionListener(){
            public void actionPerformed(ActionEvent e){
             String st=text.getText();
             String st2=text2.getText();

             int add=Integer.parseInt(st);             
             int add2=Integer.parseInt(st2);  
             int sum=add+add2;
             String s=String.valueOf(sum);
             text3.setText(s);           
            }
      };
        ActionListener sub=new ActionListener(){
            public void actionPerformed(ActionEvent e){
             String st=text.getText();
             String st2=text2.getText();

             int add=Integer.parseInt(st);             
             int add2=Integer.parseInt(st2);  
             int sub=add-add2;
             String s=String.valueOf(sub);
             text3.setText(s);           
            }
      };
        button.addActionListener(add);
        button2.addActionListener(sub);

        frame.add(text);
        frame.add(text2);
        frame.add(text3);

        frame.add(button);
        frame.add(button2);
        frame.setSize(300,500);
          
        frame.setLayout(null);
       frame.setVisible(true);

    }
}
