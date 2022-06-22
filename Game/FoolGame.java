import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;

import java.awt.*;
import javax.swing.*;
import java.awt.print.*;
 

class MyFoolFrame extends JFrame
{
	static JPanel p;
	static JButton b1, b2, b3;
	static JLabel ques_l, res_l;
	Container c;
	MyFoolFrame()
	{
		c=this.getContentPane();

		p=new JPanel();
		p.setLayout(null);

		Font f=new Font("Candara",Font.PLAIN,20);

		ques_l=new JLabel("Are you a fool?");
		b1=new JButton("YES");
		b2=new JButton("NO");
		res_l=new JLabel("");

		ques_l.setBounds(400,100,500,50);
		b1.setBounds(325,200,80,40);
		b2.setBounds(525,200,80,40);
		res_l.setBounds(400,300,500,50);

		b3=new JButton("Print");
		b3.setBounds(400,450,100,50);

		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				button_3_action(ae);
			}
		});
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				button_1_action(ae);
			}
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				button_2_action(ae);
			}
		});
		b1.addMouseListener(new MouseListener()
		{
			public void mouseEntered(MouseEvent me)
			{
				button_1_mouseEntry(me);
			}
			public void mouseExited(MouseEvent me)
			{
			}
			public void mousePressed(MouseEvent me)
			{
			}
			public void mouseClicked(MouseEvent me)
			{
			}
			public void mouseReleased(MouseEvent me)
			{
			}
			
		});

		b2.addMouseListener(new MouseListener()
		{
			public void mouseEntered(MouseEvent me)
			{
				button_2_mouseEntry(me);
			}
			public void mouseExited(MouseEvent me)
			{
			}
			public void mousePressed(MouseEvent me)
			{
			}
			public void mouseClicked(MouseEvent me)
			{
			}
			public void mouseReleased(MouseEvent me)
			{
			}
			
		});

		ques_l.setFont(f);
		b1.setFont(f);
		b2.setFont(f);
		res_l.setFont(f);
		
		c.add(p);
		p.add(ques_l);
		p.add(b1);
		p.add(b2);
		p.add(res_l);
		p.add(b3);
	}

	static void button_1_action(ActionEvent ae)
	{
		if(b1.getText()=="YES")
			res_l.setText("I knew it! LOL!");
		else if(b1.getText()=="NO")
			res_l.setText("You are a genius!");
	}

	static void button_2_action(ActionEvent ae)
	{
		if(b2.getText()=="YES")
			res_l.setText("I knew it! LOL!");
		else if(b2.getText()=="NO")
			res_l.setText("You are a genius!");
	}

	static void button_1_mouseEntry(MouseEvent me)
	{
		if(b1.getText()=="NO")
		{
			b1.setText("YES");
			b2.setText("NO");
		}
	}

	static void button_2_mouseEntry(MouseEvent me)
	{
		if(b2.getText()=="NO")
		{
			b2.setText("YES");
			b1.setText("NO");
		}
	}

	static void button_3_action(ActionEvent ae)
	{
		PrintUtilities.printComponent(p);
	}
}
class PrintUtilities implements Printable {
 private Component componentToBePrinted;
 
 public static void printComponent(Component c) {
   new PrintUtilities(c).print();
 }
  
 public PrintUtilities(Component componentToBePrinted) {
   this.componentToBePrinted = componentToBePrinted;
 }
  
 public void print() {
   PrinterJob printJob = PrinterJob.getPrinterJob();
   printJob.setPrintable(this);
   if (printJob.printDialog())
     try {
       printJob.print();
     } catch(PrinterException pe) {
       System.out.println("Error printing: " + pe);
     }
 }
 
 public int print(Graphics g, PageFormat pageFormat, int pageIndex) {
   if (pageIndex > 0) {
     return(NO_SUCH_PAGE);
   } else {
     Graphics2D g2d = (Graphics2D)g;
     g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
     disableDoubleBuffering(componentToBePrinted);
     componentToBePrinted.paint(g2d);
     enableDoubleBuffering(componentToBePrinted);
     return(PAGE_EXISTS);
   }
 }
 
 public static void disableDoubleBuffering(Component c) {
   RepaintManager currentManager = RepaintManager.currentManager(c);
   currentManager.setDoubleBufferingEnabled(false);
 }
 
 public static void enableDoubleBuffering(Component c) {
   RepaintManager currentManager = RepaintManager.currentManager(c);
   currentManager.setDoubleBufferingEnabled(true);
 }
}
class FoolGame
{
	public static void main(String[] args)
	{
		MyFoolFrame fr=new MyFoolFrame();
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setBounds(0,0,1000,700);
	}
}