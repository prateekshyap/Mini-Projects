import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyCalFrame extends JFrame implements ActionListener
{
	Container c;
	static JLabel num1_l, num2_l, res_l, warn_l;
	static JTextField num1_tf, num2_tf, res_tf;
	static JButton add, sub, mul, div, reset;
	static JPanel panel;
	float n1, n2;
	MyCalFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);

		Font f=new Font("Candara",Font.PLAIN,20);
		Color col=new Color(226,226,226);

		panel=new JPanel();
		num1_l=new JLabel("Enter first number");
		num2_l=new JLabel("Enter second number");
		res_l=new JLabel("Result");
		num1_tf=new JTextField();
		num2_tf=new JTextField();
		res_tf=new JTextField();
		add=new JButton("ADD");
		sub=new JButton("SUBTRACT");
		mul=new JButton("MULTIPLY");
		div=new JButton("DIVIDE");
		reset=new JButton("RESET");
		warn_l=new JLabel("Enter two numbers");

		panel.setLayout(null);

		panel.setBounds(0,0,1000,700);
		num1_l.setBounds(50,50,200,30);
		num2_l.setBounds(50,100,200,30);
		res_l.setBounds(50,150,200,30);
		num1_tf.setBounds(300,50,200,30);
		num2_tf.setBounds(300,100,200,30);
		res_tf.setBounds(300,150,200,30);
		add.setBounds(600,50,200,30);
		sub.setBounds(600,100,200,30);
		mul.setBounds(600,150,200,30);
		div.setBounds(600,200,200,30);
		reset.setBounds(600,250,200,30);
		warn_l.setBounds(50,250,500,30);

		panel.setBackground(col);
		num1_l.setFont(f);
		num2_l.setFont(f);
		res_l.setFont(f);
		num1_tf.setFont(f);
		num2_tf.setFont(f);
		res_tf.setFont(f);
		add.setFont(f);
		sub.setFont(f);
		mul.setFont(f);
		div.setFont(f);
		reset.setFont(f);
		warn_l.setFont(f);

		c.add(panel);

		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		reset.addActionListener(this);

		panel.add(num1_l);
		panel.add(num2_l);
		panel.add(res_l);
		panel.add(num1_tf);
		panel.add(num2_tf);
		panel.add(res_tf);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(reset);
		panel.add(warn_l);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==add)
		{
			try
			{
				n1=Float.parseFloat(num1_tf.getText());
				n2=Float.parseFloat(num2_tf.getText());
			}
			catch(Exception ee)
			{
				warn_l.setText("Please Enter valid numbers");
				res_tf.setText("");
			}
			float res=n1+n2;
			String result=Float.toString(res);
			res_tf.setText(result);
		}
		else if(ae.getSource()==sub)
		{
			try
			{
				n1=Float.parseFloat(num1_tf.getText());
				n2=Float.parseFloat(num2_tf.getText());
			}
			catch(Exception ee)
			{
				warn_l.setText("Please Enter valid numbers");
				res_tf.setText("");
			}
			float res=n1-n2;
			String result=Float.toString(res);
			res_tf.setText(result);
		}
		else if(ae.getSource()==mul)
		{
			try
			{
				n1=Float.parseFloat(num1_tf.getText());
				n2=Float.parseFloat(num2_tf.getText());
			}
			catch(Exception ee)
			{
				warn_l.setText("Please Enter valid numbers");
				res_tf.setText("");
			}
			float res=n1*n2;
			String result=Float.toString(res);
			res_tf.setText(result);
		}
		else if(ae.getSource()==div)
		{
			try
			{
				n1=Float.parseFloat(num1_tf.getText());
				n2=Float.parseFloat(num2_tf.getText());
			}
			catch(Exception ee)
			{
				warn_l.setText("Please Enter valid numbers");
				res_tf.setText("");
			}
			float res=n1/n2;
			String result=Float.toString(res);
			res_tf.setText(result);
		}
		else if(ae.getSource()==reset)
		{
			num1_tf.setText("");
			num2_tf.setText("");
			res_tf.setText("");
			warn_l.setText("Enter two numbers");
		}
	}
}

class Calculator
{
	public static void main(String[] args)
	{
		MyCalFrame fr=new MyCalFrame();
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setBounds(0,0,1000,700);
	}
}