package oopj improvement.GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {

    JLabel title, nameLabel, emailLabel, addressLabel, genderLabel, skillsLabel, imageLabel;

    JTextField nameField, emailField;
    JTextArea addressArea;

    JRadioButton male, female;
    ButtonGroup genderGroup;

    JCheckBox java, python, cpp;

    JButton submit;

    ImageIcon icon;

    RegistrationForm() {

        setTitle("Registration Form");
        setSize(500, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Title
        title = new JLabel("REGISTRATION FORM");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(120, 20, 250, 30);
        add(title);

        // Name
        nameLabel = new JLabel("Name");
        nameLabel.setBounds(50, 80, 100, 25);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(170, 80, 200, 25);
        add(nameField);

        // Email
        emailLabel = new JLabel("Email");
        emailLabel.setBounds(50, 120, 100, 25);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(170, 120, 200, 25);
        add(emailField);

        // Address
        addressLabel = new JLabel("Address");
        addressLabel.setBounds(50, 160, 100, 25);
        add(addressLabel);

        addressArea = new JTextArea();
        JScrollPane sp = new JScrollPane(addressArea);
        sp.setBounds(170, 160, 200, 70);
        add(sp);

        // Gender
        genderLabel = new JLabel("Gender");
        genderLabel.setBounds(50, 250, 100, 25);
        add(genderLabel);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        male.setBounds(170, 250, 80, 25);
        female.setBounds(260, 250, 100, 25);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        add(male);
        add(female);

        // Skills
        skillsLabel = new JLabel("Skills");
        skillsLabel.setBounds(50, 290, 100, 25);
        add(skillsLabel);

        java = new JCheckBox("Java");
        python = new JCheckBox("Python");
        cpp = new JCheckBox("C++");

        java.setBounds(170, 290, 80, 25);
        python.setBounds(250, 290, 80, 25);
        cpp.setBounds(340, 290, 80, 25);

        add(java);
        add(python);
        add(cpp);

        // Image
        icon = new ImageIcon("photo.png"); // Place an image named photo.png in the project folder
        imageLabel = new JLabel(icon);
        imageLabel.setBounds(170, 330, 100, 100);
        add(imageLabel);

        // Submit Button
        submit = new JButton("Submit");
        submit.setBounds(170, 460, 100, 30);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String gender = "";

        if (male.isSelected())
            gender = "Male";
        else if (female.isSelected())
            gender = "Female";

        String skills = "";

        if (java.isSelected())
            skills += "Java ";

        if (python.isSelected())
            skills += "Python ";

        if (cpp.isSelected())
            skills += "C++ ";

        JOptionPane.showMessageDialog(this,
                "Registration Successful!\n\n"
                + "Name : " + nameField.getText()
                + "\nEmail : " + emailField.getText()
                + "\nAddress : " + addressArea.getText()
                + "\nGender : " + gender
                + "\nSkills : " + skills);
    }

    public static void main(String[] args) {

        new RegistrationForm();

    }
}
