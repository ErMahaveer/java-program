
    import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;

class Password
{
    static int num;
    static String pass;
    void generet()
    {
        int length = num;
        String repass = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$1234567890";

        Random random = new Random();
        char[] password = new char[length];

        for(int i=0;i<length;i++)
        {
            password[i] = repass.charAt(random.nextInt(repass.length()));

        }
        String str = new String();
        pass = str.valueOf(password);
        System.out.println(pass);



    }

    void frams()
    {
        JFrame fram = new JFrame();
        fram.setBounds(10,25,300,350);

        JLabel title = new JLabel("Random Password Generator");
        title.setBounds(50,10,200,25);
        fram.add(title);

        JLabel length = new JLabel("Password Length");
        length.setBounds(10,50,100,25);
        fram.add(length);


        JTextArea tlength = new JTextArea();
        tlength.setBounds(120,50,100,25);
        tlength.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        fram.add(tlength);


        JButton get = new JButton("Get Password");
        get.setBounds(80,100,120,30);
        fram.add(get);

        JLabel repass = new JLabel();
        repass.setBounds(25,200,300,15);
        fram.add(repass);

        ActionListener click = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ee)
            {
                String count=tlength.getText();
                num =Integer.parseInt(count);

                generet();

                repass.setText("Your Password=  "+pass);
            }
        };

        get.addActionListener(click);
        fram.setLayout(null);
        fram.setVisible(true);
    }
}

 public class Project_Password {

    public static void main(String[] args)
    {
        Password obj = new Password();
        obj.frams();
    }
}

