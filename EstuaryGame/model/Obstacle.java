package model;

public abstract class Obstacle extends InteractiveObject{
	boolean beenTreated;
	boolean damage;
	public void removeObstacle(){
	}
	/* remove obstacle from view, delete object */
		
	abstract boolean checkItem(int c);
	/* Determines if item dropped on self is correct */

	//abstract void damageChar();
	/* Reduce health meter */

}
