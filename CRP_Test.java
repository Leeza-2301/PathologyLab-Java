import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*; 

public class CRP_Test extends JFrame
{
	CRP_Test()
	{
		super("CRP_Test");
		setVisible(true);
		setLayout(null);
		setBounds(0,0,600,600);
		
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
		CRP_Test fm12 = new CRP_Test();
	}
}