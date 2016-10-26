package model;
public abstract class Obstacle {
	boolean beenTreated;

	public void removeItem(){
	}
		/* remove ACollectableObject from view, delete object */
	
	public void checkItem(Object o1){
		/* Determines if item dropped on self is correct */
	}

	abstract void damageChar();
		/* Reduce health meter */

	abstract void receiveItem();
		/* Modifies damage values and */
}
