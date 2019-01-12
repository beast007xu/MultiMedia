package team.ecnu.videoRecordingSystem.gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimer extends MouseAdapter{
	private Timer timer;
	private ActionListener actionListener;
	
	public void start() {
		timer=new Timer();//创建Timer对象安排线程任务
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				ActionEvent actionEvent=new ActionEvent(MyTimer.this, 0, "");
				if (actionListener!=null) {
					
					actionListener.actionPerformed(actionEvent);
				}
				
				
			}
		},0, 100);
	}
	
//	public void stop() {
//		timer.cancel();
//	}


//	@Override
//	public void mousePressed(MouseEvent e) {
//		// TODO Auto-generated method stub
//		super.mousePressed(e);
//		stop();
//	}
//	
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		// TODO Auto-generated method stub
//		super.mouseReleased(e);
//		start();
//	}

	public ActionListener getActionListener() {
		return actionListener;
	}

	public void setActionListener(ActionListener actionListener) {
		this.actionListener = actionListener;
	}
	
	

}
