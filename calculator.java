import javax.swing.*;
import java.awt.event.*;
import javax.swing.text.PlainView;

import java.awt.*;
class calculator {      
    public static void main(String args[]) {       
       JFrame f = new JFrame("calculator"); 
              
       JTextField text=new JTextField();
       JButton b0 = new JButton("0");
       JButton b1 = new JButton("1");
       JButton b2 = new JButton("2");
       JButton b3 = new JButton("3");
       JButton b4 = new JButton("4");
       JButton b5 = new JButton("5");
       JButton b6 = new JButton("6");
       JButton b7 = new JButton("7");
       JButton b8 = new JButton("8");
       JButton b9 = new JButton("9");       
       JButton eq = new JButton("=");       
       JButton ba = new JButton("+");
       JButton bs = new JButton("-");
       JButton bd = new JButton("/");
       JButton bm = new JButton("*");    
       
       JPanel p = new JPanel();
       p.setLayout(new GridLayout(8,2));
       p.setBounds(30, 30, 300, 300);
        p.add(text);
        p.add(b0);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bs);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bm);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(eq);
        p.add(ba);
        p.add(bs);
        p.add(bd);
        p.add(bm);    
        p.setBackground(Color.blue); 
        
        ActionListener lb0=new ActionListener(){
              public void actionPerformed(ActionEvent e){
                text.setText(b0.getText());
               
              }
        };
        ActionListener lb1=new ActionListener(){
            public void actionPerformed(ActionEvent e){
              text.setText(b1.getText());
             String one=b1.getText();
            }
      };
        ActionListener lba=new ActionListener(){
            public void actionPerformed(ActionEvent e){
              text.setText(ba.getText());
             
            }
      };
        ActionListener leq=new ActionListener(){
            public void actionPerformed(ActionEvent e){
              text.setText(b0.getText()+ba.getText()+b1.getText());
             
            }
      };

         b0.addActionListener(lb0);
         b1.addActionListener(lb1);
         ba.addActionListener(lba);
         eq.addActionListener(leq);
        
        f.add(p);        
        f.setSize(200, 220);
       

              f.setVisible(true); 
     
    
        
    }
}