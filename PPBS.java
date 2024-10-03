import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PPBS extends JFrame {
    JLabel lblBloodSugarLevel, lblTestTime, lblRemarks, lblNormalRange, lblReportTime;
    JTextField txtBloodSugarLevel, txtTestTime, txtReportTime;
    JTextArea txtRemarks;
    JButton btnSubmit;

    PPBS() {
        super("PPBS Test");
        setLayout(null);
        setBounds(100, 100, 500, 500);
        getContentPane().setBackground(new Color(240, 248, 255)); // Light blue background

        // Label and text field for Blood Sugar Level
        lblBloodSugarLevel = new JLabel("Blood Sugar Level (mg/dL):");
        lblBloodSugarLevel.setBounds(50, 50, 180, 30);
        add(lblBloodSugarLevel);

        txtBloodSugarLevel = new JTextField();
        txtBloodSugarLevel.setBounds(250, 50, 150, 30);
        add(txtBloodSugarLevel);

        // Label and text field for Test Time
        lblTestTime = new JLabel("Test Time (hh:mm):");
        lblTestTime.setBounds(50, 100, 150, 30);
        add(lblTestTime);

        txtTestTime = new JTextField();
        txtTestTime.setBounds(250, 100, 150, 30);
        add(txtTestTime);

        // Label for Normal Range (Reference)
        lblNormalRange = new JLabel("Normal Range: < 140 mg/dL");
        lblNormalRange.setBounds(50, 150, 200, 30);
        lblNormalRange.setForeground(Color.DARK_GRAY);
        add(lblNormalRange);


        // Label and text area for Remarks
        lblRemarks = new JLabel("Remarks:");
        lblRemarks.setBounds(50, 200, 150, 30);
        add(lblRemarks);

        txtRemarks = new JTextArea();
        txtRemarks.setBounds(150, 200, 150, 60);
        add(txtRemarks);

        // Submit button
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(175, 300, 100, 40);
        add(btnSubmit);

        // Button event handler
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String bloodSugarLevel = txtBloodSugarLevel.getText();
                String testTime = txtTestTime.getText();
                String reportTime = txtReportTime.getText();
                String remarks = txtRemarks.getText();

                // Handle the form submission logic
                System.out.println("PPBS Test Submitted:");
                System.out.println("Blood Sugar Level: " + bloodSugarLevel);
                System.out.println("Test Time: " + testTime);
                System.out.println("Report Time: " + reportTime);
                System.out.println("Remarks: " + remarks);

                JOptionPane.showMessageDialog(null, "PPBS Test Submitted Successfully!");
            }
        });

        // Window close operation
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new PPBS().setVisible(true);
    }
}
