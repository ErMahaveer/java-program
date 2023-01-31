import javax.swing.*;
public class Guitask {
    public static void main(String[] args) {
        JFrame f = new JFrame("CCTNS");  

  
        JLabel email = new JLabel("email");  
        email.setBounds(20, 50, 80, 20);           
        JLabel pass = new JLabel("password");  
        pass.setBounds(20, 80, 80, 20);          
       JTextField em = new JTextField("enter your mail");  
       em.setBounds(120, 50, 150, 20);          
        JTextField pa = new JTextField("enter your password");  
        pa.setBounds(120, 80, 150, 20);        
       JButton log = new JButton("Login");  
       log.setBounds(20, 160, 100, 30);    
       
        f.add(email);  
        f.add(pass);  
        f.add(em);
        f.add(pa);        
        f.add(log);     
          
        f.setSize(300,300);  
        f.setLayout(null);  

        
        f.setVisible(true); 
     
    }
}
