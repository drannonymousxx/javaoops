package oopj improvement.GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorList extends JFrame implements ActionListener {

    JList<String> list;
    JButton button;
    String colors[] = {"White", "Orange", "Red", "Blue"};

    ColorList() {

        setTitle("Color List");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create List
        list = new JList<>(colors);
        list.setBounds(50, 40, 100, 80);
        add(list);

        // Create Button
        button = new JButton("Click");
        button.setBounds(180, 60, 100, 30);
        button.addActionListener(this);
        add(button);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String color = list.getSelectedValue();

        if (color.equals("White"))
            getContentPane().setBackground(Color.WHITE);

        else if (color.equals("Orange"))
            getContentPane().setBackground(Color.ORANGE);

        else if (color.equals("Red"))
            getContentPane().setBackground(Color.RED);

        else if (color.equals("Blue"))
            getContentPane().setBackground(Color.BLUE);
    }

    public static void main(String[] args) {

        new ColorList();

    }
}
