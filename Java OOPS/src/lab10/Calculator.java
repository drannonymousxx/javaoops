package lab10;
import javax.swing.*;
import java.awt.event.*;
public class Calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Calc");
        f.setSize(500,300);
        f.setLayout(null);
        JLabel l1 = new JLabel("Enter the First Number:");
        l1.setBounds(50,40,180,30);
        f.add(l1);
        JLabel l2 = new JLabel("Enter the Second Number:");
        l2.setBounds(50,80,180,30);
        f.add(l2);
        JLabel l3 = new JLabel("Result:");
        l3.setBounds(50,120,100,30);
        f.add(l3);
        JTextField t1 = new JTextField();
        t1.setBounds(230,40,100,30);
        f.add(t1);
        JTextField t2 = new JTextField();
        t2.setBounds(230,80,100,30);
        f.add(t2);
        JTextField t3 = new JTextField();
        t3.setBounds(230,120,100,30);
        t3.setEditable(false);  
        f.add(t3);
        JButton b1 = new JButton("Add");
        b1.setBounds(50,180,80,30);
        f.add(b1);
        JButton b2 = new JButton("Sub");
        b2.setBounds(140,180,80,30);
        f.add(b2);
        JButton b3 = new JButton("Multiply");
        b3.setBounds(230,180,100,30);
        f.add(b3);
        JButton b4 = new JButton("Reset");
        b4.setBounds(350,180,80,30);
        f.add(b4);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(t1.getText());
                double n2 = Double.parseDouble(t2.getText());
                double result = n1 + n2;
                t3.setText(String.valueOf(result));
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(t1.getText());
                double n2 = Double.parseDouble(t2.getText());
                double result = n1 - n2;
                t3.setText(String.valueOf(result));
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(t1.getText());
                double n2 = Double.parseDouble(t2.getText());
                double result = n1 * n2;
                t3.setText(String.valueOf(result));
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}