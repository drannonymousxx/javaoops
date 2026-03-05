package lab10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RegistrationForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Registration Form");
        f.setSize(500,600);
        f.setLayout(null);
        JLabel l1 = new JLabel("Enter Name:");
        l1.setBounds(50,50,120,30);
        f.add(l1);
        JLabel l2 = new JLabel("Gender:");
        l2.setBounds(50,100,120,30);
        f.add(l2);

        JLabel l3 = new JLabel("Hobbies:");
        l3.setBounds(50,150,120,30);
        f.add(l3);

        JLabel l4 = new JLabel("Address:");
        l4.setBounds(50,220,120,30);
        f.add(l4);

        JTextField t1 = new JTextField();
        t1.setBounds(180,50,150,30);
        f.add(t1);

        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(180,100,80,30);

        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(260,100,100,30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        f.add(r1);
        f.add(r2);

        JCheckBox c1 = new JCheckBox("Reading");
        c1.setBounds(180,150,100,30);

        JCheckBox c2 = new JCheckBox("Sports");
        c2.setBounds(280,150,100,30);

        f.add(c1);
        f.add(c2);

        JTextArea ta = new JTextArea();
        ta.setBounds(180,220,200,80);
        f.add(ta);

        JButton b1 = new JButton("Submit");
        b1.setBounds(200,330,100,30);
        f.add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f,"Registration Successful");
            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}