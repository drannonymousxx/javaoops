package lab12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class PersonalLifeManager extends JFrame implements ActionListener {
    JButton taskBtn, habitBtn, quoteBtn;
    JPanel mainPanel;
    CardLayout cardLayout;
    public PersonalLifeManager() {
        setTitle("Personal Life Manager");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel topPanel = new JPanel();
        taskBtn = new JButton("Task Manager");
        habitBtn = new JButton("Habit Tracker");
        quoteBtn = new JButton("Quote Generator");
        topPanel.add(taskBtn);
        topPanel.add(habitBtn);
        topPanel.add(quoteBtn);
        add(topPanel, BorderLayout.NORTH);
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        mainPanel.add(new TaskManagerPanel(), "Task");
        mainPanel.add(new HabitTrackerPanel(), "Habit");
        mainPanel.add(new QuoteGeneratorPanel(), "Quote");
        add(mainPanel);
        taskBtn.addActionListener(this);
        habitBtn.addActionListener(this);
        quoteBtn.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==taskBtn)
            cardLayout.show(mainPanel,"Task");
        if(e.getSource()==habitBtn)
            cardLayout.show(mainPanel,"Habit");
        if(e.getSource()==quoteBtn)
            cardLayout.show(mainPanel,"Quote");
    }
    public static void main(String[] args) {
        new PersonalLifeManager();
    }
}
class TaskManagerPanel extends JPanel implements ActionListener {
    JTextField taskField;
    JButton addBtn, deleteBtn, completeBtn;
    DefaultListModel<String> model;
    JList<String> taskList;
    public TaskManagerPanel(){
        setLayout(new BorderLayout());
        JPanel top = new JPanel();
        taskField = new JTextField(15);
        addBtn = new JButton("Add Task");
        deleteBtn = new JButton("Delete");
        completeBtn = new JButton("Complete");
        top.add(taskField);
        top.add(addBtn);
        top.add(deleteBtn);
        top.add(completeBtn);
        add(top, BorderLayout.NORTH);
        model = new DefaultListModel<>();
        taskList = new JList<>(model);
        add(new JScrollPane(taskList), BorderLayout.CENTER);
        addBtn.addActionListener(this);
        deleteBtn.addActionListener(this);
        completeBtn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==addBtn){
            if(!taskField.getText().isEmpty()){
                model.addElement(taskField.getText());
                taskField.setText("");
            }
        }
        if(e.getSource()==deleteBtn){
            int index = taskList.getSelectedIndex();
            if(index!=-1)
                model.remove(index);
        }
        if(e.getSource()==completeBtn){
            int index = taskList.getSelectedIndex();
            if(index!=-1){
                String task = model.get(index);
                model.set(index,"✔ "+task);
            }
        }
    }
}
class HabitTrackerPanel extends JPanel {
    JCheckBox exercise, reading, meditation, study;
    public HabitTrackerPanel(){
        setLayout(new GridLayout(5,1));
        JLabel title = new JLabel("Habit Tracker", JLabel.CENTER);
        exercise = new JCheckBox("Exercise");
        reading = new JCheckBox("Reading");
        meditation = new JCheckBox("Meditation");
        study = new JCheckBox("Study");
        add(title);
        add(exercise);
        add(reading);
        add(meditation);
        add(study);
    }
}
class QuoteGeneratorPanel extends JPanel implements ActionListener{
    JLabel quoteLabel;
    JButton generateBtn;
    String quotes[] = {
        "Success is not final, failure is not fatal.",
        "Believe in yourself.",
        "Small progress is still progress.",
        "Dream big and dare to fail.",
        "Stay hungry, stay foolish."
    };
    public QuoteGeneratorPanel(){
        setLayout(new BorderLayout());
        quoteLabel = new JLabel("Click to generate quote", JLabel.CENTER);
        generateBtn = new JButton("Generate Quote");
        add(quoteLabel, BorderLayout.CENTER);
        add(generateBtn, BorderLayout.SOUTH);
        generateBtn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        Random r = new Random();
        int index = r.nextInt(quotes.length);
        quoteLabel.setText(quotes[index]);
    }
}