abstract class Obstacle {
	bool beenTreated;

	void removeItem(); 
		/* remove ACollectableObject from view, delete object */
	
	abstract bool checkItem(Object o1);
		/* Determines if item dropped on self is correct */
	}

	abstract void damageChar();
		/* Reduce health meter */

	abstract void receiveItem();
		/* Modifies damage values and */
}
