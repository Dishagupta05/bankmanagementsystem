package Bank.Management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup1  extends JFrame implements ActionListener {
    JTextField textField1,textadhar;
    JRadioButton r1,r2,r3,r4;

    JButton next;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    String formno;

    signup1(String formno){

        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("page 2 :-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Information");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway",Font.BOLD,22));
        l3.setBounds(100,120,200,30);
        add(l3);

        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(248, 190, 190));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);


        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.BOLD,22));
        l4.setBounds(100,170,200,30);
        add(l4);

        String categories[] = {"General","OBC","SC","ST","Other"};
        comboBox2= new JComboBox(categories);
        comboBox2.setBackground(new Color(248, 190, 190));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,22));
        l5.setBounds(100,220,200,30);
        add(l5);

        String Income[] = {"null","<1,50,000","<2,50,000","5,00,000","Above 10,00,000"};
        comboBox3= new JComboBox(Income);
        comboBox3.setBackground(new Color(248, 190, 190));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational :");
        l6.setFont(new Font("Raleway",Font.BOLD,22));
        l6.setBounds(100,270,200,30);
        add(l6);

        String education[] = {"Non-Graduate","Graduation","Post-Graduation","Doctor","Other"};
        comboBox4= new JComboBox(education);
        comboBox4.setBackground(new Color(248, 190, 190));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,400,30);
        add(comboBox4);

        JLabel l7= new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.BOLD,22));
        l7.setBounds(100,340,200,30);
        add(l7);

        String occupation[] = {"Salaried","Self-Employed","Business","Student","Retired","Other"};
        comboBox5= new JComboBox(occupation);
        comboBox5.setBackground(new Color(248, 190, 190));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,340,400,30);
        add(comboBox5);

        JLabel l8= new JLabel("PAN Number :");
        l8.setFont(new Font("Raleway",Font.BOLD,22));
        l8.setBounds(100,390,200,30);
        add(l8);

        textField1 = new JTextField();
        textField1.setFont(new Font("Raleway",Font.BOLD,22));
        textField1.setBounds(350,400,200,30);
        add(textField1);

        JLabel l9= new JLabel("AAdhar Number :");
        l9.setFont(new Font("Raleway",Font.BOLD,22));
        l9.setBounds(100,440,200,30);
        add(l9);

        textadhar = new JTextField();
        textadhar.setFont(new Font("Raleway",Font.BOLD,22));
        textadhar.setBounds(350,440,200,30);
        add(textadhar);

        JLabel l10= new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,22));
        l10.setBounds(100,490,200,30);
        add(l10);

        r1=new JRadioButton("yes");
        r1.setFont(new Font("Raleway",Font.BOLD,22));
        r1.setBounds(350,490,200,30);
        r1.setBackground(new Color(188, 245, 181));
        add(r1);
        r2=new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,22));
        r2.setBounds(500,490,200,30);
        r2.setBackground(new Color(188, 245, 181));
        add(r2);

        JLabel l11= new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway",Font.BOLD,22));
        l11.setBounds(100,540,200,30);
        add(l11);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        r3=new JRadioButton("yes");
        r3.setFont(new Font("Raleway",Font.BOLD,22));
        r3.setBounds(350,540,200,30);
        r3.setBackground(new Color(188, 245, 181));
        add(r3);
        r4=new JRadioButton("No");
        r4.setFont(new Font("Raleway",Font.BOLD,22));
        r4.setBounds(500,540,200,30);
        r4.setBackground(new Color(188, 245, 181));
        add(r4);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(r3);
        bg1.add(r4);


        JLabel l12= new JLabel("Form No. :");
        l12.setFont(new Font("Raleway",Font.BOLD,22));
        l12.setBounds(700,10,200,30);
        add(l12);

        JLabel l13= new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,22));
        l13.setBounds(800,10,200,30);
        add(l13);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,22));
        next.setBounds(570,640,100,30);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        add(next);


        setSize(990,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(188, 245, 181));
        setLayout(null);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textField1.getText();
        String aadhar = textadhar.getText();

        String scitizen = null;
        if(r1.isSelected()){
            scitizen = "Yes";
        }
        else if(r2.isSelected()){
            scitizen="No";
        }
        String eaccount = null;
        if(r3.isSelected()){
            eaccount="Yes";
        }
        else if(r4.isSelected()){
            eaccount="No";
        }
        try{
            if(textField1.getText().equals(" ")||textadhar.getText().equals(" ")){
                JOptionPane.showMessageDialog(null,"Fill all the field");
            }
            else{
                COnnection c1 = new COnnection();
                String q="insert into signup2 values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                c1.statement.executeUpdate(q);
                new signup3(formno);
                setVisible(false);
            }
        }
        catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {

        new signup1("");
    }
}
