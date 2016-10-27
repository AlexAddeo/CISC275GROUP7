
import static org.junit.Assert.*;

import org.junit.Test;

public class PlaceableObjectTest extends PlaceableObject{

	@Test
	public void placeTest(){
		//come back to this bc not sure how to test if the locations are correct
		//place the object on the screen.
		PlaceableObject gabion = new Gabion();
//		int expected_x = gabion.x;
//		int expected_y = gabion.y;
		//this.place(expected_x,expected_y);
//		assertEquals("X coord should == placed X coord", expected_x, gabion.getX());
//		assertEquals("Y coord should == placed Y coord", expected_y, gabion.getY());
		
	}
	
	@Test
	public void filledLocTest(){
		
		//check to see if a location is already occupied by an object.
		
//		PlaceableObject taken = new filledLoc();
		
		
	}
	
	@Test
	public void breakdownTest(){
		
		//removes health from the placed object. 
		PlaceableObject breakdownP = this;
		this.breakdown();
//		assertEquals();
	}
}