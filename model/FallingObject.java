package main;

public abstract class FallingObject extends InteractiveObject{

	private boolean falling = true;
	private boolean caught = false;
	private boolean bottom = false;
	
	public void fall(){
		
	};
	
	public void stop(){
		falling = false;
	};
	
}
