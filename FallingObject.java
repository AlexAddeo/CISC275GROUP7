package model;

public class FallingObject extends InteractiveObject{

	public boolean falling = true;
	public boolean caught = false;
	public boolean bottom = false;
	public final int FALL_SPEED = 5;
	
	private FallType type;
	
	
	public FallingObject(FallType f){
		this.type = f;
		this.ypos = 400;
	}
	
	public void fall(){
		this.ypos -= 5;
		if(this.ypos <= 0){
			bottom = true;
		}
	};
	
	public void stop(){
		if(caught = true){
			falling = false;
		}
		else if(bottom = true){
			if(this.getType() == FallType.Fish){
				falling = true;
			}
			else{
			falling = false;
			}
		}
	};
	
	public FallType getType(){
		return this.type;
	}
	
}
