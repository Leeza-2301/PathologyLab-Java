import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*; 

public class S_Uric_Acid extends JFrame
{
	S_Uric_Acid()
	{
		super("S_Uric_Acid");
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
		S_Uric_Acid fm11 = new S_Uric_Acid();
	}
}