package demo;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseMotion extends JFrame implements MouseMotionListener {
	static final long serialVersionUID = 0;
	JLabel bar = new JLabel();
	JTextField text = new JTextField();

	public MouseMotion() {
		setTitle("Mouse Event");
		getContentPane().add(text, BorderLayout.NORTH);
		getContentPane().add(bar, BorderLayout.SOUTH);
		addMouseMotionListener(this);
	}

	public static void main(String args[]) throws Exception {
		MouseMotion mouse = new MouseMotion();
		mouse.setSize(500, 500);
		mouse.setVisible(true);
		mouse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		String s = "x = " + x + "y = " + y;
		bar.setText(s);
		text.setText(s);
	}

	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		String s = "x = " + x + " y = " + y;
		bar.setText(s);
		text.setText(s);
	}

	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		String s = "x = " + x + " y = " + y;
		bar.setText(s);
		text.setText(s);
	}

	
}