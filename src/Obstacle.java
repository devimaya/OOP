

public class Obstacle {
	public int size = 10;
	public int positionX;
	public int positionY;
	
	
		protected void setX(int positionX)
		{	this.positionX = positionX;
		}
		protected void setY(int positionY)
		{	this.positionY = positionY;
		}
		protected int getX()
		{	return this.positionX;
		}
		protected int getY()
		{	return this.positionY;
		}
		protected int getSize()
		{	return this.size;
		}
}
