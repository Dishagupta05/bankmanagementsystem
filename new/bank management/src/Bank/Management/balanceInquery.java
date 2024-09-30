package Bank.Management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class balanceInquery extends JFrame implements ActionListener {
    String pin;
    balanceInquery(String pin){
        this.pin=pin;
        JLabel label2;
        JButton b1;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("your current balance is : ");
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(500,400,400,20);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        label2 = new JLabel();
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(500,450,400,35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);

        b1 = new JButton("Back");
        b1.setBounds(730,520,150,20);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        int balance =0;
        try{
            COnnection c = new COnnection();
            ResultSet result = c.statement.executeQuery("Select * from bank where pin='"+pin+"'");
            while(result.next()){
                if(result.getString("type").equals("Deposite")){
                    balance +=Integer.parseInt(result.getString("amount"));

                }
                else{
                    balance -=Integer.parseInt(result.getString("amount"));

                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        label2.setText(""+balance);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_class(pin);
    }

    public static void main(String[] args) {
        new balanceInquery("");
    }
}
