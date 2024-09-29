import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame4 extends JFrame {
    JButton[] btn = new JButton[10];
    ProjectListener fm4 = new ProjectListener(this);
    
    Frame4() {
        super("Report");
        setVisible(true);
        setLayout(null);
        setBounds(0, 0, 700, 600);
        getContentPane().setBackground(new Color(200, 230, 255)); // Light blue background

        // Define button labels
        String[] buttonLabels = {
            "ESR", "APTT", "P.P.B.S.", "GTT", "S. Cholesterol",
            "Liver Function Test", "S. Uric Acid", "CRP Test", 
            "HAEMOGRAM", "HIV"
        };

        // Create buttons and set properties
        Font buttonFont = new Font("Arial", Font.BOLD, 16); // Modern sans-serif font
        Color buttonColor = new Color(100, 149, 237); // Cornflower Blue
        Color hoverColor = new Color(72, 118, 255);  // Darker blue on hover

        for (int i = 0; i < btn.length; i++) {
            btn[i] = new JButton(buttonLabels[i]);
            btn[i].setFont(buttonFont);
            btn[i].setBackground(buttonColor);
            btn[i].setForeground(Color.WHITE);
            btn[i].setFocusPainted(false);  // Removes focus border on buttons
            btn[i].setBorderPainted(false); // Removes button border
            add(btn[i]);

            // Add hover effect
            btn[i].addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    ((JButton) evt.getSource()).setBackground(hoverColor);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    ((JButton) evt.getSource()).setBackground(buttonColor);
                }
            });

            btn[i].addActionListener(fm4);
        }

        // Button positioning
        int x1 = 100, x2 = 350, yStart = 50, yOffset = 100;
        for (int i = 0; i < 5; i++) {
            btn[i].setBounds(x1, yStart + i * yOffset, 200, 60);
            btn[i + 5].setBounds(x2, yStart + i * yOffset, 200, 60);
        }

        // Close the window on exit
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Frame4();
    }
}
