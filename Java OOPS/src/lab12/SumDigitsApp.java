package lab12;
import javax.swing.*;

public class SumDigitsApp {
    public static void main(String[] args) {
        JFrame f = new JFrame("Sum of Digits");

        JTextField t = new JTextField();
        JButton b = new JButton("Sum Digits");
        JLabel l = new JLabel();

        t.setBounds(50,50,150,30);
        b.setBounds(50,100,120,30);
        l.setBounds(50,150,200,30);

        b.addActionListener(e -> {
            int num = Integer.parseInt(t.getText());
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            l.setText("Sum = " + sum);
        });

        f.add(t); f.add(b); f.add(l);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}