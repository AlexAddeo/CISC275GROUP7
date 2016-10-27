import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class WavesTest extends Waves{

	//want to test the methods within waves.
	private Object obj;
	
	public WavesTest(Object o1){
		
		this.obj = o1;
	}
	
	@Test
	public void checkBarrierTest(){
		//need to check and see what type of object is being passed in.
		//if a gabion, need to use gabion damage. 
		//if a plant, need to use plant damage.
		//if the runoff reaches water, need to use water damage.
		assertSame("object is a gabion.", new Gabion(), this.obj);
		assertSame("object is a plant.", new Plant(), this.obj);
		assertSame("object is water.", new Water(), this.obj);
	}
	
	@Test
	public void damageTest(){
		//Testing to see if damage works.
		//Damage will be different after checking the barrier. Can't write tests for this
		// until the code in the methods is completed.
		int expected_damage = 20;
		
		Waves bigWave = new Waves();
		bigWave.damage(this.obj);
		assertEquals("20 points of damage should be given.", expected_damage, ((PlaceableObject)obj).health);
	}
}
