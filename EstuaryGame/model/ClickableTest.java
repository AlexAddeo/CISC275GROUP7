package model;
import org.junit.Test;
public class ClickableTest {

	@Test
	public void removeClickableTest() {
		CollectableObjcet clickableP = this;
		this.removeFromScreen();
		assertEquals("Clickable Pointer should be null when removed", null, clickableP);
	}
}