import java.util.Timer;
import java.util.TimerTask;


public class movingObstacle extends Obstacle
{

Timer timer;
	
public int speed=5;

	protected int speed()
	{	return this.speed;
	}
	
	
public void isMoving()
{
		if(positionY < 205 || positionY > 385) speed = -speed;
		
		positionY = positionY + speed;
		setY(positionY);
}

public void isMovingBawah()
{
		if(positionY < 205 || positionY > 385) speed = -speed;
		
		positionY = positionY - speed;
		setY(positionY);
}

public void move()
{
	timer = new Timer();
	timer.schedule(new TimerTask(){

	
	public void run()
	{
		isMoving();
		
	}
	},0,100);
}

}
