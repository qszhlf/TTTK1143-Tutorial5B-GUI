
import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {

    public MainMenu() {

        setTitle("Tutorial 5(b) - GUI & Event Handling");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(7, 1, 10, 10));

        panel.setBorder(
            BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        JLabel title = new JLabel(
            "TUTORIAL 5(b) - MAIN MENU",
            JLabel.CENTER
        );

        JButton btnQ1 = new JButton("Q1 - JButton & ActionListener");
        JButton btnQ2 = new JButton("Q2 - JTextField & BorderLayout");
        JButton btnQ3 = new JButton("Q3 - JCheckBox & ItemListener");
        JButton btnQ4 = new JButton("Q4 - JRadioButton");
        JButton btnQ5 = new JButton("Q5 - Simple Counter");
        JButton btnQ6 = new JButton("Q6 - Simple Calculator");

        panel.add(title);
        panel.add(btnQ1);
        panel.add(btnQ2);
        panel.add(btnQ3);
        panel.add(btnQ4);
        panel.add(btnQ5);
        panel.add(btnQ6);

        add(panel);

        // Open each GUI with the correct window size

        btnQ1.addActionListener(e ->
            openGUI(new MyJButton(), "My Frame", 300, 200));

        btnQ2.addActionListener(e ->
            openGUI(new MyJTextField(), "My Frame", 300, 120));

        btnQ3.addActionListener(e ->
            openGUI(new MyJCheckBox(), "My Frame", 350, 200));

        btnQ4.addActionListener(e ->
            openGUI(new MyJRadioButton(), "My Frame", 350, 250));

        btnQ5.addActionListener(e ->
            openGUI(new SimpleCounter(), "Simple Counter", 350, 150));

        btnQ6.addActionListener(e ->
            openGUI(new SimpleCalculator(), "Simple Calculator", 450, 300));
    }

    // Set up and display each GUI
    private void openGUI(JFrame frame, String title,
                         int width, int height) {

        frame.setTitle(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new MainMenu().setVisible(true);
        });
    }
}
