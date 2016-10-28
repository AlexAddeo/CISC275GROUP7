package model;
import static org.junit.Assert.*;
import org.junit.Test;

public class BlueCrabTest{

	@Test
	public void jumpTest(){
		BlueCrab bc = new BlueCrab();
		bc.ypos = 0;
		bc.jump();
		assertEquals("Blue crab's position should be changed by 100", 100, bc.ypos);
	}
}