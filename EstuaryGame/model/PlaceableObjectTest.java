
import static org.junit.Assert.*;

import org.junit.Test;

public class PlaceableObjectTest{

	@Test
	public void placeTest(){
		//place the object on the screen.
		PlaceableObject placeable = new PlaceableObject();

		int x = 5;
		int y = 5;
		
		placeable.place(x,y);

		assertEquals("X coord should == placed X coord", x, placeable.x);
		assertEquals("Y coord should == placed Y coord", y, placeable.y);
		
		
	}
	
}
