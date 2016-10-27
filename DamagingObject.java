
public abstract class DamagingObject extends InteractiveObject{
	
	int damage;
	
	public abstract void damage(Object o1);
	
	public abstract void checkBarrier(Object o1);
	
	public void checkCollision(){}

}
