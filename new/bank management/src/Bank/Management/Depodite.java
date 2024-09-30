package Bank.Management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Depodite extends JFrame implements ActionListener {
    String pin;
    TextField textfield;
    JButton b1,b2;
    Depodite(String pin){
        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DESPOSIT");
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(500,400,400,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        textfield = new TextField();
        textfield.setBackground(new Color(65,125,128));
        textfield.setForeground(Color.WHITE);
        textfield.setBounds(500,430,320,25);
        textfield.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(textfield);

        b1 = new JButton("DEPOSITE");
        b1.setBounds(730,520,150,20);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(730,545,150,20);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);




        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String amount = textfield.getText();
            Date date = new Date();
            if(e.getSource()==b1){
                if(textfield.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter your amount");

                }
                else {
                    COnnection c=new COnnection();
                    c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposite','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs."+amount+"Deposit Successfully");
                    setVisible(false);
                    new main_class(pin);
                }
            } else if (e.getSource()==b2) {
                setVisible(false);
                new main_class(pin);
                
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        new Depodite("");
    }
}
