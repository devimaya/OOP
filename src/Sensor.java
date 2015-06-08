public class Sensor {
	Map map;
	
	public Sensor(Map a){
		map = a;
	}
	
	public boolean checkTime()
	{
		return map.time;
	}
	public Obstacle checkObstacle()
	{
		int a = map.car.carPositionX;
		int b = map.car.carPositionY;
		
		int tempX;
		int tempY;
		
		for(int i=a; i<a+50; i++) // cek 50 pixel di depan
		{
			for (int j=b-10; j<b+10; j++) // cek 10 pixel di atas dan bawah
			{
				for (int k=0; k<map.obsList.size(); k++)
				{
					tempX = map.obsList.get(k).getX();
					tempY = map.obsList.get(k).getY();
					if (tempX == i && tempY == j)
					{
						return map.obsList.get(k);
					}
				}
			}
		}
		return null;
	}
	
	public movingObstacle checkMovingObstacle()
	{
		int a = map.car.carPositionX;
		int b = map.car.carPositionY;
		
		int tempX;
		int tempY;
		
		for(int i=a; i<a+50; i++) // cek 50 pixel di depan
		{
			for (int j=b-10; j<b+10; j++) // cek 10 pixel di atas dan bawah
			{
				for (int k=0; k<map.mObsList.size(); k++)
				{
					tempX = map.mObsList.get(k).getX();
					tempY = map.mObsList.get(k).getY();
					if (tempX == i && tempY == j)
					{
						return map.mObsList.get(k);
					}
				}
			}
		}
		return null;
	}
}
