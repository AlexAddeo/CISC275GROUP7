package model;

public class EmptySoil extends Obstacle {
	public boolean checkItem(int c){
		if(c == 2){
			damage = false;
			return true;
		}
		else{
			damage = true;
			return false;
		}
	}
}
