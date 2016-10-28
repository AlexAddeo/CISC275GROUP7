package model;
import static org.junit.Assert.*;
import org.junit.Test;

public class DamagingTest {

	@Test
	public void damageTest() {
		DamagingObject dmg = new DamagingObject();
		Water waterArea = new Water();
		Land landArea = new Land();
		Gabion gab = new Gabion();
		Plant plnt = new Plant();
		
		int expectedWaterDmg = waterArea.health-1;
		int expectedLandDmg = landArea.health-1;
		int expectedGabDmg = gab.health-1;
		int expectedPlantDmg = plnt.health-1;
		
		dmg.damage(waterArea);
		dmg.damage(landArea);
		dmg.damage(gab);
		dmg.damage(plnt);
		
		assertEquals("1 damage done to water", expectedWaterDmg, waterArea.health);
		assertEquals("1 damage done to land", expectedLandDmg, landArea.health);
		assertEquals("1 damage done to gabion", expectedGabDmg, gab.health);
		assertEquals("1 damage done to plant", expectedPlantDmg, plnt.health);
	}

	@Test
	public void checkBarrierTest(){
		DamagingObject dmg = new DamagingObject();
		Water waterArea = new Water();
		Land landArea = new Land();
		Gabion gab = new Gabion();
		Plant plnt = new Plant();
		
		boolean waterCheck = dmg.checkBarrier(waterArea);
		boolean landCheck = dmg.checkBarrier(landArea);
		boolean gabionCheck = dmg.checkBarrier(gab);
		boolean plantCheck = dmg.checkBarrier(plnt);
		
		assertEquals("checks if dmg object is dmging water", true, waterCheck);
		assertEquals("checks if dmg object is dmging water", false, landCheck);
		assertEquals("checks if dmg object is dmging water", false, gabionCheck);
		assertEquals("checks if dmg object is dmging water", false, plantCheck);
		
		assertEquals("checks if dmg object is dmging land", true, landCheck);
		assertEquals("checks if dmg object is dmging land", false, waterCheck);
		assertEquals("checks if dmg object is dmging land", false, gabionCheck);
		assertEquals("checks if dmg object is dmging land", false, plantCheck);
		
		assertEquals("checks if dmg object is dmging gabion", true, gabionCheck);
		assertEquals("checks if dmg object is dmging gabion", false, landCheck);
		assertEquals("checks if dmg object is dmging gabion", false, waterCheck);
		assertEquals("checks if dmg object is dmging gabion", false, plantCheck);
		
		assertEquals("checks if dmg object is dmging plant", true, plantCheck);
		assertEquals("checks if dmg object is dmging plant", false, landCheck);
		assertEquals("checks if dmg object is dmging plant", false, gabionCheck);
		assertEquals("checks if dmg object is dmging plant", false, waterCheck);
	}
}
