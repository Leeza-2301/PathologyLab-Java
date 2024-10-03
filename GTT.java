import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GTT extends JFrame {
    JLabel head, fast, one_hour, two_hour, three_hour, Urine_fast, Urine_threehour, note;
    JTextField txt_fast, txt_one_hour, txt_two_hour, txt_three_hour;
    JComboBox<String> fa1, after1;
    JButton btn_Done;
    String[] fa = {"Absent", "Present"};
    String[] after = {"Absent", "Present"};
    
    ProjectListener fm8 = new ProjectListener(this);

    GTT() {
        super("GTT");
        setVisible(true);
        setBounds(0, 0, 800, 800);  // Increased frame size
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Set layout manager
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);  // Increased padding
        gbc.fill = GridBagConstraints.HORIZONTAL;  // Expand components to fill horizontal space
        
        // Background color
        getContentPane().setBackground(new Color(230, 240, 255));

        // Larger fonts
        Font f0 = new Font("Times", Font.BOLD, 40);
        Font f1 = new Font("Times", Font.PLAIN, 25);
        Font f2 = new Font("Times", Font.PLAIN, 20);

        // Components
        head = new JLabel("Glucose Tolerance Test");
        head.setFont(f0);

        fast = new JLabel("Blood Sugar Fasting");
        fast.setFont(f1);
        txt_fast = new JTextField(30);  // Increased text field size
		txt_fast.setPreferredSize(new Dimension(150, 30)); 

        one_hour = new JLabel("Blood Sugar After 1 hr");
        one_hour.setFont(f1);
        txt_one_hour = new JTextField(15);  // Increased text field size
		txt_one_hour.setPreferredSize(new Dimension(150, 30)); 

        two_hour = new JLabel("Blood Sugar After 2 hr");
        two_hour.setFont(f1);
        txt_two_hour = new JTextField(15);  // Increased text field size
		txt_two_hour.setPreferredSize(new Dimension(150, 30)); 

        three_hour = new JLabel("Blood Sugar After 3 hr");
        three_hour.setFont(f1);
        txt_three_hour = new JTextField(15);  // Increased text field size
		txt_three_hour.setPreferredSize(new Dimension(150, 30)); 

        Urine_fast = new JLabel("Urine Sugar Fasting");
        Urine_fast.setFont(f1);
        fa1 = new JComboBox<>(fa);
        fa1.setFont(f1);  // Increased combo box font

        Urine_threehour = new JLabel("Urine Sugar After 3 hr");
        Urine_threehour.setFont(f1);
        after1 = new JComboBox<>(after);
        after1.setFont(f1);  // Increased combo box font

        note = new JLabel("All Values Are In 'mg/dl'");
        note.setFont(f2);

        btn_Done = new JButton("Done");
        btn_Done.setFont(f1);
        btn_Done.addActionListener(fm8);

        // Header
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(head, gbc);

        // Reset to default for the rest of the components
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;

        // Row 1: Blood Sugar Fasting
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(fast, gbc);
        gbc.gridx = 1;
        add(txt_fast, gbc);

        // Row 2: Blood Sugar After 1 hr
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(one_hour, gbc);
        gbc.gridx = 1;
        add(txt_one_hour, gbc);

        // Row 3: Blood Sugar After 2 hr
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(two_hour, gbc);
        gbc.gridx = 1;
        add(txt_two_hour, gbc);

        // Row 4: Blood Sugar After 3 hr
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(three_hour, gbc);
        gbc.gridx = 1;
        add(txt_three_hour, gbc);

        // Row 5: Urine Sugar Fasting
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(Urine_fast, gbc);
        gbc.gridx = 1;
        add(fa1, gbc);

        // Row 6: Urine Sugar After 3 hr
        gbc.gridx = 0;
        gbc.gridy = 6;
        add(Urine_threehour, gbc);
        gbc.gridx = 1;
        add(after1, gbc);

        // Row 7: Done button and note
        gbc.gridx = 0;
        gbc.gridy = 7;
        add(btn_Done, gbc);
        gbc.gridx = 1;
        add(note, gbc);

        // Finalize frame
        pack();
    }

    public static void main(String[] args) {
        new GTT();
    }
}
