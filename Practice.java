import java.awt.event.*;
import javax.swing.*;
public class Practice {
      public static void show(){
       JFrame frame=new JFrame();

      JCheckBox box=new JCheckBox();
      box.setBounds(40, 20, 30, 20);

      JRadioButton radio=new JRadioButton();
      radio.setBounds(80, 20, 30, 20);
      DefaultListModel<String> list=new DefaultListModel<String>();
      list.addElement("A");
      list.addElement("B");
      list.addElement("C");
      list.addElement("D");
      
      JList<String> lst=new JList<>(list);
      lst.setBounds(20, 60, 20, 80);
      
      
      JButton bt=new JButton("ok");
      bt.setBounds(20, 200, 50, 20);
      
      JTabbedPane pt=new JTabbedPane();
      pt.addTab("first",null,new JPanel());
      pt.addTab("Second", null, new JPanel());
      pt.addTab("third",null, new JPanel());
      
      JFileChooser fc=new JFileChooser();
      var file=fc.getSelectedFile();
      fc.setBounds(30, 250, 400, 400);
      
      
      ActionListener ok=new ActionListener(){
          public void actionPerformed(ActionEvent e){
              pt.setBounds(200, 10, 300,200);        
    }        
};
bt.addActionListener(ok);

frame.add(box);
frame.add(radio);
frame.add(bt);
frame.add(lst);
frame.add(pt);
frame.add(fc);
        
       frame.setSize(600, 750);
       frame.setLayout(null);
       frame.setVisible(true);
      }
    public static void main(String[] args) {
        show();
    }
}
