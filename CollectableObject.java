package model;
import java.util.*;
public class CollectableObject extends InteractiveObject {
	boolean collected;
	//boolean usedCorrectly;
	public CollectableObject(){
		this.xpos = 0;
		this.ypos = 0;
	}
	
	public CollectableObject(int xpos, int ypos){
		this.xpos = xpos;
		this.ypos = ypos;
	}
	public void useObject(){
		collected = false;
		Integer integer = (Integer)null;
		this.xpos = integer;
		this.ypos = integer;
	}
	
	public void changePosC() {
		this.xpos -= 1;
	}

}
