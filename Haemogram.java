import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*; 

public class Haemogram extends JFrame
{
	
	JLabel haemogram,Haemoglobin,RBC_Count,hct,mcv,mch,mchc,rdw,total_wbc;
	Label gm,millons,per,fl,pg,g,percen,cumm;
	Label lbl_he,lbl_haemogram_M,lbl_haemogram_F,lbl_RBC_Count_M,lbl_RBC_Count_F,lbl_hct_M,lbl_hct_F,lbl_mcv,lbl_mch,lbl_mchc,lbl_rdw,lbl_wbc;
	TextField txt_Haemoglobin,txt_RBC_Count,txt_hct,txt_mcv,txt_mch,txt_mchc,txt_rdw,txt_total_wbc;
	JButton btn_DOne;
	
	ProjectListener fm13 = new ProjectListener(this);
	
	Haemogram()
	{
		super("Haemogram Report");
		setVisible(true);
		setLayout(null);
		setBounds(0,0,1000,800);
		
		setContentPane(new JLabel(new ImageIcon("D:\\SEM-2\\Jatin OOP\\Project\\blood-cells.jpg")));
		
		Font f0 = new Font("Times",Font.BOLD,35);
		Font f1 = new Font("Times",Font.BOLD,20);
		Font f2 = new Font("Times",Font.BOLD,15);
		
		haemogram = new JLabel("Haemogram Report");
		Haemoglobin = new JLabel("Haemoglobin");
		RBC_Count = new JLabel("RBC Count");
		hct = new JLabel("HCT");
		mcv = new JLabel("MCV");
		mch = new JLabel("MCH");
		mchc = new JLabel("MCHC");
		rdw = new JLabel("RDW");
		total_wbc = new JLabel("Total WBC Count");
		
		gm = new Label("gm/dL");
		millons = new Label("millons/cumm");
		per = new Label("%");
		fl = new Label("fL");
		pg = new Label("pg");
		g = new Label("g/dl");
		percen = new Label("%");
		cumm = new Label("/cumm");
		
		txt_Haemoglobin = new TextField();
		txt_RBC_Count = new TextField();
		txt_hct = new TextField();
		txt_mcv = new TextField();
		txt_mch = new TextField();
		txt_mchc = new TextField();
		txt_rdw = new TextField();
		txt_total_wbc = new TextField();
		
		lbl_he = new Label("Ref.Range");
		lbl_haemogram_M = new Label("M: 13-17 gm/dl");
		lbl_haemogram_F = new Label("F: 12-15 gm/dl");
		lbl_RBC_Count_M = new Label("M: 4.5-5.5 millions/cumm");
		lbl_RBC_Count_F = new Label("F: 3.8-4.8 millions/cumm");
		lbl_hct_M = new Label("M: 40-50 %");
		lbl_hct_F = new Label("F: 36-46 %");
		lbl_mcv = new Label("76-96 fL");
		lbl_mch = new Label("28-32 pg");
		lbl_mchc = new Label("32-36 g/dl");
		lbl_rdw = new Label("11.5-14 %");
		lbl_wbc = new Label("4000-11000/cumm");
		
		
		
		btn_DOne = new JButton("DONE");
		
		Haemoglobin.setForeground(Color.GREEN);
		RBC_Count.setForeground(Color.GREEN);
		hct.setForeground(Color.GREEN);
		mcv.setForeground(Color.GREEN);
		mch.setForeground(Color.GREEN);
		mchc.setForeground(Color.GREEN);
		rdw.setForeground(Color.GREEN);
		total_wbc.setForeground(Color.GREEN);
		
		add(haemogram);
		add(Haemoglobin);
		add(RBC_Count);
		add(hct);
		add(mcv);
		add(mch);
		add(mchc);
		add(rdw);
		add(total_wbc);
		add(txt_Haemoglobin);
		add(txt_RBC_Count);
		add(txt_hct);
		add(txt_mcv);
		add(txt_mch);
		add(txt_mchc);
		add(txt_rdw);
		add(txt_total_wbc);
		add(gm);
		add(millons);
		add(per);
		add(fl);
		add(pg);
		add(g);
		add(percen);
		add(cumm);
		add(btn_DOne);
		add(lbl_haemogram_M);
		add(lbl_haemogram_F);
		add(lbl_RBC_Count_M);
		add(lbl_RBC_Count_F);
		add(lbl_hct_M);
		add(lbl_hct_F);
		add(lbl_mcv);
		add(lbl_mch);
		add(lbl_mchc);
		add(lbl_rdw);
		add(lbl_wbc);
		add(lbl_he);
		
		haemogram.setFont(f0);
		Haemoglobin.setFont(f1);
		RBC_Count.setFont(f1);
		hct.setFont(f1);
		mcv.setFont(f1);
		mch.setFont(f1);
		mchc.setFont(f1);
		rdw.setFont(f1);
		total_wbc.setFont(f1);
		txt_Haemoglobin.setFont(f1);
		txt_RBC_Count.setFont(f1);
		txt_hct.setFont(f1);
		txt_mcv.setFont(f1);
		txt_mch.setFont(f1);
		txt_mchc.setFont(f1);
		txt_rdw.setFont(f1);
		txt_total_wbc.setFont(f1);
		gm.setFont(f2);
		millons.setFont(f2);
		per.setFont(f2);
		fl.setFont(f2);
		pg.setFont(f2);
		g.setFont(f2);
		percen.setFont(f2);
		cumm.setFont(f2);
		btn_DOne.setFont(f1);
		lbl_haemogram_M.setFont(f2);
		lbl_haemogram_F.setFont(f2);
		lbl_RBC_Count_F.setFont(f2);
		lbl_RBC_Count_M.setFont(f2);
		lbl_RBC_Count_F.setFont(f2);
		lbl_hct_M.setFont(f2);
		lbl_hct_F.setFont(f2);
		lbl_mcv.setFont(f2);
		lbl_mch.setFont(f2);
		lbl_mchc.setFont(f2);
		lbl_rdw.setFont(f2);
		lbl_wbc.setFont(f2);
		lbl_he.setFont(f2);
		
		haemogram.setBounds(350,20,400,50);
		lbl_he.setBounds(680,70,100,30);
		
		Haemoglobin.setBounds(100,100,300,50);
		txt_Haemoglobin.setBounds(450,100,100,50);
		gm.setBounds(550,120,50,30);
		lbl_haemogram_M.setBounds(680,110,130,25);
		lbl_haemogram_F.setBounds(680,135,130,25);
		
		RBC_Count.setBounds(100,170,300,50);
		txt_RBC_Count.setBounds(450,170,100,50);
		millons.setBounds(550,190,110,30);
		lbl_RBC_Count_M.setBounds(680,180,200,25);
		lbl_RBC_Count_F.setBounds(680,205,200,25);
		
		hct.setBounds(100,240,300,50);
		txt_hct.setBounds(450,240,100,50);
		per.setBounds(550,260,50,30);
		lbl_hct_M.setBounds(680,250,100,25);
		lbl_hct_F.setBounds(680,275,100,25);
		
		mcv.setBounds(100,310,300,50);
		txt_mcv.setBounds(450,310,100,50);
		fl.setBounds(550,330,50,30);
		lbl_mcv.setBounds(680,320,100,25);
		
		mch.setBounds(100,380,300,50);
		txt_mch.setBounds(450,380,100,50);
		pg.setBounds(550,400,50,30);
		lbl_mch.setBounds(680,390,100,25);
		
		mchc.setBounds(100,450,300,50);
		txt_mchc.setBounds(450,450,100,50);
		g.setBounds(550,470,50,30);
		lbl_mchc.setBounds(680,460,100,25);
		
		rdw.setBounds(100,520,300,50);
		txt_rdw.setBounds(450,520,100,50);
		percen.setBounds(550,530,50,30);
		lbl_rdw.setBounds(680,530,100,25);
		
		total_wbc.setBounds(100,590,300,50);
		txt_total_wbc.setBounds(450,590,100,50);
		cumm.setBounds(550,610,50,30);
		lbl_wbc.setBounds(680,600,150,25);
		
		btn_DOne.setBounds(300,700,300,50);
		
		btn_DOne.addActionListener(fm13);
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
		Haemogram fm13 = new Haemogram();
	}
}