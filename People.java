package model;

public class People extends Obstacle{
	public boolean checkItem(int c){
		if(c == 0){
			damage = false;
			return true;
		}
		else{
			damage = true;
			return false;
		}
	}
	
//	public void damage(){
//		
//	}
	

}
