package demo;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Key extends JFrame implements KeyListener {
	JLabel bar;

	public Key() {
		bar = new JLabel();
		getContentPane().add(bar, BorderLayout.CENTER);
		addKeyListener(this);
	}

	public void keyPressed(KeyEvent e) {
		char c = e.getKeyChar();
		String s = c + "";
		bar.setText(s);
	}

	public void keyReleased(KeyEvent e) {
		char c = e.getKeyChar();
	}

	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
	}

	public static void main(String args[]) throws Exception {
		Key key = new Key();
		key.setSize(500, 500);
		key.setVisible(true);
		key.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}