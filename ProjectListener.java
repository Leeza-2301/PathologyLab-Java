import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.regex.*;

public class ProjectListener implements ActionListener
{
	
	Frame1 f1;
	Frame2 f2;
	Frame3 f3;
	Frame4 f4;
	ESR a;
	APTT b;
	PPBS c;
	GTT d;
	S_Cholesterol e;
	LIVER f;
    S_Uric_Acid g;
	CRP_Test h;
	Haemogram i;
	HIV j;

	ProjectListener(Frame1 fi)
	{
		this.f1 = fi;
	}
	
	ProjectListener(Frame2 fi)
	{
		this.f2 = fi;
	}
	
	ProjectListener(Frame3 fi)
	{
		this.f3 = fi;
	}
	
	ProjectListener(Frame4 fi)
	{
		this.f4 = fi;
	}
	
	ProjectListener(ESR fi)
	{
		this.a = fi;
	}
	
	ProjectListener(APTT fi)
	{
		this.b = fi;
	}
	
	ProjectListener(PPBS fi)
	{
		this.c = fi;
	}
	
	ProjectListener(GTT fi)
	{
		this.d = fi;
	}
	
	ProjectListener(S_Cholesterol fi)
	{
		this.e = fi;
	}
	
	ProjectListener(LIVER fi)
	{
		this.f = fi;
	}
	
	ProjectListener(S_Uric_Acid fi)
	{
		this.g = fi;
	}
	
	ProjectListener(CRP_Test fi)
	{
		this.h = fi;
	}
	
	ProjectListener(Haemogram fi)
	{
		this.i = fi;
	}
	
	ProjectListener(HIV fi)
	{
		this.j = fi;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("NEW RECORD"))
		{
			//f1.setVisible(false);
			//f2.setVisible(true);
			Frame2 myf2 = new Frame2();
			//this.f1.dispose();
		}
		
