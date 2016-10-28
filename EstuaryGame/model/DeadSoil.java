package model;

public class DeadSoil extends Obstacle {
	public boolean checkItem(int c){
		if(c == 3){
			damage = false;
			return true;
		}
		else{
			damage = true;
			return false;
		}
	}
}
