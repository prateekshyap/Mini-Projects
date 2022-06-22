import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class KeyBoardFrame extends JFrame implements ActionListener
{
	Container con;
	BorderLayout bl;
	JPanel alpha_pan, num_pan, ta_pan;
	JTextArea ta;
	JButton neg,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,sub,eq,tab,q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,bs,z,x,c,v,b,n,m,sc,ic,fs,osb,csb,dot,com,sb,enter,n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,bksp,clr;
	JToggleButton shift,caps,numl;
	Font fo,buf1,buf2,buf3,buf4,buf5,buf6;
	KeyBoardFrame()
	{
		con=this.getContentPane();
		con.setLayout(null);

		Color col=new Color(198,198,255);
		fo=new Font("Candara",Font.PLAIN,20);
		buf1=new Font("Candara",Font.PLAIN,15);
		buf2=new Font("Candara",Font.PLAIN,18);
		buf3=new Font("Candara",Font.PLAIN,14);
		buf4=new Font("Candara",Font.PLAIN,13);
		buf5=new Font("Candara",Font.PLAIN,12);
		buf6=new Font("Candara",Font.PLAIN,11);
		Cursor csr=new Cursor(Cursor.HAND_CURSOR);
		Cursor cur=new Cursor(Cursor.WAIT_CURSOR);

		alpha_pan=new JPanel();
		num_pan=new JPanel();
		ta_pan=new JPanel();
		bl=new BorderLayout();
		ta=new JTextArea();
		neg=new JButton("`");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		sub=new JButton("-");
		eq=new JButton("=");
		tab=new JButton("Tab");
		q=new JButton("q");
		w=new JButton("w");
		e=new JButton("e");
		r=new JButton("r");
		t=new JButton("t");
		y=new JButton("y");
		u=new JButton("u");
		i=new JButton("i");
		o=new JButton("o");
		p=new JButton("p");
		caps=new JToggleButton("Caps Lock");
		a=new JButton("a");
		s=new JButton("s");
		d=new JButton("d");
		f=new JButton("f");
		g=new JButton("g");
		h=new JButton("h");
		j=new JButton("j");
		k=new JButton("k");
		l=new JButton("l");
		bs=new JButton("\\");
		shift=new JToggleButton("Shift");
		z=new JButton("z");
		x=new JButton("x");
		c=new JButton("c");
		v=new JButton("v");
		b=new JButton("b");
		n=new JButton("n");
		m=new JButton("m");
		sc=new JButton(";");
		ic=new JButton("'");
		fs=new JButton("/");
		osb=new JButton("[");
		csb=new JButton("]");
		dot=new JButton(".");
		com=new JButton(",");
		sb=new JButton("");
		enter=new JButton("Enter");
		bksp=new JButton("Backspace");
		n1=new JButton("1");
		n2=new JButton("2");
		n3=new JButton("3");
		n4=new JButton("4");
		n5=new JButton("5");
		n6=new JButton("6");
		n7=new JButton("7");
		n8=new JButton("8");
		n9=new JButton("9");
		n0=new JButton("0");
		numl=new JToggleButton("Num Lock");
		clr=new JButton("Clear");

		alpha_pan.setLayout(null);
		num_pan.setLayout(null);
		ta_pan.setLayout(bl);

		alpha_pan.setBounds(50,350,665,240);
		num_pan.setBounds(715,350,230,240);
		ta_pan.setBounds(50,50,895,250);
		neg.setBounds(10,10,45,40);
		b1.setBounds(60,10,45,40);
		b2.setBounds(110,10,45,40);
		b3.setBounds(160,10,45,40);
		b4.setBounds(210,10,45,40);
		b5.setBounds(260,10,45,40);
		b6.setBounds(310,10,45,40);
		b7.setBounds(360,10,45,40);
		b8.setBounds(410,10,45,40);
		b9.setBounds(460,10,45,40);
		b0.setBounds(510,10,45,40);
		sub.setBounds(560,10,45,40);
		eq.setBounds(610,10,45,40);
		tab.setBounds(10,55,95,40);
		q.setBounds(110,55,45,40);
		w.setBounds(160,55,45,40);
		e.setBounds(210,55,45,40);
		r.setBounds(260,55,45,40);
		t.setBounds(310,55,45,40);
		y.setBounds(360,55,45,40);
		u.setBounds(410,55,45,40);
		i.setBounds(460,55,45,40);
		o.setBounds(510,55,45,40);
		p.setBounds(560,55,45,40);
		caps.setBounds(10,100,120,40);
		a.setBounds(135,100,45,40);
		s.setBounds(185,100,45,40);
		d.setBounds(235,100,45,40);
		f.setBounds(285,100,45,40);
		g.setBounds(335,100,45,40);
		h.setBounds(385,100,45,40);
		j.setBounds(435,100,45,40);
		k.setBounds(485,100,45,40);
		l.setBounds(535,100,45,40);
		bs.setBounds(585,100,45,40);
		shift.setBounds(10,145,120,40);
		z.setBounds(135,145,45,40);
		x.setBounds(185,145,45,40);
		c.setBounds(235,145,45,40);
		v.setBounds(285,145,45,40);
		b.setBounds(335,145,45,40);
		n.setBounds(385,145,45,40);
		m.setBounds(435,145,45,40);
		sc.setBounds(485,145,45,40);
		ic.setBounds(535,145,45,40);
		fs.setBounds(585,145,45,40);
		osb.setBounds(10,190,45,40);
		csb.setBounds(60,190,45,40);
		dot.setBounds(160,190,45,40);
		com.setBounds(110,190,45,40);
		sb.setBounds(210,190,345,40);
		enter.setBounds(560,190,95,40);
		bksp.setBounds(0,10,145,40);
		n1.setBounds(0,145,45,40);
		n2.setBounds(50,145,45,40);
		n3.setBounds(100,145,45,40);
		n4.setBounds(0,100,45,40);
		n5.setBounds(50,100,45,40);
		n6.setBounds(100,100,45,40);
		n7.setBounds(0,55,45,40);
		n8.setBounds(50,55,45,40);
		n9.setBounds(100,55,45,40);
		n0.setBounds(0,190,45,40);
		numl.setBounds(50,190,95,40);
		clr.setBounds(150,10,70,220);

		alpha_pan.setBackground(col);
		num_pan.setBackground(col);
		ta_pan.setBackground(Color.GREEN);

		ta.setFont(fo);
		neg.setFont(fo);
		b1.setFont(fo);
		b2.setFont(fo);
		b3.setFont(fo);
		b4.setFont(fo);
		b5.setFont(fo);
		b6.setFont(fo);
		b7.setFont(fo);
		b8.setFont(fo);
		b9.setFont(fo);
		b0.setFont(fo);
		sub.setFont(fo);
		eq.setFont(fo);
		tab.setFont(fo);
		q.setFont(fo);
		w.setFont(buf1);
		e.setFont(fo);
		r.setFont(fo);
		t.setFont(fo);
		y.setFont(fo);
		u.setFont(fo);
		i.setFont(fo);
		o.setFont(fo);
		p.setFont(fo);
		caps.setFont(buf2);
		a.setFont(fo);
		s.setFont(fo);
		d.setFont(fo);
		f.setFont(fo);
		g.setFont(fo);
		h.setFont(fo);
		j.setFont(fo);
		k.setFont(fo);
		l.setFont(fo);
		bs.setFont(fo);
		shift.setFont(fo);
		z.setFont(fo);
		x.setFont(fo);
		c.setFont(fo);
		v.setFont(fo);
		b.setFont(fo);
		n.setFont(fo);
		m.setFont(buf3);
		sc.setFont(fo);
		ic.setFont(fo);
		fs.setFont(fo);
		osb.setFont(fo);
		csb.setFont(fo);
		dot.setFont(fo);
		com.setFont(fo);
		sb.setFont(fo);
		enter.setFont(fo);
		bksp.setFont(fo);
		n1.setFont(fo);
		n2.setFont(fo);
		n3.setFont(fo);
		n4.setFont(fo);
		n5.setFont(fo);
		n6.setFont(fo);
		n7.setFont(fo);
		n8.setFont(fo);
		n9.setFont(fo);
		n0.setFont(fo);
		numl.setFont(buf3);
		clr.setFont(buf1);

		ta.setCursor(cur);
		neg.setCursor(csr);
		b1.setCursor(csr);
		b2.setCursor(csr);
		b3.setCursor(csr);
		b4.setCursor(csr);
		b5.setCursor(csr);
		b6.setCursor(csr);
		b7.setCursor(csr);
		b8.setCursor(csr);
		b9.setCursor(csr);
		b0.setCursor(csr);
		sub.setCursor(csr);
		eq.setCursor(csr);
		tab.setCursor(csr);
		q.setCursor(csr);
		w.setCursor(csr);
		e.setCursor(csr);
		r.setCursor(csr);
		t.setCursor(csr);
		y.setCursor(csr);
		u.setCursor(csr);
		i.setCursor(csr);
		o.setCursor(csr);
		p.setCursor(csr);
		caps.setCursor(csr);
		a.setCursor(csr);
		s.setCursor(csr);
		d.setCursor(csr);
		f.setCursor(csr);
		g.setCursor(csr);
		h.setCursor(csr);
		j.setCursor(csr);
		k.setCursor(csr);
		l.setCursor(csr);
		bs.setCursor(csr);
		shift.setCursor(csr);
		z.setCursor(csr);
		x.setCursor(csr);
		c.setCursor(csr);
		v.setCursor(csr);
		b.setCursor(csr);
		n.setCursor(csr);
		m.setCursor(csr);
		sc.setCursor(csr);
		ic.setCursor(csr);
		fs.setCursor(csr);
		osb.setCursor(csr);
		csb.setCursor(csr);
		dot.setCursor(csr);
		com.setCursor(csr);
		sb.setCursor(csr);
		enter.setCursor(csr);
		bksp.setCursor(csr);
		n1.setCursor(csr);
		n2.setCursor(csr);
		n3.setCursor(csr);
		n4.setCursor(csr);
		n5.setCursor(csr);
		n6.setCursor(csr);
		n7.setCursor(csr);
		n8.setCursor(csr);
		n9.setCursor(csr);
		n0.setCursor(csr);
		numl.setCursor(csr);
		clr.setCursor(csr);

		shift.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				shift_action(ie);
			}
		});
		caps.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				caps_action(ie);
			}
		});
		neg.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		sub.addActionListener(this);
		eq.addActionListener(this);
		tab.addActionListener(this);
		q.addActionListener(this);
		w.addActionListener(this);
		e.addActionListener(this);
		r.addActionListener(this);
		t.addActionListener(this);
		y.addActionListener(this);
		u.addActionListener(this);
		i.addActionListener(this);
		o.addActionListener(this);
		p.addActionListener(this);
		a.addActionListener(this);
		s.addActionListener(this);
		d.addActionListener(this);
		f.addActionListener(this);
		g.addActionListener(this);
		h.addActionListener(this);
		j.addActionListener(this);
		k.addActionListener(this);
		l.addActionListener(this);
		bs.addActionListener(this);
		z.addActionListener(this);
		x.addActionListener(this);
		c.addActionListener(this);
		v.addActionListener(this);
		b.addActionListener(this);
		n.addActionListener(this);
		m.addActionListener(this);
		sc.addActionListener(this);
		ic.addActionListener(this);
		fs.addActionListener(this);
		osb.addActionListener(this);
		csb.addActionListener(this);
		dot.addActionListener(this);
		com.addActionListener(this);
		sb.addActionListener(this);
		enter.addActionListener(this);
		n1.addActionListener(this);
		n2.addActionListener(this);
		n3.addActionListener(this);
		n4.addActionListener(this);
		n5.addActionListener(this);
		n6.addActionListener(this);
		n7.addActionListener(this);
		n8.addActionListener(this);
		n9.addActionListener(this);
		n0.addActionListener(this);
		bksp.addActionListener(this);
		clr.addActionListener(this);
		ta.setEditable(false);

		con.add(alpha_pan);
		con.add(num_pan);
		con.add(ta_pan);

		ta_pan.add(ta);
		alpha_pan.add(neg);
		alpha_pan.add(b1);
		alpha_pan.add(b2);
		alpha_pan.add(b3);
		alpha_pan.add(b4);
		alpha_pan.add(b5);
		alpha_pan.add(b6);
		alpha_pan.add(b7);
		alpha_pan.add(b8);
		alpha_pan.add(b9);
		alpha_pan.add(b0);
		alpha_pan.add(sub);
		alpha_pan.add(eq);
		alpha_pan.add(tab);
		alpha_pan.add(q);
		alpha_pan.add(w);
		alpha_pan.add(e);
		alpha_pan.add(r);
		alpha_pan.add(t);
		alpha_pan.add(y);
		alpha_pan.add(u);
		alpha_pan.add(i);
		alpha_pan.add(o);
		alpha_pan.add(p);
		alpha_pan.add(caps);
		alpha_pan.add(a);
		alpha_pan.add(s);
		alpha_pan.add(d);
		alpha_pan.add(f);
		alpha_pan.add(g);
		alpha_pan.add(h);
		alpha_pan.add(j);
		alpha_pan.add(k);
		alpha_pan.add(l);
		alpha_pan.add(bs);
		alpha_pan.add(shift);
		alpha_pan.add(z);
		alpha_pan.add(x);
		alpha_pan.add(c);
		alpha_pan.add(v);
		alpha_pan.add(b);
		alpha_pan.add(n);
		alpha_pan.add(m);
		alpha_pan.add(sc);
		alpha_pan.add(ic);
		alpha_pan.add(fs);
		alpha_pan.add(osb);
		alpha_pan.add(csb);
		alpha_pan.add(dot);
		alpha_pan.add(com);
		alpha_pan.add(sb);
		alpha_pan.add(enter);
		num_pan.add(bksp);
		num_pan.add(n1);
		num_pan.add(n2);
		num_pan.add(n3);
		num_pan.add(n4);
		num_pan.add(n5);
		num_pan.add(n6);
		num_pan.add(n7);
		num_pan.add(n8);
		num_pan.add(n9);
		num_pan.add(n0);
		num_pan.add(numl);
		num_pan.add(clr);
	}

	void shift_action(ItemEvent ie)
	{
		if(shift.isSelected()==true)
		{
			if(caps.isSelected()==false)
			{
				neg.setText("~");
				b1.setText("!");
				b2.setText("@");
				b3.setText("#");
				b4.setText("$");
				b5.setText("%");
				b6.setText("^");
				b7.setText("&");
				b8.setText("*");
				b9.setText("(");
				b0.setText(")");
				sub.setText("_");
				eq.setText("+");
				q.setText("Q");
				w.setText("W");
				e.setText("E");
				r.setText("R");
				t.setText("T");
				y.setText("Y");
				u.setText("U");
				i.setText("I");
				o.setText("O");
				p.setText("P");
				a.setText("A");
				s.setText("S");
				d.setText("D");
				f.setText("F");
				g.setText("G");
				h.setText("H");
				j.setText("J");
				k.setText("K");
				l.setText("L");
				bs.setText("|");
				z.setText("Z");
				x.setText("X");
				c.setText("C");
				v.setText("V");
				b.setText("B");
				n.setText("N");
				m.setText("M");
				sc.setText(":");
				ic.setText("\"");
				fs.setText("?");
				osb.setText("{");
				csb.setText("}");
				dot.setText(">");
				com.setText("<");

				b2.setFont(buf6);
				b7.setFont(buf1);
				q.setFont(buf1);
				w.setFont(buf5);
				r.setFont(buf2);
				u.setFont(buf1);
				o.setFont(buf1);
				a.setFont(buf2);
				d.setFont(buf1);
				g.setFont(buf2);
				h.setFont(buf1);
				k.setFont(buf2);
				b.setFont(buf2);
				n.setFont(buf1);
				m.setFont(buf4);
			}
			else if(caps.isSelected()==true)
			{
				neg.setText("~");
				b1.setText("!");
				b2.setText("@");
				b3.setText("#");
				b4.setText("$");
				b5.setText("%");
				b6.setText("^");
				b7.setText("&");
				b8.setText("*");
				b9.setText("(");
				b0.setText(")");
				sub.setText("_");
				eq.setText("+");
				q.setText("q");
				w.setText("w");
				e.setText("e");
				r.setText("r");
				t.setText("t");
				y.setText("y");
				u.setText("u");
				i.setText("i");
				o.setText("o");
				p.setText("p");
				a.setText("a");
				s.setText("s");
				d.setText("d");
				f.setText("f");
				g.setText("g");
				h.setText("h");
				j.setText("j");
				k.setText("k");
				l.setText("l");
				bs.setText("|");
				z.setText("z");
				x.setText("x");
				c.setText("c");
				v.setText("v");
				b.setText("b");
				n.setText("n");
				m.setText("m");
				sc.setText(":");
				ic.setText("\"");
				fs.setText("?");
				osb.setText("{");
				csb.setText("}");
				dot.setText(">");
				com.setText("<");

				b2.setFont(buf6);
				b7.setFont(buf1);
				q.setFont(fo);
				w.setFont(buf1);
				r.setFont(fo);
				u.setFont(fo);
				o.setFont(fo);
				a.setFont(fo);
				d.setFont(fo);
				g.setFont(fo);
				h.setFont(fo);
				k.setFont(fo);
				b.setFont(fo);
				n.setFont(fo);
				m.setFont(buf3);
			}
		}
		else
		{
			if(caps.isSelected()==false)
			{
				neg.setText("`");
				b1.setText("1");
				b2.setText("2");
				b3.setText("3");
				b4.setText("4");
				b5.setText("5");
				b6.setText("6");
				b7.setText("7");
				b8.setText("8");
				b9.setText("9");
				b0.setText("0");
				sub.setText("-");
				eq.setText("=");
				q.setText("q");
				w.setText("w");
				e.setText("e");
				r.setText("r");
				t.setText("t");
				y.setText("y");
				u.setText("u");
				i.setText("i");
				o.setText("o");
				p.setText("p");
				a.setText("a");
				s.setText("s");
				d.setText("d");
				f.setText("f");
				g.setText("g");
				h.setText("h");
				j.setText("j");
				k.setText("k");
				l.setText("l");
				bs.setText("\\");
				z.setText("z");
				x.setText("x");
				c.setText("c");
				v.setText("v");
				b.setText("b");
				n.setText("n");
				m.setText("m");
				sc.setText(";");
				ic.setText("'");
				fs.setText("/");
				osb.setText("[");
				csb.setText("]");
				dot.setText(".");
				com.setText(",");

				b2.setFont(fo);
				b7.setFont(fo);
				q.setFont(fo);
				w.setFont(buf1);
				r.setFont(fo);
				u.setFont(fo);
				o.setFont(fo);
				a.setFont(fo);
				d.setFont(fo);
				g.setFont(fo);
				h.setFont(fo);
				k.setFont(fo);
				b.setFont(fo);
				n.setFont(fo);
				m.setFont(buf3);
			}
			else if(caps.isSelected()==true)
			{
				neg.setText("`");
				b1.setText("1");
				b2.setText("2");
				b3.setText("3");
				b4.setText("4");
				b5.setText("5");
				b6.setText("6");
				b7.setText("7");
				b8.setText("8");
				b9.setText("9");
				b0.setText("0");
				sub.setText("-");
				eq.setText("=");
				q.setText("Q");
				w.setText("W");
				e.setText("E");
				r.setText("R");
				t.setText("T");
				y.setText("Y");
				u.setText("U");
				i.setText("I");
				o.setText("O");
				p.setText("P");
				a.setText("A");
				s.setText("S");
				d.setText("D");
				f.setText("F");
				g.setText("G");
				h.setText("H");
				j.setText("J");
				k.setText("K");
				l.setText("L");
				bs.setText("\\");
				z.setText("Z");
				x.setText("X");
				c.setText("C");
				v.setText("V");
				b.setText("B");
				n.setText("N");
				m.setText("M");
				sc.setText(";");
				ic.setText("'");
				fs.setText("/");
				osb.setText("[");
				csb.setText("]");
				dot.setText(".");
				com.setText(",");

				b2.setFont(fo);
				b7.setFont(fo);
				q.setFont(buf1);
				w.setFont(buf5);
				r.setFont(buf2);
				u.setFont(buf1);
				o.setFont(buf1);
				a.setFont(buf2);
				d.setFont(buf1);
				g.setFont(buf2);
				h.setFont(buf1);
				k.setFont(buf2);
				b.setFont(buf2);
				n.setFont(buf1);
				m.setFont(buf4);
			}
		}
	}

	void caps_action(ItemEvent ie)
	{
		if(caps.isSelected()==true)
		{
			if(shift.isSelected()==true)
				shift.setSelected(false);
			q.setText("Q");
			w.setText("W");
			e.setText("E");
			r.setText("R");
			t.setText("T");
			y.setText("Y");
			u.setText("U");
			i.setText("I");
			o.setText("O");
			p.setText("P");
			a.setText("A");
			s.setText("S");
			d.setText("D");
			f.setText("F");
			g.setText("G");
			h.setText("H");
			j.setText("J");
			k.setText("K");
			l.setText("L");
			z.setText("Z");
			x.setText("X");
			c.setText("C");
			v.setText("V");
			b.setText("B");
			n.setText("N");
			m.setText("M");

			q.setFont(buf1);
			w.setFont(buf5);
			r.setFont(buf2);
			u.setFont(buf1);
			o.setFont(buf1);
			a.setFont(buf2);
			d.setFont(buf1);
			g.setFont(buf2);
			h.setFont(buf1);
			k.setFont(buf2);
			b.setFont(buf2);
			n.setFont(buf1);
			m.setFont(buf4);
		}
		else
		{
			q.setText("q");
			w.setText("w");
			e.setText("e");
			r.setText("r");
			t.setText("t");
			y.setText("y");
			u.setText("u");
			i.setText("i");
			o.setText("o");
			p.setText("p");
			a.setText("a");
			s.setText("s");
			d.setText("d");
			f.setText("f");
			g.setText("g");
			h.setText("h");
			j.setText("j");
			k.setText("k");
			l.setText("l");
			z.setText("z");
			x.setText("x");
			c.setText("c");
			v.setText("v");
			b.setText("b");
			n.setText("n");
			m.setText("m");

			q.setFont(fo);
			w.setFont(buf1);
			r.setFont(fo);
			u.setFont(fo);
			o.setFont(fo);
			a.setFont(fo);
			d.setFont(fo);
			g.setFont(fo);
			h.setFont(fo);
			k.setFont(fo);
			b.setFont(fo);
			n.setFont(fo);
			m.setFont(buf3);
		}
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==neg)
		{
			ta.append(neg.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==b1)
		{
			ta.append(b1.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==b2)
		{
			ta.append(b2.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==b3)
		{
			ta.append(b3.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==b4)
		{
			ta.append(b4.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==b5)
		{
			ta.append(b5.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==b6)
		{
			ta.append(b6.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==b7)
		{
			ta.append(b7.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==b8)
		{
			ta.append(b8.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==b9)
		{
			ta.append(b9.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==b0)
		{
			ta.append(b0.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==sub)
		{
			ta.append(sub.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==eq)
		{
			ta.append(eq.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==tab)
		{
			ta.append("\t");
			shift.setSelected(false);
		}
		else if(ae.getSource()==q)
		{
			ta.append(q.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==w)
		{
			ta.append(w.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==e)
		{
			ta.append(e.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==r)
		{
			ta.append(r.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==t)
		{
			ta.append(t.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==y)
		{
			ta.append(y.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==u)
		{
			ta.append(u.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==i)
		{
			ta.append(i.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==o)
		{
			ta.append(o.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==p)
		{
			ta.append(p.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==a)
		{
			ta.append(a.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==s)
		{
			ta.append(s.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==d)
		{
			ta.append(d.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==f)
		{
			ta.append(f.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==g)
		{
			ta.append(g.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==h)
		{
			ta.append(h.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==j)
		{
			ta.append(j.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==k)
		{
			ta.append(k.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==l)
		{
			ta.append(l.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==bs)
		{
			ta.append(bs.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==z)
		{
			ta.append(z.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==x)
		{
			ta.append(x.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==c)
		{
			ta.append(c.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==v)
		{
			ta.append(v.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==b)
		{
			ta.append(b.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==n)
		{
			ta.append(n.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==m)
		{
			ta.append(m.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==sc)
		{
			ta.append(sc.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==ic)
		{
			ta.append(ic.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==fs)
		{
			ta.append(fs.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==osb)
		{
			ta.append(osb.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==csb)
		{
			ta.append(csb.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==dot)
		{
			ta.append(dot.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==com)
		{
			ta.append(com.getText());
			shift.setSelected(false);
		}
		else if(ae.getSource()==sb)
		{
			ta.append(" ");
			shift.setSelected(false);
		}
		else if(ae.getSource()==enter)
		{
			ta.append("\n");
			shift.setSelected(false);
		}
		else if(ae.getSource()==n1)
		{
			if(numl.isSelected()==false)
			{
				ta.append(n1.getText());
				shift.setSelected(false);
			}
		}
		else if(ae.getSource()==n2)
		{
			if(numl.isSelected()==false)
			{
				ta.append(n2.getText());
				shift.setSelected(false);
			}
		}
		else if(ae.getSource()==n3)
		{
			if(numl.isSelected()==false)
			{
				ta.append(n3.getText());
				shift.setSelected(false);
			}
		}
		else if(ae.getSource()==n4)
		{
			if(numl.isSelected()==false)
			{
				ta.append(n4.getText());
				shift.setSelected(false);
			}
		}
		else if(ae.getSource()==n5)
		{
			if(numl.isSelected()==false)
			{
				ta.append(n5.getText());
				shift.setSelected(false);
			}
		}
		else if(ae.getSource()==n6)
		{
			if(numl.isSelected()==false)
			{
				ta.append(n6.getText());
				shift.setSelected(false);
			}
		}
		else if(ae.getSource()==n7)
		{
			if(numl.isSelected()==false)
			{
				ta.append(n7.getText());
				shift.setSelected(false);
			}
		}
		else if(ae.getSource()==n8)
		{
			if(numl.isSelected()==false)
			{
				ta.append(n8.getText());
				shift.setSelected(false);
			}
		}
		else if(ae.getSource()==n9)
		{
			if(numl.isSelected()==false)
			{
				ta.append(n9.getText());
				shift.setSelected(false);
			}
		}
		else if(ae.getSource()==n0)
		{
			if(numl.isSelected()==false)
			{
				ta.append(n0.getText());
				shift.setSelected(false);
			}
		}
		else if(ae.getSource()==bksp)
		{
			char[] text=ta.getText().toCharArray();
			String str="";
			for(int i=0;i<text.length-1;i++)
				str+=text[i];
			ta.setText(str);
			shift.setSelected(false);
		}
		else if(ae.getSource()==clr)
		{
			ta.setText("");
			caps.setSelected(false);
			shift.setSelected(false);
			numl.setSelected(false);
		}
	}
}

class KeyBoard
{
	public static void main(String[] args)
	{
		KeyBoardFrame kbf=new KeyBoardFrame();
		kbf.setVisible(true);
		kbf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		kbf.setBounds(0,0,1015,680);

		ImageIcon ii=new ImageIcon("Key.PNG");
		kbf.setIconImage(ii.getImage());
	}
}