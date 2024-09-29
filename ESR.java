
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ESR extends JFrame {
    JLabel lblTestTime, lblEsrValue, lblMethod;
    JTextField txtTestTime, txtEsrValue;
    JComboBox<String> cmbMethod;
    JButton btnSubmit;

    String[] methodOptions = {"Westergren Method", "Wintrobe Method"};

    ESR() {
        super("ESR Test");
        setLayout(null);
        setBounds(100, 100, 400, 400);
        getContentPane().setBackground(new Color(255, 250, 205)); // Light yellow

        // Label and text field for Test Time
        lblTestTime = new JLabel("Test Time (minutes):");
        lblTestTime.setBounds(50, 50, 150, 30);
        add(lblTestTime);

        txtTestTime = new JTextField();
        txtTestTime.setBounds(200, 50, 130, 30);
        add(txtTestTime);

        // Label and text field for ESR Value
        lblEsrValue = new JLabel("ESR Value (mm/hr):");
        lblEsrValue.setBounds(50, 100, 150, 30);
        add(lblEsrValue);

        txtEsrValue = new JTextField();
        txtEsrValue.setBounds(200, 100, 130, 30);
        add(txtEsrValue);

        // Label and dropdown for Method
        lblMethod = new JLabel("Method:");
        lblMethod.setBounds(50, 150, 150, 30);
        add(lblMethod);

        cmbMethod = new JComboBox<>(methodOptions);
        cmbMethod.setBounds(200, 150, 130, 30);
        add(cmbMethod);

        // Submit button
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(150, 250, 100, 40);
        add(btnSubmit);

        // Button event handler
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String testTime = txtTestTime.getText();
                String esrValue = txtEsrValue.getText();
                String method = (String) cmbMethod.getSelectedItem();

                // Handle the form submission logic
                System.out.println("ESR Test Submitted:");
                System.out.println("Test Time: " + testTime);
                System.out.println("ESR Value: " + esrValue);
                System.out.println("Method: " + method);

                JOptionPane.showMessageDialog(null, "ESR Test Submitted Successfully!");
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
        new ESR().setVisible(true);
    }
}
