package model;

public class BlueCrab extends Character {
	BlueCrab(int startx, int starty) {
		super(startx, starty);
		// TODO Auto-generated constructor stub
	}

	public void jump(){
		this.ypos -= 5;
	}
	public void unjump(){
		this.ypos += 5;
	}
}
