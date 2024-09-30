package Bank.Management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;

    JCheckBox c1,c2,c3,c4,c5,c6;

    JButton b1,b2;
    String formno;
    signup3(String formno){

        this.formno=formno;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1 = new JLabel("Page 3 :-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2 = new JLabel("Account;s Details:-");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3 = new JLabel("Type :-");
        l3.setFont(new Font("Raleway",Font.BOLD,22));
        l3.setBounds(100,140,200,30);
        add(l3);

        r1=new JRadioButton("Saving Accounts");
        r1.setFont(new Font("Raleway",Font.BOLD,22));
        r1.setBounds(100,180,300,30);
        r1.setBackground(new Color(215,252,252));
        add(r1);

        r2=new JRadioButton("Fix Deposite");
        r2.setFont(new Font("Raleway",Font.BOLD,22));
        r2.setBounds(350,180,300,30);
        r2.setBackground(new Color(215,252,252));
        add(r2);

        r3=new JRadioButton("Current Accounts");
        r3.setFont(new Font("Raleway",Font.BOLD,22));
        r3.setBounds(100,220,250,30);
        r3.setBackground(new Color(215,252,252));
        add(r3);

        r4=new JRadioButton("Recurring Deposite Accounts");
        r4.setFont(new Font("Raleway",Font.BOLD,22));
        r4.setBounds(350,220,400,30);
        r4.setBackground(new Color(215,252,252));
        add(r4);

        ButtonGroup b = new ButtonGroup();
        b.add(r1);
        b.add(r2);
        b.add(r3);
        b.add(r4);

        JLabel l4 = new JLabel("Card Number :-");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,300,200,30);
        add(l4);

        JLabel l5 = new JLabel("Your 16 digit Card Number:-");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,330,200,20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841:-");
        l6.setFont(new Font("Raleway",Font.BOLD,12));
        l6.setBounds(330,300,250,38);
        add(l6);

        JLabel l7 = new JLabel("(It would appear in atm card/cheque book and statement)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,340,500,20);
        add(l7);

        JLabel l8 = new JLabel("PIN:-");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,370,200,30);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,4000,200,30);
        add(l10);

        JLabel l11 = new JLabel("Services Required :-");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,450,200,30);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3 = new JCheckBox("MOBILE BANKING");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4 = new JCheckBox("E-MAIL ALERTS");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,500,200,30);
        add(c4);


        c5 = new JCheckBox("CHEQUE BOOK");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6 = new JCheckBox("E-STATEMENT");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by declared that above entered details correct to the best of my Knowledge",true);
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,600,28);
        add(c7);

        JLabel l12= new JLabel("Form No. :");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(600,10,200,30);
        add(l12);

        JLabel l13= new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(690,10,200,30);
        add(l13);

        b1=new JButton("Submit");
        b1.setFont(new Font("Raleway",Font.BOLD,14));
        b1.setBackground(Color.BLACK);
        b1.setBounds(250,720,100,30);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("Cancel");
        b2.setFont(new Font("Raleway",Font.BOLD,14));
        b2.setBackground(Color.BLACK);
        b2.setBounds(420,720,100,30);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        setSize(850,800);
        setLocation(400,20);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(new Color(215,252,252));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype =null;
        if(r1.isSelected()){
            atype="Saving Account";
        } else if (r2.isSelected()) {
            atype ="Fixed Deposite Account";
            
        } else if (r3.isSelected()) {
            atype="Current Account";

        } else if (r4.isSelected()) {
            atype="Recurring Deposite Account";

        }
        Random ran = new Random();
        long first7=(ran.nextLong()%9000000L)+1409963000000000L;
        String cardno=""+Math.abs(first7);
        long first3=(ran.nextLong()%9000L)+1000L;
        String pin=""+Math.abs(first3);

        String fac = "";
        if(c1.isSelected()){
            fac += "ATM CARD";
        } else if (c2.isSelected()) {
            fac += "Internet Banking";
        } else if (c3.isSelected()){
            fac +="Mobile Banking";

        } else if (c4.isSelected()) {
            fac +="Email Alerts";

        } else if (c5.isSelected()) {
            fac+="Cheque Book";

        } else if (c6.isSelected()) {
            fac +="E-Statement";
        }
        try{
            if(e.getSource()==b1){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all details");
                }
                else{
                    COnnection c1 = new COnnection();
                    String q1 = "insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);

                    JOptionPane.showMessageDialog(null,"Card Number:="+first3+"/n"+"pin:"+pin);
                    new Depodite(pin);
                    setVisible(false);
                }  

            } else if (e.getSource()==b2) {
                System.exit(0);
            }

        }

        catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new signup3(" ");
    }
}
