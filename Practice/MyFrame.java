import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame
{
	static JButton b1=new JButton("RED");
	static JButton b2=new JButton("BLUE");
	static JButton b3=new JButton("GREEN");
	static JButton b4=new JButton("YELLOW");
	static JButton b5=new JButton("BLACK");
	static JButton b6=new JButton("RESET");

	static Container c;
	public static void main(String[] args)
	{
		JFrame f=new JFrame("My Frame");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(0,0,750,500);

		Cursor csr=new Cursor(Cursor.HAND_CURSOR);

		c=f.getContentPane();
		c.setBackground(Color.WHITE);
		c.setLayout(null);

		b1.setBounds(50,50,75,30);
		b2.setBounds(150,50,75,30);
		b3.setBounds(250,50,75,30);
		b4.setBounds(350,50,100,30);
		b5.setBounds(475,50,75,30);
		b6.setBounds(575,50,75,30);

		b1.setCursor(csr);
		b2.setCursor(csr);
		b3.setCursor(csr);
		b4.setCursor(csr);
		b5.setCursor(csr);
		b6.setCursor(csr);

		MyFrameListener mfl=new MyFrameListener();
		b1.addActionListener(mfl);
		b2.addActionListener(mfl);
		b3.addActionListener(mfl);
		b4.addActionListener(mfl);
		b5.addActionListener(mfl);
		b6.addActionListener(mfl);	

		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		c.add(b6);
		
	}
}

class MyFrameListener implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==MyFrame.b1)
			MyFrame.c.setBackground(Color.RED);
		if(ae.getSource()==MyFrame.b2)
			MyFrame.c.setBackground(Color.BLUE);
		if(ae.getSource()==MyFrame.b3)
			MyFrame.c.setBackground(Color.GREEN);
		if(ae.getSource()==MyFrame.b4)
			MyFrame.c.setBackground(Color.YELLOW);
		if(ae.getSource()==MyFrame.b5)
			MyFrame.c.setBackground(Color.BLACK);
		if(ae.getSource()==MyFrame.b6)
			MyFrame.c.setBackground(Color.WHITE);
	}
}