		if(e.getActionCommand().equals("ALL RECORDS"))
		{
			Frame3 myf3 = new Frame3();
			//this.f1.dispose();
		}
		String gender = (String) f2.txt_Gender.getSelectedItem();
		if(e.getActionCommand().equals("NEXT"))
		{
			
			Pattern p1 = Pattern.compile("^[0-9]{10}");
			Matcher m1 = p1.matcher(this.f2.txt_No.getText());
			System.out.println(m1.matches());
			
			int age = Integer.parseInt(this.f2.txt_Age.getText());
			Pattern p2 = Pattern.compile("^[0-9]+");
			Matcher m2 = p2.matcher(this.f2.txt_Age.getText());
			System.out.println(m2.matches());
			
			Pattern p3 = Pattern.compile("^[A-Za-z]+");
			Matcher m3 = p3.matcher(this.f2.txt_Name.getText());
			System.out.println(m3.matches());
			
			Pattern p4 = Pattern.compile("^[A-Za-z]+");
			Matcher m4 = p4.matcher(gender);
			System.out.println(m3.matches());
			
			Pattern p5 = Pattern.compile("^[0-9]{2}+[/]+[0-9]{2}+[/]+[0-9]{4}");
			Matcher m5 = p5.matcher(this.f2.txt_Date.getText());
			System.out.println(m5.matches());
			
			if(this.f2.txt_Name.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, " PLEASE ENTER NAME", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.f2.txt_Date.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, " PLEASE ENTER DATE", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.f2.txt_Age.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, " PLEASE ENTER AGE", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.f2.txt_No.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, " PLEASE ENTER NUMBER", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(gender.equals(""))
			{
				JOptionPane.showMessageDialog(null, " PLEASE ENTER GENDER", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			
			else if(this.f2.txt_Name.getText().equals("") || this.f2.txt_Date.getText().equals("") || this.f2.txt_Age.getText().equals("") || this.f2.txt_No.getText().equals("") || gender.equals(""))
			{
				JOptionPane.showMessageDialog(null, " PLEASE ENTER MISSING DETAILS", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			
			else if(m1.matches()==false)
			{
				JOptionPane.showMessageDialog(null, " PLEASE VALID NUMBER", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			
			else if(m2.matches()==false)
			{
				JOptionPane.showMessageDialog(null, " PLEASE VALID AGE", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(m3.matches()==false)
			{
				JOptionPane.showMessageDialog(null, " PLEASE VALID NAME", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(m4.matches()==false)
			{
				JOptionPane.showMessageDialog(null, " PLEASE VALID GENDER", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(m5.matches()==false)
			{
				JOptionPane.showMessageDialog(null, " PLEASE ENTER DATE IN VALID FORMAT  (12/02/2022)", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(age>=100)
			{
				JOptionPane.showMessageDialog(null, " PLEASE ENTER VALID AGE", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				try
				{
					System.out.println("i am from try block");
					BufferedWriter bw = new BufferedWriter(new FileWriter("report.txt",true));
					bw.write(this.f2.txt_Name.getText()+","+this.f2.txt_Date.getText()+","+this.f2.txt_Age.getText()+","+this.f2.txt_No.getText()+","+gender);
					bw.newLine();
					bw.close();
				}
				catch(Exception e1){}
				this.f2.dispose();
				Frame4 myf4 = new Frame4();
			}
			JOptionPane.showMessageDialog(null, "ESR Test Submitted Successfully!");
			
		}
		
		if(e.getActionCommand().equals("ESR"))
		{
			this.f4.dispose();
			ESR myf5 = new ESR();
			//System.out.println("abc");
		}
		
		if(e.getActionCommand().equals("APTT"))
		{
			this.f4.dispose();
			APTT myf6 = new APTT();
			//System.out.println("efgs");
		}
		
		if(e.getActionCommand().equals("P.P.B.S."))
		{
			this.f4.dispose();
			PPBS myf7 = new PPBS();
		}
		
		if(e.getActionCommand().equals("GTT"))
		{
			//this.f.dispose();
			GTT myf8 = new GTT();
		}
		if(e.getActionCommand().equals("Done"))
		{
			//System.out.println("gxxa");
			Pattern d1 = Pattern.compile("^[0-9]+");
			Matcher dm1 = d1.matcher(this.d.txt_fast.getText());
			System.out.println(dm1.matches());
			
			Pattern d2 = Pattern.compile("^[0-9]+");
			Matcher dm2 = d2.matcher(this.d.txt_one_hour.getText());
			System.out.println(dm2.matches());
			
			Pattern d3 = Pattern.compile("^[0-9]+");
			Matcher dm3 = d3.matcher(this.d.txt_two_hour.getText());
			System.out.println(dm3.matches());
			
			Pattern d4 = Pattern.compile("^[0-9]+");
			Matcher dm4 = d4.matcher(this.d.txt_three_hour.getText());
			System.out.println(dm4.matches());
			
			if(this.d.txt_fast.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, " Blood Sugar Fasting Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.d.txt_one_hour.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, " Blood Sugar  After 1 hr Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.d.txt_two_hour.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, " Blood Sugar  After 2 hr Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.d.txt_three_hour.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, " Blood Sugar  After 3 hr Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(dm1.matches()==false)
			{
				JOptionPane.showMessageDialog(null, " Blood Sugar Fasting Is INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else if(dm2.matches()==false)
			{
				JOptionPane.showMessageDialog(null, " BLOOD SUGAR AFTER 1 HR IS INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else if(dm3.matches()==false)
			{
				JOptionPane.showMessageDialog(null, " BLOOD SUGAR AFTER  2 HR IS INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else if(dm4.matches()==false)
			{
				JOptionPane.showMessageDialog(null, " BLOOD SUGAR AFTER  3 HR IS INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				try
				{
					System.out.println("i am from try block");
					BufferedWriter bw = new BufferedWriter(new FileWriter("GTT.txt",true));
					bw.write(this.d.txt_fast.getText()+","+this.d.txt_one_hour.getText()+","+this.d.txt_two_hour.getText()+","+this.d.txt_three_hour.getText());
					bw.newLine();
					bw.close();
				}
				catch(Exception e1){}
				this.d.dispose();
				Frame1 myf1 = new Frame1();
			}
		}
		if(e.getActionCommand().equals("S. Cholesterol"))
		{
			this.f4.dispose();
			S_Cholesterol myf9 = new S_Cholesterol();
		}
		
		if(e.getActionCommand().equals("Liver Function Test"))
		{
			//this.f.dispose();
			LIVER myf10 = new LIVER();
		}
		if(e.getActionCommand().equals("SAVE"))
		{
			Pattern fn1 = Pattern.compile("^[0-9]{1}+[.]{1}+[0-9]{2}");
			Matcher fmn1 = fn1.matcher(this.f.txt_btotal.getText());
			System.out.println(fmn1.matches());
			
			Pattern fn2 = Pattern.compile("^[0-9]{1}+[.]{1}+[0-9]{2}");
			Matcher fmn2 = fn2.matcher(this.f.txt_direct.getText());
			System.out.println(fmn2.matches());
			
			Pattern fn3 = Pattern.compile("^[0-9]{1}+[.]{1}+[0-9]{2}");
			Matcher fmn3 = fn3.matcher(this.f.txt_indirect.getText());
			System.out.println(fmn3.matches());
			
			Pattern fn4 = Pattern.compile("^[0-9]");
			Matcher fmn4 = fn4.matcher(this.f.txt_alkaline.getText());
			System.out.println(fmn4.matches());
			
			Pattern fn5 = Pattern.compile("^[0-9]");
			Matcher fmn5 = fn5.matcher(this.f.txt_sgpt.getText());
			System.out.println(fmn5.matches());
			
			Pattern fn6 = Pattern.compile("^[0-9]");
			Matcher fmn6 = fn6.matcher(this.f.txt_sgot.getText());
			System.out.println(fmn6.matches());
			
			Pattern fn7 = Pattern.compile("^[0-9]{1}+[.]{1}+[0-9]");
			Matcher fmn7 = fn7.matcher(this.f.txt_stotal.getText());
			System.out.println(fmn7.matches());
			
			Pattern fn8 = Pattern.compile("^[0-9]{1}+[.]{1}+[0-9]");
			Matcher fmn8 = fn8.matcher(this.f.txt_salbumin.getText());
			System.out.println(fmn8.matches());
			
			Pattern fn9 = Pattern.compile("^[0-9]{1}+[.]{1}+[0-9]");
			Matcher fmn9 = fn9.matcher(this.f.txt_sglobulins.getText());
			System.out.println(fmn9.matches());
			
			Pattern fn10 = Pattern.compile("^[0-9]{1}+[.]{1}+[0-9]");
			Matcher fmn10 = fn10.matcher(this.f.txt_a_ratio.getText());
			System.out.println(fmn10.matches());
			
			if(this.f.txt_btotal.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Billirubin Total Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.f.txt_direct.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Billirubin Direct Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.f.txt_indirect.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Billirubin Indirect Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.f.txt_alkaline.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "S. Alkaline Pho. Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.f.txt_sgpt.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "S.G.P.T.(ALT) Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.f.txt_sgot.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "S.G.O.T.(AST) Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.f.txt_stotal.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Serum Proteins Total Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.f.txt_salbumin.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Albumin Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.f.txt_sglobulins.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Globulins Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.f.txt_a_ratio.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "A/G Ratio Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(fmn1.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "Billirubin Total Is INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else if(fmn2.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "Billirubin Direct IS INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else if(fmn3.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "Billirubin Indirect IS INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else if(fmn4.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "S. Alkaline Pho. IS INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else if(fmn5.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "S.G.P.T.(ALT) Is INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else if(fmn6.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "S.G.O.T.(AST) IS INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else if(fmn7.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "Serum Proteins Total IS INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else if(fmn8.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "Albumin IS INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else if(fmn9.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "Globulins IS INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else if(fmn10.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "A/G Ratio IS INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				try
				{
					System.out.println("i am from try block");
					BufferedWriter bw = new BufferedWriter(new FileWriter("LIVER.txt",true));
					bw.write(this.f.txt_btotal.getText()+","+this.f.txt_direct.getText()+","+this.f.txt_indirect.getText()+","+this.f.txt_alkaline.getText()+","+this.f.txt_sgpt.getText()+","+this.f.txt_sgot.getText()+","+this.f.txt_stotal.getText()+","+this.f.txt_salbumin.getText()+","+this.f.txt_sglobulins.getText()+","+this.f.txt_a_ratio.getText());
					bw.newLine();
					bw.close();
				}
				catch(Exception e1){}
				//Frame1 myf1 = new Frame1();
				/*f1.setVisible(true);
				f.setVisible(false);*/
				this.f.dispose();
				Frame1 fl1 = new Frame1();
			}
			
		}
		if(e.getActionCommand().equals("S. Uric Acid"))
		{
			this.f4.dispose();
			S_Uric_Acid myf11 = new S_Uric_Acid();
		}
		
		if(e.getActionCommand().equals("CRP Test"))
		{
			this.f4.dispose();
			CRP_Test myf12 = new CRP_Test();
		}
		
		if(e.getActionCommand().equals("HAEMOGRAM"))
		{
			//this.f.dispose();
			Haemogram myf13 = new Haemogram();
		}
		
		if(e.getActionCommand().equals("DONE"))
		{
			Pattern h1 = Pattern.compile("^[0-9]+[.]{1}+[0-9]");
			Matcher hm1 = h1.matcher(this.i.txt_Haemoglobin.getText());
			System.out.println(hm1.matches());
			
			Pattern h2 = Pattern.compile("^[0-9]+[.]{1}+[0-9]");
			Matcher hm2 = h2.matcher(this.i.txt_RBC_Count.getText());
			System.out.println(hm2.matches());
			
			Pattern h3 = Pattern.compile("^[0-9]+[.]{1}+[0-9]");
			Matcher hm3 = h3.matcher(this.i.txt_hct.getText());
			System.out.println(hm3.matches());
			
			Pattern h4 = Pattern.compile("^[0-9]+[.]{1}+[0-9]");
			Matcher hm4 = h4.matcher(this.i.txt_mcv.getText());
			System.out.println(hm4.matches());
			
			Pattern h5 = Pattern.compile("^[0-9]+[.]{1}+[0-9]");
			Matcher hm5 = h5.matcher(this.i.txt_mch.getText());
			System.out.println(hm5.matches());
			
			Pattern h6 = Pattern.compile("^[0-9]+[.]{1}+[0-9]");
			Matcher hm6 = h6.matcher(this.i.txt_mchc.getText());
			System.out.println(hm6.matches());
			
			Pattern h7 = Pattern.compile("^[0-9]+[.]{1}+[0-9]");
			Matcher hm7 = h7.matcher(this.i.txt_rdw.getText());
			System.out.println(hm7.matches());
			
			Pattern h8 = Pattern.compile("^[0-9]+[0-9]+[0-9]+[0-9]+[0-9]");
			Matcher hm8 = h8.matcher(this.i.txt_total_wbc.getText());
			System.out.println(hm8.matches());
			
			if(this.i.txt_Haemoglobin.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Haemoglobin Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.i.txt_RBC_Count.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "RBC Count Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.i.txt_hct.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "HCT Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.i.txt_mcv.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "MCV Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.i.txt_mch.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "MCH Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.i.txt_mchc.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "MCHC Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.i.txt_rdw.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "RDW Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.i.txt_total_wbc.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "WBC Count Is Missing", " EMPTY FIELD ", JOptionPane.ERROR_MESSAGE);
			}
			else if(hm1.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "Haemoglobin Is INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else if(hm2.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "RBC Count IS INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else if(hm3.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "HCT IS INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else if(hm4.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "MCV IS INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else if(hm5.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "MCH Is INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else if(hm6.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "MCHC IS INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else if(hm7.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "RDW IS INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else if(hm8.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "WBC Count IS INVALID  ", " INVALID ", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				try
				{
					System.out.println("i am from try block");
					BufferedWriter bw = new BufferedWriter(new FileWriter("HAEMOGRAM.txt",true));
					bw.write(this.i.txt_Haemoglobin.getText()+","+this.i.txt_RBC_Count.getText()+","+this.i.txt_hct.getText()+","+this.i.txt_mcv.getText()+","+this.i.txt_mch.getText()+","+this.i.txt_mchc.getText()+","+this.i.txt_rdw.getText()+","+this.i.txt_total_wbc.getText());
					bw.newLine();
					bw.close();
				}
				catch(Exception e1){}
				this.i.dispose();
				Frame1 myf1 = new Frame1();
			}
			
		}
		
		if(e.getActionCommand().equals("HIV"))
		{
			this.f4.dispose();
			HIV myf14 = new HIV();
		}
		
		
	}
}