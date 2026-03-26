package lab12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Set1Calculator extends JFrame implements ActionListener {

    JTextField t1, t2, result;
    JButton square, sqrt, power, mod, log;

    Set1Calculator() {
        setTitle("Name: YOUR_NAME | Roll: YOUR_ROLL");
        setSize(350, 300);
        setLayout(new GridLayout(7, 2, 5, 5));

        add(new JLabel("Input 1:"));
        t1 = new JTextField(); add(t1);

        add(new JLabel("Input 2:"));
        t2 = new JTextField(); add(t2);

        square = new JButton("Square");
        sqrt = new JButton("Square Root");
        power = new JButton("Power");
        mod = new JButton("Modulus");
        log = new JButton("Log");

        add(square); add(sqrt);
        add(power); add(mod);
        add(log);

        add(new JLabel("Result:"));
        result = new JTextField();
        result.setEditable(false);
        add(result);

        square.addActionListener(this);
        sqrt.addActionListener(this);
        power.addActionListener(this);
        mod.addActionListener(this);
        log.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Thread class
    class MyThread extends Thread {
        String op;

        MyThread(String op) { this.op = op; }

        public void run() {
            try {
                Thread.sleep(1000); // delay

                double a = Double.parseDouble(t1.getText());
                double b = t2.getText().isEmpty() ? 0 : Double.parseDouble(t2.getText());
                double res = 0;

                switch (op) {
                    case "square": res = a * a; break;
                    case "sqrt": res = Math.sqrt(a); break;
                    case "power": res = Math.pow(a, b); break;
                    case "mod": res = a % b; break;
                    case "log": res = Math.log(a); break;
                }

                result.setText(String.valueOf(res));

            } catch (Exception e) {
                result.setText("Error");
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == square)
            new MyThread("square").start();
        else if (e.getSource() == sqrt)
            new MyThread("sqrt").start();
        else if (e.getSource() == power)
            new MyThread("power").start();
        else if (e.getSource() == mod)
            new MyThread("mod").start();
        else if (e.getSource() == log)
            new MyThread("log").start();
    }

    public static void main(String[] args) {
        new Set1Calculator();
    }
}