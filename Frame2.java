import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*; 

public class Frame2 extends JFrame 
{
	JButton btn_Next;
	
	JLabel lbl_Name,lbl_Age,lbl_No,lbl_City,lbl_Gender,lbl_Date,lbl_Blood;
	
	JTextField txt_Name,txt_Age,txt_No,txt_City,txt_Gender,txt_Date,txt_Blood;
	
	String[] optionsToChoose = {"","Ahmedabad","Amreli","Anand","Banas Kantha","Bharuch","Bhavnagar","Bhuj","Botad","Dahod(Dohad)","Deesa",
								"Gandhidham","Gandhinagar","Godhra","Gondal","Jamnagar","Jetpur","Junagadh","Kachchh","Kalol","Kheda","Mahesana(Mehsana)",
								"Morbi","Nadiad","Narmada","Navsari","Palanpur","Panch Mahals(Panchmahal)","Patan","Porbandar","Rajkot","Sabar Kantha",
								"Surat","Surendranagar","Tapi","Vadodara","Valsad","Vapi","Veraval"};
	
	String[] blood = {"","A+","A-","B+","B-","O+","O-","AB+","AB-"};
	String[] gender = {"","Male","Female","Other"};
	ProjectListener fm2 = new ProjectListener(this);
	Frame2()
	{
		super("Details");
		setLayout(null);
		setVisible(true);
		setBounds(0,0,650,600);
	    setContentPane(new JLabel(new ImageIcon("D:\\SEM-2\\Jatin OOP\\Project\\NEW RECORD.jpg")));
		
		Font f1 = new Font("Serif",Font.BOLD,30);
		Font f2 = new Font("Times",Font.BOLD,20);
		Font f3 = new Font("Times",Font.BOLD,25);
		
		JButton btn_Next = new JButton("NEXT");
		
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
	    //txt_City = new TextField();
		JComboBox<String> txt_City = new JComboBox<>(optionsToChoose);
		//txt_Gender = new JTextField();
		txt_Date = new JTextField();
		//txt_Blood = new TextField();
		JComboBox<String> txt_Blood = new JComboBox<>(blood);
		JComboBox<String> txt_Gender = new JComboBox<>(gender);
		
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

		btn_Next.setFont(f1);
		
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
		
		lbl_Name.setBounds(50,50,100,50);
		txt_Name.setBounds(150,50,400,50);
		
		lbl_Date.setBounds(50,150,60,50);
		txt_Date.setBounds(150,150,150,50);
		
		lbl_City.setBounds(350,150,60,50);
		txt_City.setBounds(410,150,140,50);
		
		lbl_Age.setBounds(50,250,70,50);
		txt_Age.setBounds(150,250,70,50);
		
		lbl_No.setBounds(250,250,80,50);
		txt_No.setBounds(370,250,180,50);
		
		lbl_Gender.setBounds(50,350,100,50);
		txt_Gender.setBounds(150,350,100,50);
		
		lbl_Blood.setBounds(270,350,150,50);
		txt_Blood.setBounds(430,350,120,50);
		
		btn_Next.setBounds(200,450,250,60);
		
		btn_Next.addActionListener(fm2);
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					dispose();
				}
			});
	}
	/*
	public void paint(Graphics g)
	{
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("D:\\SEM-2\\Jatin OOP\\Project\\NEW RECORD.jpg");
		g.drawImage(i,0,0,this);
	}
	*/
	public static void main(String s[])
	{
		Frame2 fm2 = new Frame2();
		//JFrame f = new JFrame();
		  //f.add(fm2);
		fm2.setVisible(true);
	}
}