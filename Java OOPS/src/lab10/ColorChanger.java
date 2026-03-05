
package lab10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger {
    public static void main(String[] args) {
        JFrame f = new JFrame("Color Changer");
        f.setSize(500,400);
        f.setLayout(null);
        String colors[] = {"White", "Red", "Blue", "Green"};
        JList<String> list = new JList<>(colors);
        list.setBounds(50,50,120,80);
        f.add(list);
        JButton b = new JButton("Change Color");
        b.setBounds(200,70,150,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedColor = list.getSelectedValue();
                if(selectedColor != null) {
                    if(selectedColor.equals("White")) {
                        f.getContentPane().setBackground(Color.WHITE);
                    }
                    else if(selectedColor.equals("Red")) {
                        f.getContentPane().setBackground(Color.RED);
                    }
                    else if(selectedColor.equals("Blue")) {
                        f.getContentPane().setBackground(Color.BLUE);
                    }
                    else if(selectedColor.equals("Green")) {
                        f.getContentPane().setBackground(Color.GREEN);
                    }
                }
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}