package model;

public abstract class InteractiveObject {

	private int xpos;
	private int ypos;
	private boolean hasCollided = false;
	
	public void move(int x, int y){
		xpos = x;
		ypos = y;
	}
	
}
