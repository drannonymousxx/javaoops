package oopj improvement.GUI;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4;

    Calculator() {

        setTitle("Calculator");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        l1 = new JLabel("First Number");
        l1.setBounds(30, 30, 100, 25);
        add(l1);

        l2 = new JLabel("Second Number");
        l2.setBounds(30, 70, 100, 25);
        add(l2);

        l3 = new JLabel("Result");
        l3.setBounds(30, 110, 100, 25);
        add(l3);

        // Text Fields
        t1 = new JTextField();
        t1.setBounds(150, 30, 150, 25);
        add(t1);

        t2 = new JTextField();
        t2.setBounds(150, 70, 150, 25);
        add(t2);

        t3 = new JTextField();
        t3.setBounds(150, 110, 150, 25);
        t3.setEditable(false);
        add(t3);

        // Buttons
        b1 = new JButton("Add");
        b1.setBounds(20, 170, 80, 30);
        add(b1);

        b2 = new JButton("Sub");
        b2.setBounds(110, 170, 80, 30);
        add(b2);

        b3 = new JButton("Multiply");
        b3.setBounds(200, 170, 100, 30);
        add(b3);

        b4 = new JButton("Reset");
        b4.setBounds(310, 170, 70, 30);
        add(b4);

        // Event Handling
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b4) {

            t1.setText("");
            t2.setText("");
            t3.setText("");
            return;
        }

        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int result = 0;

        if (e.getSource() == b1)
            result = num1 + num2;

        else if (e.getSource() == b2)
            result = num1 - num2;

        else if (e.getSource() == b3)
            result = num1 * num2;

        t3.setText(String.valueOf(result));
    }

    public static void main(String[] args) {

        new Calculator();

    }
}
