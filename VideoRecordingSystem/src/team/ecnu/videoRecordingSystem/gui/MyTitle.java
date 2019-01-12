package team.ecnu.videoRecordingSystem.gui;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MyTitle extends JPanel implements ActionListener{

	private JLabel labelTitle;
	/**
	 * Create the panel.
	 */
	public MyTitle() {
		setLayout(new BorderLayout(0, 0));
		labelTitle = new JLabel("");
		labelTitle.setFont(new Font("幼圆", Font.BOLD, 50));//设置字体颜色、粗细、大小
		FontMetrics fm = getFontMetrics(labelTitle.getFont());  //调取txt文件
		add(labelTitle, BorderLayout.CENTER);//位置
		//读取语音识别文件
		loadTitle("output.txt");
		setSize(fm.stringWidth(labelTitle.getText()),100);
		addMouseEvent();//添加鼠标监听事件

	}

	private void addMouseEvent() {
		
		
		addMouseMotionListener(new MouseMotionAdapter() {
			int lastx;
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseMoved(e);
				lastx=e.getX();
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				//super.mouseDragged(e);
				setLocation(getX()+e.getX()-lastx, getY());
				
			}
		});
	}
	
	public void loadTitle(String fileName) {
		
		BufferedReader bufferedReader;
		try {
			bufferedReader = new BufferedReader(new FileReader(fileName));
			String title=bufferedReader.readLine();//逐行读取txt文件
			bufferedReader.close();
			labelTitle.setText(title);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setLocation(getX()-10, getY());//移动速度
	}
	
	

}
