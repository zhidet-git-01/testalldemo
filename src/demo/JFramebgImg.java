package demo;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
class site1
{
	// 创建框架
	JFrame frame = new JFrame();
	// 加载背景图片
	ImageIcon bg = new ImageIcon("back.jpg");
	
	public site1(){
		// 把背景图片显示在一个标签里
		JLabel label = new JLabel(bg);
		//添加图片到frame的第二
		int width = bg.getIconWidth();
		int height = bg.getIconHeight();
		label.setBounds(0,0,width,height);
		
		frame.getLayeredPane().add(label);
		
		frame.setLayout(null);
		frame.setTitle("GAMEstart");
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
		
		
		 
		
	}
}
public class JFramebgImg {
	public static void main(String agrs[]){
		new site1();
	}
}
