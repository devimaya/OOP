
public class Engine {

		int cylinderSize; // max speed = silinder/100
		int temperature;  // maksimal 140
		int speed;  //satuan meter per sekon
		int maxSpeed;
		
		public Engine(int silinder) //parameter butuh integer buat ukuran silinder
		{
			cylinderSize = silinder;
			temperature = 80;
			speed = 1;
			maxSpeed = 4;
		}
		

		public void adjustSpeed()
		{
			//if (speed == cylinderSize/10)
			if (speed == maxSpeed)
			return;
			
			if (speed > maxSpeed)
			{
				speed = speed-1;
				return;
			}

			speed = speed+1;
		}
		public void adjustTemperature()
		{
			if (temperature == 140)
			return;
			
			temperature++;
		}
		
}
