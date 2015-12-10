package demo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameNotLook {
	public JFrameNotLook(){
		// 创建框架
		JFrame frame = new JFrame();
		
		
		//获取frame的最上层面板为了设置其背景颜色(JPanel有设置透明的方法)
		JPanel jp=(JPanel)frame.getContentPane(); 
		//设置透明 
		jp.setOpaque(false);
		
		
		
		//测试用的
		JPanel panel=new JPanel(); 
		//也要让他透明 
		panel.setOpaque(false); 
		panel.setLayout(null);
		//为了使用按钮的定位 
		JButton button=new JButton("OK"); 
		button.setSize(300, 300); 
		button.setLocation(100, 50); 
		panel.add(button); 
		frame.add(panel);
		frame.setContentPane(panel);
		
//		frame.setTitle("GAMEstart");
		frame.setUndecorated(true);//关键代码！ 设置窗口无标题  
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}
		
		
	public static void main(String agrs[]){
		new JFrameNotLook();
	}
}
