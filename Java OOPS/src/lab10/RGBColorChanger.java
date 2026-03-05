package lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RGBColorChanger {
        public static void main(String[] args) {
        JFrame f = new JFrame("RGB Color Selector");
        f.setSize(500,300);
        f.setLayout(null);
        JLabel l1 = new JLabel("Red");
        l1.setBounds(50,40,50,30);
        f.add(l1);
        JLabel l2 = new JLabel("Green");
        l2.setBounds(180,40,50,30);
        f.add(l2);
        JLabel l3 = new JLabel("Blue");
        l3.setBounds(320,40,50,30);
        f.add(l3);
        Integer values[] = new Integer[256];
        for(int i = 0; i < 256; i++) {
            values[i] = i;
        }
        JComboBox<Integer> cb1 = new JComboBox<>(values);
        cb1.setBounds(50,80,80,30);
        f.add(cb1);
        JComboBox<Integer> cb2 = new JComboBox<>(values);
        cb2.setBounds(180,80,80,30);
        f.add(cb2);
        JComboBox<Integer> cb3 = new JComboBox<>(values);
        cb3.setBounds(320,80,80,30);
        f.add(cb3);
        JButton b = new JButton("Show Output");
        b.setBounds(170,150,150,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int red = (int) cb1.getSelectedItem();
                int green = (int) cb2.getSelectedItem();
                int blue = (int) cb3.getSelectedItem();
                Color color = new Color(red, green, blue);
                f.getContentPane().setBackground(color);
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}