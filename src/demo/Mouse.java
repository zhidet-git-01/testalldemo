package demo;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Mouse extends JFrame implements MouseListener {
	JPanel jp = new JPanel();
	JLabel statusbar = new JLabel();
	static final long serialVersionUID = 0;

	public Mouse() {
		setTitle("Mouse Event");
		getContentPane().add(jp, BorderLayout.CENTER);
		getContentPane().add(statusbar, BorderLayout.SOUTH);
		jp.addMouseListener(this);
	}

	public static void main(String[] args) {
		Mouse frame = new Mouse();
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		String s = "鼠标在坐标" + "(" + x + "," + y + ")" + "处按下";
		statusbar.setText(s);
	}

	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		String s = "鼠标在坐标" + "(" + x + "," + y + ")" + "处释放";
		statusbar.setText(s);
	}

	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		String s = "鼠标在坐标" + "(" + x + "," + y + ")" + "处点击";
		statusbar.setText(s);
	}

	public void mouseEntered(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		String s = "鼠标在坐标" + "(" + x + "," + y + ")" + "处进入";
		statusbar.setText(s);
	}

	public void mouseExited(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		String s = "鼠标在坐标" + "(" + x + "," + y + ")" + "处离开";
		statusbar.setText(s);
	}
}
