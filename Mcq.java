import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
public class Mcq {
    public static void main(String[] args) {
        JFrame frame=new JFrame("MCQ");
        frame.setSize(500,400);
        frame.setLayout(null);

        JPanel panel=new JPanel();
        panel.setBounds(10, 10, 500, 300);
        panel.setLayout(null);
        JLabel label=new JLabel("Q: 1. Who invented Java Programming ?");
             label.setBounds(10,20 , 480, 20);
             label.setFont(new Font("Times new romam",Font.BOLD,14));

        JRadioButton  button =new JRadioButton("Guido van Rossum");
        button.setBounds(20, 50, 200, 20);    
        JRadioButton  button2 =new JRadioButton("James Gosling");
        button2.setBounds(20, 80, 200, 20);    
        JRadioButton  button3 =new JRadioButton("Dennis Ritchie");
        button3.setBounds(20, 110, 200, 20);    
        JRadioButton  button4 =new JRadioButton("Bjarne Stroustrup");
        button4.setBounds(20, 140, 200, 20); 
               
        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(button);
        buttonGroup.add(button2);
        buttonGroup.add(button3);
        buttonGroup.add(button4);
 
          Button submit=new Button("Submit and Next");
          submit.setBounds(40, 180, 180, 30);
          submit.setFont(new Font("Times new romam",Font.BOLD,18));

           ActionListener click=new ActionListener(){
                public void actionPerformed(ActionEvent e){
                   
                    label.setText("Q: 2. Which one of the following is not a Java feature ? ");
                    button.setText("Object-oriented");
                    button2.setText("Use of pointers");
                    button3.setText("Portable");
                    button4.setText("Dynamic and Extensible");
                  
                    

                }
           };
               
           ActionListener click2=new ActionListener(){
            public void actionPerformed(ActionEvent e){
               
                label.setText("Q: 3.  What is the extension of java code files? ");
                button.setText(".js");
                button2.setText(".txt");
                button3.setText(".class");
                button4.setText(".java");
              
                

            }
       };

         
         submit.addActionListener(click); 
         //submit.addActionListener(click2);
         panel.add(label);
         panel.add(button);
         panel.add(button2);
         panel.add(button3);
         panel.add(button4);
         panel.add(submit);
             
             
             frame.add(panel);
      
        frame.setVisible(true);
        
    }
}
