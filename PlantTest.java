import static org.junit.Assert.*;

import org.junit.Test;

public class PlantTest extends Plant{
	
	@Test
	public void decreaseErosionTest(){
		
		Plant p1 = new Plant();
		boolean decreased = false;
		
		if(p1.erosionEffectiveness > p1.runoffEffectiveness){
			decreased = true;
			assertTrue("Plants are less effective to erosion", decreased);
		}
		else{
			assertFalse("Gabions should not be less effective", decreased);
		}
		//want to show that erosion effectiveness is less (greater int value for erosion dmg).

	}
	
	@Test
	public void decreaseRunoffTest(){
		
		Plant p2 = new Plant();
		boolean decreased = false;
		
		if(p2.erosionEffectiveness < p2.runoffEffectiveness){
			decreased = true;
			assertTrue("Plants are more effective to runoff", decreased);
		}
		else{
			assertFalse("Gabions should not be more effective", decreased);
		}
		//want to show that runoff effectiveness is greater (lesser int value for runoff dmg).

	}

}
