package Bank.Management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class miniStatement extends JFrame implements ActionListener {
    String pin;
    JButton b1;
    miniStatement(String pin){
        this.pin=pin;
        getContentPane().setBackground(new Color(255,204,204));
        setSize(400,600);

        setLocation(20,20);
        setLayout(null);

        JLabel label1 = new JLabel();
        label1.setBounds(20,140,400,200);
        add(label1);

        JLabel label2 = new JLabel("TechCoder A.V");
        label2.setFont(new Font("System",Font.BOLD,15));
        label2.setBounds(150,20,200,20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,400,300,20);
        add(label4);

        try{
            COnnection c = new COnnection();
            ResultSet rs = c.statement.executeQuery("select * from login where pin= '"+pin+"'");
            while(rs.next()){
                label3.setText("card_number :"+rs.getString("cardno").substring(0,4)+"XXXXXXX"+rs.getString("cardno").substring(12));

            }
        }catch(Exception E){
            E.printStackTrace();
        }
        try{
            int balance =0;
            COnnection c = new COnnection();
            ResultSet result = c.statement.executeQuery("Select * from bank where pin ='"+pin+"'");

            while(result.next()) {

                label1.setText(label1.getText()+"<html>"+result.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+result.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+result.getString("amount")+"<br><br><html>");

                if (result.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(result.getString("amount"));

                } else {
                    balance -= Integer.parseInt(result.getString("amount"));
                }
            }
            label4.setText("Your total ids Rs "+balance);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        b1= new JButton("exit");
        b1.setBounds(20,500,100,25);
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setBackground(Color.WHITE);
        add(b1);



        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        setVisible(false);
    }
    public static void main(String[] args) {
        new miniStatement("");
    }
}
