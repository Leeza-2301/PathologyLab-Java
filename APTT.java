import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class APTT extends JFrame {
	JLabel lblTestTime, lblApttValue, lblRemarks, lblNormalRange;
	JTextField txtTestTime, txtApttValue;
	JTextArea txtRemarks;
	JButton btnSubmit;

	APTT() {
		super("APTT Test");
		setLayout(null);
		setBounds(100, 100, 500, 500);
		getContentPane().setBackground(new Color(245, 245, 255)); // Light blue-gray

		// Label and text field for Test Time
		lblTestTime = new JLabel("Test Time (seconds):");
		lblTestTime.setBounds(50, 50, 150, 30);
		add(lblTestTime);

		txtTestTime = new JTextField();
		txtTestTime.setBounds(250, 50, 150, 30);
		add(txtTestTime);

		// Label and text field for APTT Value
		lblApttValue = new JLabel("APTT Value (seconds):");
		lblApttValue.setBounds(50, 100, 150, 30);
		add(lblApttValue);

		txtApttValue = new JTextField();
		txtApttValue.setBounds(250, 100, 150, 30);
		add(txtApttValue);

		// Label for Normal Range (Reference)
		lblNormalRange = new JLabel("Normal Range: 23.7-33.0 seconds");
		lblNormalRange.setBounds(50, 150, 200, 30);
		lblNormalRange.setForeground(Color.DARK_GRAY);
		add(lblNormalRange);

		// Label and text field for Report Time

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
				String testTime = txtTestTime.getText();
				String apttValue = txtApttValue.getText();

				String remarks = txtRemarks.getText();

				// Handle the form submission logic
				System.out.println("APTT Test Submitted:");
				System.out.println("Test Time: " + testTime);
				System.out.println("APTT Value: " + apttValue);
				System.out.println("Remarks: " + remarks);
				JOptionPane.showMessageDialog(null, "APTT Test Submitted Successfully!");
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
		new APTT().setVisible(true);
	}
}
