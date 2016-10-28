import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class WavesTest{

	//want to test the methods within waves.
	
	PlaceableObject placeable = new PlaceableObject();
	
	Waves bigWave = new Waves();
	
	@Test
	public void damageTest(){
		//Testing to see if damage works.
		//Damage will be different after checking the barrier. Can't write tests for this
		// until the code in the methods is completed.
		int expected_damage = placeable.health-1;

		bigWave.damage(placeable);
		
		assertEquals("1 point of damage should be given.", expected_damage, placeable.health);
	}
}
