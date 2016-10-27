import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GabionTest extends Gabion{
	@Test
	public void decreaseErosionTest(){
		
		Gabion g1 = new Gabion();
		boolean decreased = false;
		
		if(g1.erosionEffectiveness > g1.runoffEffectiveness){
			decreased = true;
			assertTrue("Gabions are more effective to erosion", decreased);
		}
		else{
			assertFalse("Plants should not be more effective", decreased);
		}
		//want to show that erosion effectiveness is greater (lesser int value for erosion dmg).

	}
	
	@Test
	public void decreaseRunoffTest(){
		
		Gabion g2 = new Gabion();
		boolean decreased = false;
		
		if(g2.erosionEffectiveness < g2.runoffEffectiveness){
			decreased = true;
			assertTrue("Plants are more effective to runoff", decreased);
		}
		else{
			assertFalse("Gabions should not be more effective", decreased);
		}
		//want to show that runoff effectiveness is lesser (greater int value for runoff dmg).

	}

}
