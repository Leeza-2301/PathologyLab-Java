import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*; 

public class GTT extends JFrame
{
	JLabel head,fast,one_hour,two_hour,three_hour,Urine_fast,Urine_threehour,note;
	TextField txt_fast,txt_one_hour,txt_two_hour,txt_three_hour;
	Label lbl_head,lbl_fast,lbl_Urine,lbl_twohour;
	String[] fa = {"Absent","Present"};
	String[] after = {"Absent","Present"};
	JButton btn_Done;
	
	ProjectListener fm8 = new ProjectListener(this);
	GTT()
	{
		super("GTT");
		setVisible(true);
		setLayout(null);
		setBounds(0,0,1000,800);
		
		setContentPane(new JLabel(new ImageIcon("D:\\SEM-2\\Jatin OOP\\Project\\GTT.jpg")));
		
		Font f0 = new Font("Times",Font.BOLD,35);
		Font f1 = new Font("Times",Font.BOLD,25);
		Font f2 = new Font("Times",Font.BOLD,15);
		
		head = new JLabel("Glucose Tolerance Test");
		fast = new JLabel("Blood Sugar Fasting");
		one_hour = new JLabel("Blood Sugar  After 1 hr");
		two_hour = new JLabel("Blood Sugar  After 2 hr");
		three_hour = new JLabel("Blood Sugar  After 3 hr");
		Urine_fast = new JLabel("Urine Sugar Fasting");
		Urine_threehour = new JLabel("Urine Sugar After 3 hr");
		note = new JLabel("All Values Are In 'mg/dl'");
		JComboBox<String> fa1 = new JComboBox(fa);
		JComboBox<String> after1 = new JComboBox(after);
		
		txt_fast = new TextField();
		txt_one_hour = new TextField();
		txt_two_hour = new TextField();
		txt_three_hour = new TextField();
		
		lbl_head = new Label("Ref.Range");
		lbl_fast = new Label("70-110");
		lbl_Urine = new Label("Absent");
		lbl_twohour = new Label("70-140");
		
		btn_Done = new JButton("Done");
		
		fast.setForeground(Color.cyan);
		one_hour.setForeground(Color.cyan);
		two_hour.setForeground(Color.cyan);
		three_hour.setForeground(Color.cyan);
		Urine_fast.setForeground(Color.cyan);
		Urine_threehour.setForeground(Color.cyan);
		
		add(head);
		add(fast);
		add(one_hour);
		add(two_hour);
		add(three_hour);
		add(fa1);
		add(after1);
		add(btn_Done);
		add(Urine_fast);
		add(Urine_threehour);
		add(txt_fast);
		add(txt_one_hour);
		add(txt_two_hour);
		add(txt_three_hour);
		add(note);
		add(lbl_head);
		add(lbl_fast);
		add(lbl_Urine);
		add(lbl_twohour);
		
		head.setFont(f0);
		fast.setFont(f1);
		one_hour.setFont(f1);
		two_hour.setFont(f1);
		three_hour.setFont(f1);
		fa1.setFont(f1);
		after1.setFont(f1);
		Urine_fast.setFont(f1);
		Urine_threehour.setFont(f1);
		btn_Done.setFont(f1);
		txt_fast.setFont(f1);
		txt_one_hour.setFont(f1);
		txt_two_hour.setFont(f1);
		txt_three_hour.setFont(f1);
		note.setFont(f2);
		lbl_head.setFont(f2);
		lbl_fast.setFont(f2);
		lbl_Urine.setFont(f2);
		lbl_twohour.setFont(f2);
		
		head.setBounds(270,20,400,50);
		
		lbl_head.setBounds(600,70,100,30);
		
		fast.setBounds(100,100,300,50);
		txt_fast.setBounds(450,100,100,50);
		lbl_fast.setBounds(600,110,100,30);
		
		Urine_fast.setBounds(100,200,300,50);
		fa1.setBounds(450,200,150,50);
		lbl_Urine.setBounds(600,200,100,30);
		
		one_hour.setBounds(100,300,300,50);
		txt_one_hour.setBounds(450,300,100,50);
		
		two_hour.setBounds(100,400,300,50);
		txt_two_hour.setBounds(450,400,100,50);
		lbl_twohour.setBounds(600,400,100,30);
		
		three_hour.setBounds(100,500,300,50);
		txt_three_hour.setBounds(450,500,100,50);
		
		Urine_threehour.setBounds(100,600,300,50);
		after1.setBounds(450,600,150,50);
		
		btn_Done.setBounds(300,700,300,50);
		note.setBounds(780,700,200,50);
		
		//txt_fast.addActionListener(fm8);
		btn_Done.addActionListener(fm8);
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					dispose();
				}
			});
	}
	public static void main(String s[])
	{
		GTT fm8 = new GTT();
	}
}