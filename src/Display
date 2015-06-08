import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import javax.swing.*;


public class Display extends JFrame{
	
	JLabel car1;
	Map map;
	Timer timer;
	JLabel info, info1, info2, info3, info4;
	JButton daynightToggle;
	
	JLabel jalan1, hutan1, hutan2, hutan3, hutan4;
	
	Vector<JLabel> obsIcon = new Vector<JLabel>();
	Vector<JLabel> mObsIcon = new Vector<JLabel>();
	
	 ImageIcon obstacleIcon = new ImageIcon("C://Users//User//Desktop//SEMUA//obstacle.jpg");
	 ImageIcon movingObstacleIcon = new ImageIcon("C://Users//User//Desktop//SEMUA//movingobstacle.jpg");
	 ImageIcon jalanD = new ImageIcon("C://Users//User//Desktop//SEMUA//jalansiang.jpg");
	 ImageIcon jalanN = new ImageIcon("C://Users//User//Desktop//SEMUA//jalanmalam.jpg");
	 ImageIcon hutanD = new ImageIcon("C://Users//User//Desktop//SEMUA//hutansiang.jpg");
	 ImageIcon hutanN = new ImageIcon("C://Users//User//Desktop//SEMUA//hutanmalam.jpg");
	 ImageIcon mobilD = new ImageIcon("C://Users//User//Desktop//SEMUA//mobilsiang.png");
	 ImageIcon mobilN = new ImageIcon("C://Users//User//Desktop//SEMUA//mobilmalam.png");
	 
	public Display(Map a)
	{
		super("Tes");
		this.setLayout(null);
		this.setResizable(false);
		//this.setLocationRelativeTo(null);
		
		map = a;
		
		
		
		car1 = new JLabel(mobilD);
		car1.setSize(20,20);
		car1.setLocation(map.car.carPositionX, map.car.carPositionY);
		add(car1);
		
		setVisible(true);
		setSize(1000,600);
		
		// buat label obstacle
		for (int i=0; i<map.obsList.size(); i++){
			obsIcon.add(createObstacleIcons(obstacleIcon, map.obsList.get(i)));
			add(obsIcon.get(i));
		}
		
		for (int i=0; i<map.mObsList.size(); i++){
			mObsIcon.add(createMovingObstacleIcons(movingObstacleIcon, map.mObsList.get(i)));
			add(mObsIcon.get(i));
		}
		
		// buat label moving obstacle
		
		// info mobil
		info = new JLabel("");
		info.setBounds(200,450,1000,90);
		info.setForeground(Color.BLACK);
		add(info);
		info.setText("");
		
		info1 = new JLabel("");
		info1.setBounds(200,465,1000,90);
		info1.setForeground(Color.BLACK);
		add(info1);
		info1.setText("");
		
		info2 = new JLabel("");
		info2.setBounds(200,480,1000,90);
		info2.setForeground(Color.BLACK);
		add(info2);
		info2.setText("");
		
		info3 = new JLabel("");
		info3.setBounds(200,495,1000,90);
		info3.setForeground(Color.BLACK);
		add(info3);
		info3.setText("");
		
		info4 = new JLabel("");
		info4.setBounds(200,510,1000,90);
		info4.setForeground(Color.BLACK);
		add(info4);
		info4.setText("");
		
		
		daynightToggle = new JButton();
		daynightToggle.setText("Day/Night");
		daynightToggle.setSize(100,20);
		daynightToggle.setLocation(10,10);
		daynightToggle.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(map.time == false)
				{
					map.time = true;
					car1.setIcon(mobilD);
					jalan1.setIcon(jalanD);
					hutan1.setIcon(hutanD);
					hutan2.setIcon(hutanD);
					hutan3.setIcon(hutanD);
					hutan4.setIcon(hutanD);
				}
				else
				{
					map.time = false;
					car1.setIcon(mobilN);
					jalan1.setIcon(jalanN);
					hutan1.setIcon(hutanN);
					hutan2.setIcon(hutanN);
					hutan3.setIcon(hutanN);
					hutan4.setIcon(hutanN);
				}
			}
		});
		add(daynightToggle);

		
		
		// background
		jalan1 = new JLabel(jalanD);
		add(jalan1);
		jalan1.setSize(1000,200);
		jalan1.setLocation(0,200);
		
		hutan1 = new JLabel(hutanD);
		add(hutan1);
		hutan1.setSize(1000,100);
		hutan1.setLocation(0,0);
		
		hutan2 = new JLabel(hutanD);
		add(hutan2);
		hutan2.setSize(1000,100);
		hutan2.setLocation(0,100);
		
		hutan3 = new JLabel(hutanD);
		add(hutan3);
		hutan3.setSize(1000,100);
		hutan3.setLocation(0,400);
		
		hutan4 = new JLabel(hutanD);
		add(hutan4);
		hutan4.setSize(1000,100);
		hutan4.setLocation(0,500);
		
		
		//daynightToggle
		
					
		
		
	}
	
	public JLabel createObstacleIcons(Icon a, Obstacle b)
	{
		JLabel temp;
		temp = new JLabel(a);
		temp.setSize(b.size, b.size);
		temp.setLocation(b.getX(), b.getY());
		return temp;
	}
	
	public JLabel createMovingObstacleIcons(Icon a, movingObstacle b)
	{
		JLabel temp = new JLabel(a);
		temp.setSize(b.size, b.size);
		temp.setLocation(b.getX(), b.getY());
		return temp;
	}
	
	public void start()
	{
		timer = new Timer();
		timer.schedule(new TimerTask(){

			public void run()
			{
				//icon mobil
				car1.setLocation(map.car.carPositionX, map.car.carPositionY);
				
				//icon moving obstacle
				for (int i=0; i<map.mObsList.size(); i++){
					mObsIcon.get(i).setLocation(map.mObsList.get(i).getX(), map.mObsList.get(i).getY());
				}
				
				//info mobil
				info.setText("Kecepatan : " + map.car.dashboard.getSpeed(map.car.engine));
				info1.setText("Position X : " + map.car.carPositionX + "      Position Y : " + map.car.carPositionY);
				info2.setText("Fuel level : " + map.car.dashboard.getFuel(map.car.tank));
				info3.setText("Temperatur : " + map.car.dashboard.getTemperature(map.car.engine));
				if (map.time == true)
					info4.setText("Time : Day");
				else
					info4.setText("Time : Night");
				
				
			}
		},0,50);
		
	}
	
	public void pause()
	{
		timer.cancel();
	}
	
	
	
	
}
