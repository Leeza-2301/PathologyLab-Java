import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*; 

public class ESR extends JFrame
{
	ESR()
	{
		super("ESR");
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
		ESR fm5 = new ESR();
	}
}