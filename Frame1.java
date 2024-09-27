import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame1 extends JFrame {
    JButton btn_New, btn_All;
    ProjectListener fm = new ProjectListener(this);

    Frame1() {
        super("Pathology Lab");

        // Create a JPanel to set the background color
        JPanel panel = new JPanel();
        panel.setBackground(new Color(220, 255, 220)); // Light green background
        panel.setLayout(null); // Use null layout for custom positioning
        setContentPane(panel); // Set the panel as the content pane

        // Set JFrame size
        setBounds(0, 0, 800, 600);

        // Modern font for buttons
        Font buttonFont = new Font("Arial", Font.BOLD, 24);
        
        // Create buttons
        btn_New = new JButton("NEW RECORD");
        btn_All = new JButton("ALL RECORDS");

        // Set button styles: background color, text color, and borders
        btn_New.setFont(buttonFont);
        btn_All.setFont(buttonFont);

        btn_New.setBackground(new Color(34, 167, 240)); // Light blue
        btn_New.setForeground(Color.WHITE); // White text
        btn_New.setFocusPainted(false);
        btn_New.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2, true));

        btn_All.setBackground(new Color(34, 167, 240)); // Light blue
        btn_All.setForeground(Color.WHITE); // White text
        btn_All.setFocusPainted(false);
        btn_All.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2, true));

        // Add buttons to the panel
        panel.add(btn_New);
        panel.add(btn_All);

        // Position the buttons
        btn_New.setBounds(200, 150, 400, 100);
        btn_All.setBounds(200, 300, 400, 100);

        // Add action listeners for buttons
        btn_New.addActionListener(fm);
        btn_All.addActionListener(fm);

        // Handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public static void main(String[] s) {
        Frame1 fm = new Frame1();
        fm.setVisible(true);
    }
}
