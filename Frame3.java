import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*; 

public class Frame3 extends JFrame 
{

	TextField txt_Search;
	Label lbl_Search;
	String[] searchBy = {"Name","Age","No","City","Gender","Date","Blood"};
	JButton btn_Search;
	ProjectListener fm3 = new ProjectListener(this);
	Frame3()
	{
		super("Records");
		setVisible(true);
		setLayout(null);
		setBounds(0,0,700,700);
		setContentPane(new JLabel(new ImageIcon("D:\\SEM-2\\Jatin OOP\\Project\\ALL RECORDS.jpg")));
		getContentPane().setBackground(Color.CYAN);
	
		
		Label lbl_Search = new Label("SEARCH RECORDS");
		JComboBox<String> c1 = new JComboBox(searchBy);
		TextField txt_Search = new TextField();
		JButton btn_Search = new JButton("SEARCH");
		Font f1 = new Font("Times",Font.BOLD,30);
		
		
		//setContentPane(new JLabel(new ImageIcon("D:\\SEM-2\\Jatin OOP\\Project\\OLD RECORDS.jpg")));
		//setLayout(new FlowLayout());
		
		
		lbl_Search.setFont(f1);
		c1.setFont(f1);
		txt_Search.setFont(f1);
		btn_Search.setFont(f1);
		
		add(lbl_Search);
		add(c1);
		add(txt_Search);
		add(btn_Search);
		
		lbl_Search.setBounds(175,150,350,50);
		c1.setBounds(150,250,400,50);
		txt_Search.setBounds(150,350,400,50);
		btn_Search.setBounds(150,450,400,50);
		
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
		Frame3 fm3 = new Frame3();
		fm3.setVisible(true);
	}
}