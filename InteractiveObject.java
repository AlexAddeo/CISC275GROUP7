
public abstract class InteractiveObject {

	private int x;
	private int y;
	private boolean hasCollided = false;
	
	public void move(int xpos, int ypos){
		this.x = xpos;
		this.y = ypos;
	}
	
}