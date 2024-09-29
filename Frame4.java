import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Frame4 extends JFrame
{
	JButton[] btn = new JButton[10];
	ProjectListener fm4 = new ProjectListener(this);
	
	Frame4()
	{
		super("Report");
		setVisible(true);
		setLayout(null);
		setBounds(0,0,700,600);
		setContentPane(new JLabel(new ImageIcon("D:\\SEM-2\\Jatin OOP\\Project\\NEW.jpg")));
		//getContentPane().setBackground(Color.BLUE);
		
		btn[0] = new JButton("ESR");
		btn[1] = new JButton("APTT");
		btn[2] = new JButton("P.P.B.S.");
		btn[3] = new JButton("GTT");
		btn[4] = new JButton("S. Cholesterol");
		btn[5] = new JButton("Liver Function Test");
		btn[6] = new JButton("S. Uric Acid");
		btn[7] = new JButton("CRP Test");
		btn[8] = new JButton("HAEMOGRAM");
		btn[9] = new JButton("HIV");
		Font f1 = new Font("Serif",Font.BOLD,20);
		for(int i =0;i<10;i++)
		{
			add(btn[i]);
		}
		
		for(int i =0;i<10;i++)
		{
			btn[i].setFont(f1);
		}
		
		btn[0].setBounds(100,50,200,60);
		btn[1].setBounds(100,150,200,60);
		btn[2].setBounds(100,250,200,60);
		btn[3].setBounds(100,350,200,60);
		btn[4].setBounds(100,450,200,60);
		btn[5].setBounds(350,50,200,60);
		btn[6].setBounds(350,150,200,60);
		btn[7].setBounds(350,250,200,60);
		btn[8].setBounds(350,350,200,60);
		btn[9].setBounds(350,450,200,60);
		
		for(int i =0;i<10;i++)
		{
			btn[i].addActionListener(fm4);
		}
		
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
		Frame4 fm4 = new Frame4();
	}
}