package Bank.Management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePin extends JFrame implements ActionListener {
    JButton b1,b2;
    String pin;
    JPasswordField p1,p2;
    ChangePin(String pin){
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("Change your pin");
        label1.setFont(new Font("System",Font.BOLD,25));
        label1.setBounds(600,400,400,30);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        JLabel label2 = new JLabel("New Pin :");
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(470,440,150,35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);

        p1 = new JPasswordField();
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.WHITE);
        p1.setBounds(600,440,200,25);
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(p1);

        JLabel label3 = new JLabel("Re-Enter New Pin :");
        label3.setFont(new Font("System",Font.BOLD,16));
        label3.setBounds(470,480,200,25);
        label3.setForeground(Color.WHITE);
        l3.add(label3);

        p2 = new JPasswordField();
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.WHITE);
        p2.setBounds(600,480,200,25);
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(p2);

        b1 = new JButton("Change");
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

        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try{
            String pin1 = p1.getText();
            String pin2 =p2.getText();

            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered pin does not match");

            }
            if(e.getSource()==b1){
                if(p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter the pin");
                    return;
                }
                if (p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter the PIN");
                    return;
                }
                COnnection c = new COnnection();
                String q1 = "update bank set pin='"+pin1+"' where pin='"+pin+"'";
                String q2 = "update login set pin='"+pin1+"' where pin='"+pin+"'";
                String q3 = "update signup3 set pin='"+pin1+"' where pin='"+pin+"'";
                
                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);

                c.statement.executeUpdate(q3);
                
                JOptionPane.showMessageDialog(null,"Pin change successfull");
                setVisible(false);
                new main_class(pin);
                
            } else if (e.getSource()==b2) {
                new main_class(pin);
                setVisible(false);
                
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new ChangePin("");
    }
}
