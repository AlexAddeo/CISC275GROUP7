package model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HorsehoeCrabTests {
	@Test
	public void testnetsize() {
		HorsehoeCrab testcrab = new HorseshoeCrab();
		// Assume net size starts at 10 and powerup is false.
		assertEquals(10, testcrab.getnetSize());
		assertEquals(false, testcrab.getpowerup());
		testcrab.increaseNetSize();
		// Increasing net size increases it to 20 and sets powerup to true.
		assertEquals(20, testcrab.getnetSize());
		assertEquals(true, testcrab.getpowerup());
	}

	@Test
	public void testcatch() {
		HorsehoeCrab testcrab = new HorseshoeCrab();
		//Starts off with an empty net.
		assertEquals(false, testcrab.getIsNetFull());
		//Catches a thing, thereby filling net.
		testcrab.catchItem();
		assertEquals(true, testcrab.getIsNetFull());
		//Gets rid of thing, thereby emptying net.
		testcrab.throwItem();
		assertEquals(false, testcrab.getIsNetFull());
	}

}
