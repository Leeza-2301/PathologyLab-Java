import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*; 

public class LIVER extends JFrame
{
	JLabel test;
	JLabel billirubin,btotal,direct,indirect,alkaline,sgpt,sgot,serum_proteins,stotal,salbumin,sglobulins,a_ration;
	JTextField txt_btotal,txt_direct,txt_indirect,txt_alkaline,txt_sgpt,txt_sgot,txt_stotal,txt_salbumin,txt_sglobulins,txt_a_ratio;
	Label bm,dm,imd,sa,sgi,sgiu,sg,sgm,sggm;
	Label lbl_heading,lbl_btotal,lbl_direct,lbl_indirect,lbl_alkaline,lbl_sgpt,lbl_sgot,lbl_stotal,lbl_salbmin,lbl_sglobulins,lbl_a_ratio;
	JButton btn_save;
	
	ProjectListener fm10 = new ProjectListener(this);
	
	LIVER()
	{
		super("Liver Function Test");
		setVisible(true);
		setLayout(null);
		setBounds(0,0,1000,900);
		
		setContentPane(new JLabel(new ImageIcon("D:\\SEM-2\\Jatin OOP\\Project\\liver.jpg")));
		
		Font f0 = new Font("Times",Font.BOLD,35);
		Font f1 = new Font("Times",Font.BOLD,25);
		Font f2 = new Font("Times",Font.BOLD,15);
		
		test = new JLabel("LIVER FUNCTION TEST");
		billirubin = new JLabel("S. Billirubin :");
		btotal = new JLabel("Total");
		direct = new JLabel("Direct");
		indirect = new JLabel("Indirect");
		alkaline = new JLabel("S. Alkaline Pho. :");
		sgpt = new JLabel("S.G.P.T.(ALT) :");
		sgot = new JLabel("S.G.O.T.(AST) :");
		serum_proteins = new JLabel("Serum Proteins :");
		stotal = new JLabel("Total");
		salbumin = new JLabel("Albumin");
		sglobulins = new JLabel("Globulins");
		a_ration = new JLabel("A/G Ratio");
		
		bm = new Label("mg/dl");
		dm = new Label("mg/dl");
		imd = new Label("md/dl");
		sa = new Label("IU/L");
		sgi = new Label("IU/L");
		sgiu = new Label("IU/L");
		sg = new Label("gm/dl");
		sgm = new Label("gm/dl");
		sggm = new Label("gm/dl");
		
		txt_btotal = new JTextField();
		txt_direct = new JTextField();
		txt_indirect = new JTextField();
		txt_alkaline = new JTextField();
		txt_sgpt = new JTextField();
		txt_sgot = new JTextField();
		txt_stotal = new JTextField();
		txt_salbumin = new JTextField();
		txt_sglobulins = new JTextField();
		txt_a_ratio = new JTextField();
		
		lbl_heading = new Label("Ref.Range");
		lbl_btotal = new Label("[0.2 To 1.0]");
		lbl_direct = new Label("[0.0 To 0.25]");
		lbl_indirect = new Label("[0.1 To 0.4]");
		lbl_alkaline = new Label("[0-270]");
		lbl_sgpt = new Label("[5-35]");
		lbl_sgot = new Label("[5-40]");
		lbl_stotal = new Label("Adult 6.0 To 7.8");
		lbl_salbmin = new Label("Adult 3.0 To 4.5");
		lbl_sglobulins = new Label("Adult 2.3 To 3.5");
		lbl_a_ratio = new Label("[0.9-2.9]");
		btn_save = new JButton("SAVE");
		
		add(test);
		add(billirubin);
		add(btotal);
		add(direct);
		add(indirect);
		add(alkaline);
		add(sgpt);
		add(sgot);
		add(serum_proteins);
		add(stotal);
		add(salbumin);
		add(sglobulins);
		add(a_ration);
		add(bm);
		add(dm);
		add(imd);
		add(sa);
		add(sgi);
		add(sgiu);
		add(sg);
		add(sgm);
		add(sggm);
		add(txt_btotal);
		add(txt_direct);
		add(txt_indirect);
		add(txt_alkaline);
		add(txt_sgpt);
		add(txt_sgot);
		add(txt_stotal);
		add(txt_salbumin);
		add(txt_sglobulins);
		add(txt_a_ratio);
		add(btn_save);
		add(lbl_heading);
		add(lbl_btotal);
		add(lbl_direct);
		add(lbl_indirect);
		add(lbl_alkaline);
		add(lbl_sgpt);
		add(lbl_sgot);
		add(lbl_stotal);
		add(lbl_salbmin);
		add(lbl_sglobulins);
		add(lbl_a_ratio);
		
		test.setFont(f0);
		billirubin.setFont(f1);
		btotal.setFont(f1);
		direct.setFont(f1);
		indirect.setFont(f1);
		alkaline.setFont(f1);
		sgpt.setFont(f1);
		sgot.setFont(f1);
		serum_proteins.setFont(f1);
		stotal.setFont(f1);
		salbumin.setFont(f1);
		sglobulins.setFont(f1);
		a_ration.setFont(f1);
		bm.setFont(f2);
		dm.setFont(f2);
		imd.setFont(f2);
		sa.setFont(f2);
		sgi.setFont(f2);
		sgiu.setFont(f2);
		sg.setFont(f2);
		sgm.setFont(f2);
		sggm.setFont(f2);
		txt_btotal.setFont(f1);
		txt_direct.setFont(f1);
		txt_indirect.setFont(f1);
		txt_alkaline.setFont(f1);
		txt_sgpt.setFont(f1);
		txt_sgot.setFont(f1);
		txt_stotal.setFont(f1);
		txt_salbumin.setFont(f1);
		txt_sglobulins.setFont(f1);
		txt_a_ratio.setFont(f1);
		btn_save.setFont(f1);
		lbl_heading.setFont(f2);
		lbl_btotal.setFont(f2);
		lbl_direct.setFont(f2);
		lbl_indirect.setFont(f2);
		lbl_alkaline.setFont(f2);
		lbl_sgpt.setFont(f2);
		lbl_sgot.setFont(f2);
		lbl_stotal.setFont(f2);
		lbl_salbmin.setFont(f2);
		lbl_sglobulins.setFont(f2);
		lbl_a_ratio.setFont(f2);
		
		test.setBounds(330,20,400,50);
		billirubin.setBounds(100,80,300,50);
		lbl_heading.setBounds(600,80,100,30);
		
		btotal.setBounds(250,150,150,50);
		txt_btotal.setBounds(450,150,60,50);
		bm.setBounds(510,170,50,30);
		lbl_btotal.setBounds(600,150,100,30);
		
		direct.setBounds(250,200,150,50);
		txt_direct.setBounds(450,200,60,50);
		dm.setBounds(510,220,50,30);
		lbl_direct.setBounds(600,200,100,30);
		
		indirect.setBounds(250,250,150,50);
		txt_indirect.setBounds(450,250,60,50);
		imd.setBounds(510,270,50,30);
		lbl_indirect.setBounds(600,250,100,30);
		
		alkaline.setBounds(100,300,300,50);
		txt_alkaline.setBounds(450,300,60,50);
		sa.setBounds(510,320,50,30);
		lbl_alkaline.setBounds(600,300,100,30);
		
		sgpt.setBounds(100,350,300,50);
		txt_sgpt.setBounds(450,350,60,50);
		sgi.setBounds(510,370,50,30);
		lbl_sgpt.setBounds(600,350,100,30);
		
		sgot.setBounds(100,400,300,50);
		txt_sgot.setBounds(450,400,60,50);
		sgiu.setBounds(510,420,50,30);
		lbl_sgot.setBounds(600,400,100,30);
		
		serum_proteins.setBounds(100,450,300,50);
		
		stotal.setBounds(250,500,150,50);
		txt_stotal.setBounds(450,500,60,50);
		sg.setBounds(510,520,50,30);
		lbl_stotal.setBounds(600,500,120,30);
		
		salbumin.setBounds(250,550,150,50);
		txt_salbumin.setBounds(450,550,60,50);
		sgm.setBounds(510,570,50,30);
		lbl_salbmin.setBounds(600,550,120,30);
		
		sglobulins.setBounds(250,600,150,50);
		txt_sglobulins.setBounds(450,600,60,50);
		sggm.setBounds(510,620,50,30);
		lbl_sglobulins.setBounds(600,600,120,30);
		
		a_ration.setBounds(250,650,150,50);
		txt_a_ratio.setBounds(450,650,60,50);
		lbl_a_ratio.setBounds(600,650,120,30);
		
		btn_save.setBounds(350,730,300,50);
		
		btn_save.addActionListener(fm10);
		
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
		LIVER fm10 = new LIVER();
	}
}