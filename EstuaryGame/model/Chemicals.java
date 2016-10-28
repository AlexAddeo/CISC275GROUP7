package model;

public class Chemicals extends Obstacle {
	public boolean checkItem(int c){
		if(c == 1){
			damage = false;
			return true;
		}
		else{
			damage = true;
			return false;
		}
	}
}
