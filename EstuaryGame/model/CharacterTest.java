package model;
import static org.junit.Assert.*;
import org.junit.Test;

public class CharacterTest{
	@Test
	public void moveTest(){
		Character c = new Character;
		c.xpos = 0;
		c.ypos = 0;
		int x = 5;
		int y = 5;
		c.move(x,y);
		assertEquals("Character's x position should be changed", x, c.xpos);
		assertEquals("Character's x position should be changed", y, c.ypos);
	}
}