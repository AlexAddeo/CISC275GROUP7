import static org.junit.Assert.*;

import org.junit.Test;

public class RunoffTest extends Runoff{

	//want to test the methods within runoff.
	
	PlaceableObject placeable = new PlaceableObject();
	
	Runoff run = new Runoff();

	@Test
	public void damageTest(){
		//Testing to see if damage works.
		//Damage will be different after checking the barrier. Can't write tests for this
		// until the code in the methods is completed.
		int expected_damage = placeable.health-1;

		run.damage(placeable);
		
		assertEquals("1 point of damage should be given.", expected_damage, placeable.health);
	}
	
}
