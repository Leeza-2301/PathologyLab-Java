import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame3 extends JFrame 
{

	TextField txt_Search;
	JLabel lbl_Search;
	JComboBox<String> c1;
	String[] searchBy = {"Name","Age","No","City","Gender","Date","Blood"};
	JButton btn_Search;
	ProjectListener fm3 = new ProjectListener(this);
	Frame3()
	{
		super("Records");
		setVisible(true);
		setLayout(null);
		setBounds(0,0,700,700);
		getContentPane().setBackground(new Color(220, 255, 220));

		Font f1 = new Font("Arial", Font.BOLD, 30);
        Font f2 = new Font("Arial", Font.PLAIN, 20);
		
		lbl_Search = new JLabel("SEARCH RECORDS");
		c1 = new JComboBox<>(searchBy);
		txt_Search = new TextField();
		btn_Search = new JButton("SEARCH");
		
		
		lbl_Search.setFont(f1);
		lbl_Search.setHorizontalAlignment(JLabel.CENTER);
		c1.setFont(f2);
		txt_Search.setFont(f2);
		btn_Search.setFont(f1);

		btn_Search.setBackground(new Color(34, 167, 240));
		btn_Search.setForeground(Color.WHITE);
        btn_Search.setFocusPainted(false);
        btn_Search.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2, true));
		
		add(lbl_Search);
		add(c1);
		add(txt_Search);
		add(btn_Search);
		
		lbl_Search.setBounds(150, 100, 400, 50);
        c1.setBounds(150, 200, 400, 50);
        txt_Search.setBounds(150, 300, 400, 50);
        btn_Search.setBounds(150, 400, 400, 60);
		
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