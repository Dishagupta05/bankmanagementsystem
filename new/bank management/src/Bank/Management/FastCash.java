package Bank.Management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    FastCash(String pin){
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label = new JLabel("Select Withdrawl amount");
        label.setBounds(550,400,400,30);
        label.setFont(new Font("System",Font.BOLD,20));
        label.setForeground(Color.WHITE);
        l3.add(label);

        b1 = new JButton("Rs. 100");
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.setBounds(470,470,100,25);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Rs. 500");
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.setBounds(730,470,150,25);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("Rs. 1000");
        b3.setBackground(new Color(65,125,128));
        b3.setForeground(Color.WHITE);
        b3.setBounds(470,496,100,25);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("Rs. 2000");
        b4.setBackground(new Color(65,125,128));
        b4.setForeground(Color.WHITE);
        b4.setBounds(730,496,150,25);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("Rs. 5000");
        b5.setBackground(new Color(65,125,128));
        b5.setForeground(Color.WHITE);
        b5.setBounds(470,521,100,25);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("Rs. 10,000");
        b6.setBackground(new Color(65,125,128));
        b6.setForeground(Color.WHITE);
        b6.setBounds(730,522,150,25);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("Back");
        b7.setBackground(new Color(65,125,128));
        b7.setForeground(Color.WHITE);
        b7.setBounds(470,546,100,25);
        b7.addActionListener(this);
        l3.add(b7);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b7){
            setVisible(false);
            new main_class(pin);
        }
        else{
            String amount = ((JButton)e.getSource()).getText().substring(4);
            COnnection c =new COnnection();
            Date date = new Date();
            try{
                ResultSet result = c.statement.executeQuery("Select * from bank where pin ='"+pin+"'");
                int balance = 0;
                while(result.next()) {
                    if (result.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(result.getString("amount"));

                    } else {
                        balance -= Integer.parseInt(result.getString("amount"));
                    }
                }

                String num = "17";

                if(e.getSource()!= b7 && balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }

                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','withdrael','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs. "+amount+"Debited Successfully");

            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new main_class(pin);
        }
    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
