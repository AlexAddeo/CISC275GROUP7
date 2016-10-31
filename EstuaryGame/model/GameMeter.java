package model;

public class GameMeter {
	public int health;
	public boolean dead;
	
	//Default health is 50
	GameMeter(){
		health=50;
		dead=false;
	}
	
	GameMeter(int initialhealth){
		health=initialhealth;
		dead=false;
	}
	
	//We don't need a function to decrease health. Just give this a negative number.
	public void increasehealth(int amt){
		health += amt;
		if (health == 0) dead = true;
	}
	
	public int gethealth(){
		return health;
	}
	
	public boolean isdead(){
		return dead;
	}
}
