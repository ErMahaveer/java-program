import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Project_3_Currency_Converter
    {
        static float val1,val2;

    //Convert to temp
       public static void show()
        {
            JFrame frame = new JFrame();
            frame.setBounds(10,20,350,400);

            JLabel title = new JLabel("All Converter");
            title.setBounds(120,20,100,15);
            frame.add(title);

            JLabel temp = new JLabel("Convert to Currency");
            temp.setBounds(25,75,150,25);     
            frame.add(temp);


            JButton btem = new JButton("Click Here");
            btem.setBounds(200,75,100,25);
            frame.add(btem);


            JLabel currency = new JLabel("Convert to Temprecher");
            currency.setBounds(25,125,150,25);
            frame.add(currency);

            JButton bcurrency = new JButton("Click Here");
            bcurrency.setBounds(200,125,100,25);
            frame.add(bcurrency);


            JLabel distance = new JLabel("Convert to Distance");
            distance.setBounds(25,175,150,25);
            frame.add(distance);

            JButton bdistance = new JButton("Click Here");
            bdistance.setBounds(200,175,100,25);
            frame.add(bdistance);



            ActionListener tempre = new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    JFrame tefram = new JFrame();
                    tefram.setBounds(10,20,350,400);

                    JLabel tetitle = new JLabel("Currency Converter");
                    tetitle.setBounds(100,20,150,25);
                    tefram.add(tetitle);

                    JLabel value = new JLabel("Enter USD Or INR");
                    value.setBounds(40,75,150,25);
                    tefram.add(value);

                    JTextArea txvalue = new JTextArea();
                    txvalue.setBounds(170,77,125,25);
                    txvalue.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    tefram.add(txvalue);

                    JButton inrbutton = new JButton("To INR");
                    JButton usdbutton = new JButton("To USD");
                    inrbutton.setBounds(40,130,100,25);
                    usdbutton.setBounds(180,130,100,25);
                    tefram.add(inrbutton);
                    tefram.add(usdbutton);

                    JLabel fina = new JLabel();
                    fina.setBounds(70,250,200,25);
                    tefram.add(fina);



                    ActionListener inrval = new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            String tval =txvalue.getText();
                            float ival = Float. parseFloat(tval);
                            val1 = ival * 80;
                            fina.setText("INR value=  "+val1+" ₹");
                            fina.setFont(new Font("Serif", Font.PLAIN, 20));
                        }
                    };

                    ActionListener usdval = new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            String tval =txvalue.getText();
                            float ival = Float. parseFloat(tval) ;
                            val2 = ival / 80;
                            fina.setText("USD value=  "+val2+" $");
                            fina.setFont(new Font("Serif", Font.PLAIN, 20));
                        }
                    };

                    JButton bhome = new JButton("HOME");
                    bhome.setBounds(100,180,100,25);
                    tefram.add(bhome);
                    ActionListener home = new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            tefram.setVisible(false);
                            frame.setVisible(true);
                        }
                    };

                    bhome.addActionListener(home);
                    inrbutton.addActionListener(inrval);
                    usdbutton.addActionListener(usdval);
                    tefram.setLayout(null);
                    frame.setVisible(false);
                    tefram.setVisible(true);
                }
            };

    //Canvert to Currency

            ActionListener curren = new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    JFrame cefram = new JFrame();
                    cefram.setBounds(10,20,350,400);

                    JLabel tetitle = new JLabel("Temprecher Converter");
                    tetitle.setBounds(100,20,150,25);
                    cefram.add(tetitle);

                    JLabel value = new JLabel("Enter Celcius OR Farenheit");
                    value.setBounds(20,75,200,25);
                    cefram.add(value);

                    JTextArea txvalue = new JTextArea();
                    txvalue.setBounds(180,77,125,25);
                    txvalue.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    cefram.add(txvalue);

                    JButton inrbutton = new JButton("To Celcius");
                    JButton usdbutton = new JButton("To Farenheit");
                    inrbutton.setBounds(40,130,100,25);
                    usdbutton.setBounds(170,130,120,25);
                    cefram.add(inrbutton);
                    cefram.add(usdbutton);

                    JLabel fina = new JLabel();
                    fina.setBounds(70,250,200,25);
                    cefram.add(fina);



                    ActionListener inrval = new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            String tval =txvalue.getText();
                            float ival = Float. parseFloat(tval) ;
                            val1 = ((ival - 32) * 5) / 9;
                            fina.setText("Celcius=  "+val1+" °C");
                            fina.setFont(new Font("Serif", Font.PLAIN, 20));
                        }
                    };

                    ActionListener usdval = new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            String tval =txvalue.getText();
                            float ival = Float. parseFloat(tval) ;
                            val2 =  ((ival * 9) / 5) + 32;
                            fina.setText("Farenheit=  "+val2+" °F");
                            fina.setFont(new Font("Serif", Font.PLAIN, 20));
                        }
                    };
                    JButton bhome = new JButton("HOME");
                    bhome.setBounds(100,180,100,25);
                    cefram.add(bhome);
                    ActionListener home = new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            cefram.setVisible(false);
                            frame.setVisible(true);
                        }
                    };

                    bhome.addActionListener(home);
                    inrbutton.addActionListener(inrval);
                    usdbutton.addActionListener(usdval);
                    cefram.setLayout(null);
                    frame.setVisible(false);
                    cefram.setVisible(true);
                }
            };

    //Canvert to distance

            ActionListener distan = new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    JFrame difram = new JFrame();
                    difram.setBounds(10,20,350,400);

                    JLabel tetitle = new JLabel("Distance Converter");
                    tetitle.setBounds(100,20,150,25);
                    difram.add(tetitle);

                    JLabel value = new JLabel("Enter KM OR Meter     =");
                    value.setBounds(20,75,200,25);
                    difram.add(value);

                    JTextArea txvalue = new JTextArea();
                    txvalue.setBounds(170,77,130,25);
                    txvalue.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    difram.add(txvalue);

                    JButton inrbutton = new JButton("To KM");
                    JButton usdbutton = new JButton("To Meter");
                    inrbutton.setBounds(40,130,100,25);
                    usdbutton.setBounds(170,130,100,25);
                    difram.add(inrbutton);
                    difram.add(usdbutton);

                    JLabel fina = new JLabel();
                    fina.setBounds(70,250,300,25);
                    difram.add(fina);



                    ActionListener inrval = new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            String tval =txvalue.getText();
                            float ival = Float. parseFloat(tval) ;
                            val1 = ival/1000;
                            fina.setText("KiloMeter is =  "+val1+" KM");
                            fina.setFont(new Font("Serif", Font.PLAIN, 20));
                        }
                    };

                    ActionListener usdval = new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            String tval =txvalue.getText();
                            float ival = Float. parseFloat(tval) ;
                            val2 =  ival*1000;
                            fina.setText("Meter is =  "+val2+" Meter");
                            fina.setFont(new Font("Serif", Font.PLAIN, 20));
                        }
                    };

                    JButton bhome = new JButton("HOME");
                    bhome.setBounds(100,180,100,25);
                    difram.add(bhome);
                    ActionListener home = new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            difram.setVisible(false);
                            frame.setVisible(true);
                        }
                    };
                    bhome.addActionListener(home);
                    inrbutton.addActionListener(inrval);
                    usdbutton.addActionListener(usdval);
                    difram.setLayout(null);
                    frame.setVisible(false);
                    difram.setVisible(true);
                }
            };

            btem.addActionListener(tempre);
            bcurrency.addActionListener(curren);
            bdistance.addActionListener(distan);
            frame.setLayout(null);
            frame.setVisible(true);
        }

       public static void main(String[] args)
    {        
             show();
    }
}
