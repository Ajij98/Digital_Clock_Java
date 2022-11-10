import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

import com.toedter.calendar.JDateChooser;

public class Digital_Clock extends JFrame{
	
	JLabel lblDate=new JLabel();
	JLabel lblTime=new JLabel();
	JLabel lblT=new JLabel("Time: ");
	
	public Digital_Clock(){
		init();
		cmp();
		showCurrentDate();
		showCurrentTime();
	}
	public void showCurrentDate(){
		Date date=new Date();
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		lblDate.setText(format.format(date));
	}
	public void showCurrentTime(){
		new Timer(0, new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Date d=new Date();
				SimpleDateFormat s=new SimpleDateFormat("hh:mm:ss a");
				lblTime.setText(s.format(d));
			}
		}).start();
	}
	
	public void init(){
		setSize(500,200);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Digital_Clock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void cmp(){
		FlowLayout flow=new FlowLayout();
		setLayout(flow);
		flow.setVgap(40);
		
		add(lblT);
		lblT.setForeground(Color.GRAY);
		lblT.setFont(new Font("carlibri", Font.BOLD, 30));
		
		add(lblTime);
		lblTime.setForeground(Color.BLACK);
		lblTime.setFont(new Font("carlibri", Font.BOLD, 25));
		
		add(lblDate);
		lblDate.setForeground(Color.BLACK);
		lblDate.setFont(new Font("carlibri", Font.BOLD, 25));
	}
	
	public static void main(String args[]){
		Digital_Clock digitalClock=new Digital_Clock();
	}

}
