
public abstract class Character {
	int xpos,ypos;
	
	/**
	 * Default constructor for a character with no arguments
	 */
	Character(){}
	
	/**
	 * Constructor for a character with x and y given
	 * @param startx starting x coordinate
	 * @param starty starting y coordinate
	 */
	Character(int startx, int starty){}
	
	/**
	 * Moves a character given an x direction and y direction
	 * @param xdir x direction the character is moving
	 * @param ydir y direction the character is moving
	 */
	public void move(int xdir, int ydir){}
	
	/**
	 * Collects an object
	 * @param o object that the character collects
	 */
	public void collect(Object o){}
	
	/**
	 * As it says on the can.
	 * Handles input.
	 * No parameters (yet).
	 */
	public void handleinput(){}
	
}
