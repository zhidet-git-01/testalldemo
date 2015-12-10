package demo;

import java.awt.AWTException;
import java.awt.Color; 
import java.awt.Dimension;
import java.awt.Graphics; 
import java.awt.Graphics2D; 
import java.awt.GridLayout;  
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;   
import java.awt.event.KeyEvent;

import javax.swing.*;   
public class JFrameDemo {   
	//png图片文件，这个文件在src下（exe发布时，一定要用这个方法）
	ImageIcon imageIcon =new ImageIcon(getClass().getResource("/allface.png"));
	//png图片文件，这个文件夹与项目下bin，src文件夹同目录  
//	ImageIcon imageIcon =new ImageIcon("allface.png");
	
	public JFrameDemo() {  
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		robot.keyPress(KeyEvent.VK_ALT);
//		robot.keyRelease(KeyEvent.VK_ALT);
		final JFrame f = new JFrame();   
		f.setBounds(500, 400, 400, 300);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setUndecorated(true);//关键代码！ 设置窗口无标题     
		com.sun.awt.AWTUtilities.setWindowOpaque(f, false);//关键代码！  设置窗体透明    
		
		JPanel p = new JPanel() {    
			public void paintComponent(Graphics g) {//重写这个方法
				super.paintComponent(g);//继承超类绘制组件方法 
				Graphics2D gg=(Graphics2D)g;
				if (imageIcon != null) {
					// 绘制背景 
					gg.drawImage(imageIcon.getImage(), 0, 0, f.getWidth(),  f.getHeight(), f);
					}            
				}     
			};
			
		p.setLayout(null);    
		JButton b1=new JButton("exit");    
		b1.addActionListener(new ActionListener(){    
			public void actionPerformed(ActionEvent e){     
				System.exit(0);        
				}
		});    
		b1.setBounds(220, 80, 60, 25);
		//增加离开按钮
//		p.add(b1);    
		p.add(new JLabel("这是透明窗口，只显示背景图片"));   
		f.setContentPane(p);//关键代码，这里不能用f.add(p)
		
		// 取得屏幕大小,并且设置全屏
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle bounds = new Rectangle(screenSize);
		f.setBounds(bounds);
		
		f.setVisible(true);      
		}    
	public static void main(String[] args) {
		new JFrameDemo();   
		}   
	}