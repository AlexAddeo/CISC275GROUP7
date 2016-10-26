package model;
public abstract class Obstacle {
	boolean beenTreated;

	public void removeObstacle(){
	}
		/* remove obstacle from view, delete object */
	
	abstract void checkItem(Object o1);
		/* Determines if item dropped on self is correct */

	abstract void damageChar();
		/* Reduce health meter */

}
