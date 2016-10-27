package model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecycleBinTests {
	@Test
	public void testfull() {
		RecycleBin testbin = new RecycleBin();
		// Bin starts empty. Max capacity is (arbitrarily) 20.
		assertEquals(0, testbin.getCount());
		assertEquals(false, testbin.checkFull());
		//Add a water bottle to the bin.
		WaterBottle w1 = new WaterBottle;
		testbin.add(w1);
		assertEquals(1, testbin.getCount());
		assertEquals(false, testbin.checkFull());
		assertEquals(w1, testbin.checkItem(w1));
		//Adds water bottles to the test bin until full.
		while (!testbin.checkFull()) testbin.add(new WaterBottle);
		assertEquals(20, testbin.getCount());
		assertEquals(true, testbin.checkFull());
	}
}