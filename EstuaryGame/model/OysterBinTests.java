package model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OysterBinTests {
	@Test
	public void testfull() {
		OysterBin testbin = new OysterBin();
		// Bin starts empty. Max capacity is (arbitrarily) 20.
		assertEquals(0, testbin.getCount());
		assertEquals(false, testbin.checkFull());
		//Add an oyster to the bin.
		Oyster o1 = new Oyster;
		testbin.add(o1);
		assertEquals(1, testbin.getCount());
		assertEquals(false, testbin.checkFull());
		assertEquals(o1, testbin.checkItem(o1));
		//Adds oysters to the test bin until full.
		while (!testbin.checkFull()) testbin.add(new Oyster);
		assertEquals(20, testbin.getCount());
		assertEquals(true, testbin.checkFull());
	}
}