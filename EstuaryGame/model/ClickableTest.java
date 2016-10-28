package model;
import static org.junit.Assert.*;
import org.junit.Test;

public class ClickableTest {

	@Test
	public void removeFromScreenTest() {
		ClickableObject clickableP = new ClickableObject();
		clickableP.removeFromScreen();
		assertEquals("Clickable Pointer should be null when removed", null, clickableP);
	}
	
	public void addToCount(){
		ClickableObject clickableP = new ClickableObject();
		clickableObject.count = 10;
		int curr = clickableObject.count;
		clickableP.addToCount();
		assertEquals("Count should be increased by 1.", curr+1, clickableObject.count);
	}
	
}
