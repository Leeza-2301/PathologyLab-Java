import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*; 

public class S_Cholesterol extends JFrame
{
	S_Cholesterol()
	{
		super("S_Cholesterol");
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
		S_Cholesterol fm9 = new S_Cholesterol();
	}
}