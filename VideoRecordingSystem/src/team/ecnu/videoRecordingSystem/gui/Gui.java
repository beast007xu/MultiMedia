package team.ecnu.videoRecordingSystem.gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Gui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					frame.setVisible(true);//建好数据模型
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.设置窗体属性
	 */
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 125);//坐标x，y，窗体宽度，高度
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		MyTitle myTitle = new MyTitle();
		myTitle.setLocation(getWidth()-100, 0);
		contentPane.add(myTitle);
//		contentPane.setBackground(Color.white);
		MyTimer myTimer=new MyTimer();
		myTimer.setActionListener(myTitle);
		myTitle.addMouseListener(myTimer);//鼠标事件
		myTimer.start();
	}
}
