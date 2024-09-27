import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*; 

public class HIV extends JFrame
{
	HIV()
	{
		super("HIV");
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
		HIV fm14 = new HIV();
	}
}