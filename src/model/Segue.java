package model;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Segue extends JFrame implements MouseListener {

	JLabel label;
	ImageIcon nervous;
	ImageIcon a;
	ImageIcon b;
	ImageIcon c;
	ImageIcon d;
	ImageIcon e;
	ImageIcon f;
	ImageIcon g;
	ImageIcon h;
	ImageIcon i;

	public Segue() {


		nervous = new ImageIcon(getClass().getResource("/images/nervous.png"));
		a = new ImageIcon(getClass().getResource("/images/a.png"));
		b = new ImageIcon(getClass().getResource("/images/b.png"));
		c = new ImageIcon(getClass().getResource("/images/c.png"));
		d = new ImageIcon(getClass().getResource("/images/d.png"));
		e = new ImageIcon(getClass().getResource("/images/e.png"));
		f = new ImageIcon(getClass().getResource("/images/f.png"));
		g = new ImageIcon(getClass().getResource("/images/g.png"));
		h = new ImageIcon(getClass().getResource("/images/h.png"));
		i = new ImageIcon(getClass().getResource("/images/i.png"));

		label = new JLabel();
		label.addMouseListener(this);
		label.setIcon(e);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Seguidor de mouse");
		this.setSize(300, 300);
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		this.add(label);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		   label.setIcon(nervous);//nervoso
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if((e.getX() >= 0 && e.getX() <=90) && (e.getY() >= 0 && e.getY() <=90)){
		 	   label.setIcon(a);//A
			}
			else if((e.getX() >= 0 && e.getX() <=90) && (e.getY() > 90 && e.getY() <=195)){
			  label.setIcon(d);//D
   		        }
			else if((e.getX() >= 0 && e.getX() <=90) && (e.getY() > 195 && e.getY() <=300)){
			  label.setIcon(g);//g
   		        }
			else if((e.getX() > 90 && e.getX() <=205) && (e.getY() >= 0 && e.getY() <=90)){
			  label.setIcon(b);//b
			}
			else if((e.getX() > 90 && e.getX() <=205) && (e.getY() > 195 && e.getY() <=300)){
			  label.setIcon(h);//h
   		        }
			else if((e.getX() > 205 && e.getX() <=300) && (e.getY() >= 0 && e.getY() <=90)){
			  label.setIcon(c);//c
 		        }
			else if((e.getX() > 205 && e.getX() <=300) && (e.getY() > 90 && e.getY() <=195)){
			  label.setIcon(f);//f
			}
			else{
			   label.setIcon(i);//i
			}

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	 	label.setIcon(this.e);
	}

}
