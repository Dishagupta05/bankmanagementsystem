package Bank.Management;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Singup extends JFrame implements ActionListener {

    JRadioButton R1,R2 ,R3,R4,R5;
    JButton next;

    JDateChooser dateChooser;

    JTextField textname , textFName ,textEmail , textMs,textadd,textcity,textpin,textstate;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L)+1000L;

    String first = " " + Math.abs(first4);
    Singup(){
        super("APPLICATION FORM");


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.jpeg"));
        Image i2 =i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("Application Form No." + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);


        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textname = new JTextField();
        textname.setFont(new Font("Raleway",Font.BOLD,14));
        textname.setBounds(300,190,400,30);
        add(textname);

        JLabel labelFName = new JLabel("Father's Name :");
        labelFName.setFont(new Font("Raleway",Font.BOLD,20));
        labelFName.setBounds(100,230,200,30);
        add(labelFName);

        textFName =new JTextField();
        textFName.setBounds(300,230,400,30);
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        add(textFName);

        JLabel labelDOB = new JLabel("Date of Birth :");
        labelDOB.setBounds(100,270,200,30);
        labelDOB.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelDOB);


        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(108,108,108));
        dateChooser.setBounds(300,270,400,30);
        add(dateChooser);

        JLabel label6 = new JLabel("Gender :");
        label6.setFont(new Font("Raleway",Font.BOLD,20));
        label6.setBounds(100,310,200,30);
        add(label6);

        R1= new JRadioButton("Male");
        R1.setFont(new Font("Raleway",Font.BOLD,14));
        R1.setBounds(300,310,100,30);
        R1.setBackground(new Color(222,250,230));
        add(R1);

        R2=new JRadioButton("Female");
        R2.setFont(new Font("Raleway",Font.BOLD,14));
        R2.setBounds(450,310,100,30);
        R2.setBackground(new Color(222,250,230));
        add(R2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(R1);
        buttonGroup.add(R2);


        JLabel labelEmail = new JLabel("Email Address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,350,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,350,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,390,200,30);
        add(labelMs);

        R3 = new JRadioButton("Married ");
        R3.setFont(new Font("Raleway",Font.BOLD,14));
        R3.setBounds(300,390,200,30);
        R3.setBackground(new Color(222,250,230));
        add(R3);

        R4 = new JRadioButton("Unmarried ");
        R4.setFont(new Font("Raleway",Font.BOLD,14));
        R4.setBounds(450,390,150,30);
        R4.setBackground(new Color(222,250,230));
        add(R4);

        R5 = new JRadioButton("Other ");
        R5.setFont(new Font("Raleway",Font.BOLD,14));
        R5.setBounds(600,390,100,30);
        R5.setBackground(new Color(222,250,230));
        add(R5);

        ButtonGroup bg = new ButtonGroup();
        bg.add(R3);
        bg.add(R4);
        bg.add(R5);


        JLabel labeladd = new JLabel("Address ");
        labeladd.setFont(new Font("Raleway",Font.BOLD,20));
        labeladd.setBounds(100,430,200,30);
        add(labeladd);

        textadd = new JTextField();
        textadd.setFont(new Font("Raleway",Font.BOLD,14));
        textadd.setBounds(300,430,400,30);
        add(textadd);

        JLabel labelcity = new JLabel("City :");
        labelcity.setFont(new Font("Raleway",Font.BOLD,20));
        labelcity.setBounds(100,470,200,30);
        add(labelcity);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD,14));
        textcity.setBounds(300,470,400,30);
        add(textcity);

        JLabel labelpin = new JLabel("PIN :");
        labelpin.setFont(new Font("Raleway",Font.BOLD,20));
        labelpin.setBounds(100,510,200,30);
        add(labelpin);

        textpin = new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
        textpin.setBounds(300,510,400,30);
        add(textpin);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Raleway",Font.BOLD,20));
        labelstate.setBounds(100,550,200,30);
        add(labelstate);

        textstate = new JTextField();
        textstate.setFont(new Font("Raleway",Font.BOLD,14));
        textstate.setBounds(300,550,400,30);
        add(textstate);


        next = new JButton("Next");
        textstate.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,250,230));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textname.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent() ).getText();
        String gen = null;
        if(R1.isSelected()){
            gen = "Male";
        }
        else if(R2.isSelected()){
            gen ="Female";
        }
        String email =textEmail.getText();
        String marital = null;

        if(R3.isSelected()){
            marital="married";
        }
        else if(R4.isSelected()){
            marital ="Unmarried";
        } else if (R5.isSelected()) {
            marital="Other";
        }

        String address =textadd.getText();
        String city = textcity.getText();
        String pin = textpin.getText();
        String state = textstate.getText();


        try{
            if(textname.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the field");
                }
            if(textFName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the field");
            }

            else{
                COnnection con1 = new COnnection();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gen+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
                con1.statement.executeUpdate(q);
                new signup1(formno);
                setVisible(false);
            }

        }
        catch(Exception E){
            E.printStackTrace();

        }
    }

    public static void main(String[] args) {

        new Singup();
    }
}
