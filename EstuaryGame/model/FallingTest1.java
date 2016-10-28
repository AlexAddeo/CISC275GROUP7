package model;
import static org.junit.Assert.*;
import org.junit.Test;

public class FallingTest {

	@Test
	public void fallTest() {
		FallingObject fall = this;
		int expected_y = this.ypos - 1;
		this.fall();
		assertEquals("y position should be decreased by 1", expected_y, this.ypos);
	}

	@Test
	public void stopTest(){
		FallingObject fall = this;
		this.stop();
		assertEquals("falling should be false", false, this.falling());
	}
}

