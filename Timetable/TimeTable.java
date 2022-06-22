import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TimeTableFrame extends JFrame
{
	Container c;
	JPanel pan, button_pan;
	JRadioButton theory_rb, practical_rb;
	JComboBox day_cb;
	JButton java_b, stld_b, se_b, sp_b, ds_b, ee_b, ai_b;
	JTextArea view_ta;
	JLabel head_l;
	TimeTableFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);
		
		Font f=new Font("Candara",Font.PLAIN,20);
		Color pan_col=new Color(206,224,255);
		Color button_pan_col=new Color(170,202,255);
		Color ta_col=new Color(6,100,255);
		String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

		pan=new JPanel();	
		button_pan=new JPanel();
		head_l=new JLabel("TIME TABLE");
		theory_rb=new JRadioButton("Theory");
		practical_rb=new JRadioButton("Practical");
		day_cb=new JComboBox(days);
		java_b=new JButton("JAVA");
		stld_b=new JButton("STLD");
		se_b=new JButton("SE");
		sp_b=new JButton("SP");
		ds_b=new JButton("DS");
		ee_b=new JButton("EE");
		ai_b=new JButton("AI");
		view_ta=new JTextArea();

		pan.setBounds(0,0,1100,700);
		button_pan.setBounds(600,100,350,325);
		head_l.setBounds(500,50,300,30);
		theory_rb.setBounds(150,200,100,25);
		practical_rb.setBounds(150,225,100,25);
		day_cb.setBounds(150,350,150,30);
		java_b.setBounds(50,25,100,50);
		stld_b.setBounds(200,25,100,50);
		se_b.setBounds(50,100,100,50);
		sp_b.setBounds(200,100,100,50);
		ds_b.setBounds(50,175,100,50);
		ee_b.setBounds(200,175,100,50);
		ai_b.setBounds(125,250,100,50);
		view_ta.setBounds(100,450,900,200);

		ButtonGroup type=new ButtonGroup();
		type.add(theory_rb);
		type.add(practical_rb);

		java_b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				javaAction(ae);
			}
		});
		stld_b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				stldAction(ae);
			}
		});
		se_b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				seAction(ae);
			}
		});
		sp_b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				spAction(ae);
			}
		});
		ds_b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				dsAction(ae);
			}
		});
		ee_b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				eeAction(ae);
			}
		});
		ai_b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				aiAction(ae);
			}
		});

		pan.setLayout(null);
		button_pan.setLayout(null);

		pan.setBackground(pan_col);
		theory_rb.setBackground(pan_col);
		practical_rb.setBackground(pan_col);
		button_pan.setBackground(button_pan_col);
		view_ta.setBackground(ta_col);
		view_ta.setForeground(Color.WHITE);

		head_l.setFont(f);
		theory_rb.setFont(f);
		practical_rb.setFont(f);
		day_cb.setFont(f);
		java_b.setFont(f);
		stld_b.setFont(f);
		se_b.setFont(f);
		sp_b.setFont(f);
		ds_b.setFont(f);
		ee_b.setFont(f);
		ai_b.setFont(f);
		view_ta.setFont(f);

		c.add(pan);

		pan.add(head_l);
		pan.add(theory_rb);
		pan.add(practical_rb);
		pan.add(day_cb);
		pan.add(button_pan);
		button_pan.add(java_b);
		button_pan.add(stld_b);
		button_pan.add(se_b);
		button_pan.add(sp_b);
		button_pan.add(ds_b);
		button_pan.add(ee_b);
		button_pan.add(ai_b);
		pan.add(view_ta);
	}

	void javaAction(ActionEvent ae)
	{
		if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Monday")
			view_ta.setText("No classes");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Tuesday")
			view_ta.setText("2:50 PM-3:40 PM");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Wednesday")
			view_ta.setText("2:00 PM-2:50 PM");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Thursday")
			view_ta.setText("3:40 PM-4:30 PM");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Friday")
			view_ta.setText("No classes");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Saturday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Monday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Tuesday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Wednesday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Thursday")
			view_ta.setText("8:00 AM-10:30 AM");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Friday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Saturday")
			view_ta.setText("No classes");
		else 
			view_ta.setText("Please select day and type");
	}

	void stldAction(ActionEvent ae)
	{
		if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Monday")
			view_ta.setText("2:50 PM-3:40 PM");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Tuesday")
			view_ta.setText("No classes");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Wednesday")
			view_ta.setText("2:00 PM-2:50 PM");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Thursday")
			view_ta.setText("No classes");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Friday")
			view_ta.setText("3:40 PM-4:30 PM");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Saturday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Monday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Tuesday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Wednesday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Thursday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Friday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Saturday")
			view_ta.setText("8:00 AM-10:30 AM");
		else 
			view_ta.setText("Please select day and type");
	}

	void seAction(ActionEvent ae)
	{
		if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Monday")
			view_ta.setText("No classes");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Tuesday")
			view_ta.setText("2:00 PM-2:50 PM");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Wednesday")
			view_ta.setText("No classes");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Thursday")
			view_ta.setText("11:20 AM-12:10 PM");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Friday")
			view_ta.setText("No classes");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Saturday")
			view_ta.setText("10:30 AM-11:20 AM");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Monday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Tuesday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Wednesday")
			view_ta.setText("8:00 AM-10:30 AM");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Thursday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Friday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Saturday")
			view_ta.setText("No classes");
		else 
			view_ta.setText("Please select day and type");
	}

	void spAction(ActionEvent ae)
	{
		if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Monday")
			view_ta.setText("2:00 PM-2:50 PM");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Tuesday")
			view_ta.setText("3:40 PM-4:30 PM");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Wednesday")
			view_ta.setText("No classes");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Thursday")
			view_ta.setText("No classes");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Friday")
			view_ta.setText("2:50 PM-3:40 PM");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Saturday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Monday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Tuesday")
			view_ta.setText("9:40 AM-12:10 PM");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Wednesday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Thursday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Friday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Saturday")
			view_ta.setText("No classes");
		else 
			view_ta.setText("Please select day and type");
	}

	void dsAction(ActionEvent ae)
	{
		if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Monday")
			view_ta.setText("No classes");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Tuesday")
			view_ta.setText("No classes");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Wednesday")
			view_ta.setText("No classes");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Thursday")
			view_ta.setText("10:30 AM-11:20 AM");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Friday")
			view_ta.setText("9:40 AM-10:30 AM");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Saturday")
			view_ta.setText("11:20 AM-12:10 PM");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Monday")
			view_ta.setText("This is a theory subject");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Tuesday")
			view_ta.setText("This is a theory subject");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Wednesday")
			view_ta.setText("This is a theory subject");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Thursday")
			view_ta.setText("This is a theory subject");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Friday")
			view_ta.setText("This is a theory subject");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Saturday")
			view_ta.setText("This is a theory subject");
		else 
			view_ta.setText("Please select day and type");
	}

	void eeAction(ActionEvent ae)
	{
		if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Monday")
			view_ta.setText("3:40 PM-4:30 PM");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Tuesday")
			view_ta.setText("No classes");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Wednesday")
			view_ta.setText("3:40 PM-4:30 PM");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Thursday")
			view_ta.setText("No classes");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Friday")
			view_ta.setText("2:00 PM-2:50 PM");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Saturday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Monday")
			view_ta.setText("This is a theory subject");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Tuesday")
			view_ta.setText("This is a theory subject");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Wednesday")
			view_ta.setText("This is a theory subject");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Thursday")
			view_ta.setText("This is a theory subject");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Friday")
			view_ta.setText("This is a theory subject");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Saturday")
			view_ta.setText("This is a theory subject");
		else 
			view_ta.setText("Please select day and type");
	}

	void aiAction(ActionEvent ae)
	{
		if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Monday")
			view_ta.setText("9:40 AM-10:30 AM");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Tuesday")
			view_ta.setText("No classes");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Wednesday")
			view_ta.setText("11:20 AM-12:10 PM");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Thursday")
			view_ta.setText("No classes");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Friday")
			view_ta.setText("11:20 AM-12:10 PM");
		else if(theory_rb.isSelected()==true&&day_cb.getSelectedItem()=="Saturday")
			view_ta.setText("No classes");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Monday")
			view_ta.setText("This is a theory subject");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Tuesday")
			view_ta.setText("This is a theory subject");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Wednesday")
			view_ta.setText("This is a theory subject");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Thursday")
			view_ta.setText("This is a theory subject");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Friday")
			view_ta.setText("This is a theory subject");
		else if(practical_rb.isSelected()==true&&day_cb.getSelectedItem()=="Saturday")
			view_ta.setText("This is a theory subject");
		else 
			view_ta.setText("Please select day and type");
	}
}

class TimeTable
{
	public static void main(String[] args)
	{
		TimeTableFrame ttf=new TimeTableFrame();
		ttf.setVisible(true);
		ttf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ttf.setBounds(0,0,1100,700);

		ImageIcon ii=new ImageIcon("Capture.PNG");
		ttf.setIconImage(ii.getImage());
	}
}