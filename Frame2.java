import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame2 extends JFrame {
	JButton btn_Next;

	JLabel lbl_Name, lbl_Age, lbl_No, lbl_City, lbl_Gender, lbl_Date, lbl_Blood;

	JTextField txt_Name, txt_Age, txt_No, txt_City, txt_Date, txt_Blood;
	JComboBox<String> txt_Gender;

	String[] optionsToChoose = { "", "Ahmedabad", "Amreli", "Anand", "Banas Kantha", "Bharuch", "Bhavnagar", "Bhuj",
			"Botad", "Dahod(Dohad)", "Deesa",
			"Gandhidham", "Gandhinagar", "Godhra", "Gondal", "Jamnagar", "Jetpur", "Junagadh", "Kachchh", "Kalol",
			"Kheda", "Mahesana(Mehsana)",
			"Morbi", "Nadiad", "Narmada", "Navsari", "Palanpur", "Panch Mahals(Panchmahal)", "Patan", "Porbandar",
			"Rajkot", "Sabar Kantha",
			"Surat", "Surendranagar", "Tapi", "Vadodara", "Valsad", "Vapi", "Veraval"};

	String[] blood = { "", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
	String[] gender = { "", "Male", "Female", "Other"};
	ProjectListener fm2 = new ProjectListener(this);

	Frame2() {
		super("Details");
		setLayout(null);
		setVisible(true);
		setBounds(0, 0, 650, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		getContentPane().setBackground(new Color(220, 255, 220));

		Font f1 = new Font("Serif", Font.BOLD, 30);
		Font f2 = new Font("Times", Font.BOLD, 20);
		Font f3 = new Font("Times", Font.BOLD, 25);

		JButton btn_Next = new JButton("NEXT");
		btn_Next.setFont(f1);
		btn_Next.setBackground(new Color(34, 167, 240));
		btn_Next.setForeground(Color.WHITE);
		btn_Next.setFocusPainted(false);
		btn_Next.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2, true));

		lbl_Name = new JLabel("Name :");
		lbl_Age = new JLabel("Age :");
		lbl_No = new JLabel("Number:");
		lbl_City = new JLabel("City :");
		lbl_Gender = new JLabel("Gender :");
		lbl_Date = new JLabel("Date :");
		lbl_Blood = new JLabel("Blood Group :");

		txt_Name = new JTextField();
		txt_Age = new JTextField();
		txt_No = new JTextField();
		JComboBox<String> txt_City = new JComboBox<>(optionsToChoose);
		txt_Date = new JTextField();
		JComboBox<String> txt_Blood = new JComboBox<>(blood);
		txt_Gender = new JComboBox<>(gender);

		lbl_Name.setFont(f2);
		lbl_Age.setFont(f2);
		lbl_No.setFont(f2);
		lbl_City.setFont(f2);
		lbl_Gender.setFont(f2);
		lbl_Date.setFont(f2);
		lbl_Blood.setFont(f2);
		txt_Name.setFont(f3);
		txt_Age.setFont(f3);
		txt_No.setFont(f3);
		txt_City.setFont(f2);
		txt_Gender.setFont(f3);
		txt_Date.setFont(f3);
		txt_Blood.setFont(f3);

		add(lbl_Name);
		add(lbl_Age);
		add(lbl_No);
		add(lbl_City);
		add(lbl_Gender);
		add(lbl_Date);
		add(lbl_Blood);

		add(txt_Name);
		add(txt_Age);
		add(txt_No);
		add(txt_City);
		add(txt_Gender);
		add(txt_Date);
		add(txt_Blood);

		add(btn_Next);

		lbl_Name.setBounds(50, 50, 100, 30);
		txt_Name.setBounds(150, 50, 400, 30);
		lbl_Date.setBounds(50, 100, 60, 30);
		txt_Date.setBounds(150, 100, 150, 30);
		lbl_City.setBounds(350, 100, 60, 30);
		txt_City.setBounds(410, 100, 140, 30);
		lbl_Age.setBounds(50, 150, 70, 30);
		txt_Age.setBounds(150, 150, 70, 30);
		lbl_No.setBounds(250, 150, 80, 30);
		txt_No.setBounds(370, 150, 180, 30);
		lbl_Gender.setBounds(50, 200, 100, 30);
		txt_Gender.setBounds(150, 200, 100, 30);
		lbl_Blood.setBounds(270, 200, 150, 30);
		txt_Blood.setBounds(430, 200, 120, 30);
		btn_Next.setBounds(200, 300, 250, 60);

		btn_Next.addActionListener(fm2);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
	}

	public static void main(String s[]) {
		Frame2 fm2 = new Frame2();
		fm2.setVisible(true);
	}
}