
import java.util.Random;
import java.util.Vector;


public class Map {
	
	Car car;
	Vector<Obstacle> obsList = new Vector<Obstacle>();
	Vector<movingObstacle> mObsList = new Vector<movingObstacle>();
	
	public int jumlahObstacleAwal = 0, posisiX = 150, posisiX1 = 300, tambahX = 300;
	final  int sizeMapX = 1000, sizeMapY = 600;
	
	boolean time;    //true = day, false = night
	
	public Map(Car a){
		time = true;
		car = a;
		
		createObstacle(obsList);
		createMovingObstacle(mObsList);
		createObstacle(obsList);
		createMovingObstacle(mObsList);
		createObstacle(obsList);
		createMovingObstacle(mObsList);
		
	}
	
	
	public void createObstacle(Vector<Obstacle> Obs){
		
		Obs.add(new Obstacle());
		Obs.get(Obs.size()-1).setY(RandY(sizeMapY, 10));
		Obs.get(Obs.size()-1).setX(posisiX);
		
		posisiX = posisiX+tambahX;
	}
	
	public void createMovingObstacle(Vector<movingObstacle> mObs){
		mObs.add(new movingObstacle());
		mObs.get(mObs.size()-1).setY(RandY(sizeMapY, 10));
		mObs.get(mObs.size()-1).setX(posisiX1);
		
		posisiX1 = posisiX1+tambahX;
	}
	
	public void startAllMovingObstacle(Vector<movingObstacle> mObs){
		for (int i=0; i<mObs.size(); i++)
		{
			mObs.get(i).move();
		}
	}
	
	private int RandY(int Y, int size)
	{	Random rand = new Random();
		int nilai;
		do{
		nilai = rand.nextInt(Y)-(size-1);
		}while(nilai < 200 || nilai > 390);
		return nilai;
	}
	private  void RandX(int positionX)
	{	positionX += positionX;
	}
	
	
}
