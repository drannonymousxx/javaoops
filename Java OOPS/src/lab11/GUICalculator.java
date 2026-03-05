package lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUICalculator implements ActionListener {

    JFrame f;
    JTextField t;

    double num1, num2, result;
    char operator;

    public GUICalculator() {

        f = new JFrame("Calculator");
        f.setSize(300,350);
        f.setLayout(new GridLayout(6,4));

        t = new JTextField();
        f.add(t);

        String buttons[] = {
                "1","2","3","+",
                "4","5","6","-",
                "7","8","9","*",
                "/","0","%","=",
                "OFF"
        };

        for(String text : buttons) {

            JButton b = new JButton(text);
            b.addActionListener(this);
            f.add(b);
        }

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();

        if(command.matches("[0-9]")) {
            t.setText(t.getText() + command);
        }

        else if(command.matches("[+\\-*/%]")) {
            num1 = Double.parseDouble(t.getText());
            operator = command.charAt(0);
            t.setText("");
        }

        else if(command.equals("=")) {

            num2 = Double.parseDouble(t.getText());

            switch(operator) {

                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    result = num1 / num2;
                    break;

                case '%':
                    result = num1 % num2;
                    break;
            }

            t.setText(String.valueOf(result));
        }

        else if(command.equals("OFF")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new GUICalculator();
    }
}