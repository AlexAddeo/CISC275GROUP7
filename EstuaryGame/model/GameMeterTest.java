package model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public classGameMeterTest {
	@Test
	public void testGameMeter(){
		GameMeter testmeter = new GameMeter();
		//Assume GameMeter starts at 50 and dead is false.
		assertEquals(50, testmeter.getHealth());
		assertEquals(false, testmeter.getDead());
		//Increase health by 5;
		testmeter.increase(5);
		assertEquals(55, testmeter.getHealth());
		assertEquals(false, testmeter.getDead());
		//Decrease health by 10.
		testmeter.increase(10);
		assertEquals(45, testmeter.getHealth());
		assertEquals(false, testmeter.getDead());
		//0 health sets dead to true
		testmeter.decrease(45);
		assertEquals(0, testmeter.getHealth());
		assertEquals(true, testmeter.getDead());
	}
}