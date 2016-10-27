package model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrashBinTests {
	@Test
	public void testfull() {
		TrashBin testbin = new TrashBin();
		// Bin starts empty. Max capacity is (arbitrarily) 20.
		assertEquals(0, testbin.getCount());
		assertEquals(false, testbin.checkFull());
		//Add a Trash to the bin.
		Trash t1 = new Trash;
		testbin.add(t1);
		assertEquals(1, testbin.getCount());
		assertEquals(false, testbin.checkFull());
		assertEquals(t1, testbin.checkItem(t1));
		//Adds Trashes to the test bin until full.
		while (!testbin.checkFull()) testbin.add(new Trash);
		assertEquals(20, testbin.getCount());
		assertEquals(true, testbin.checkFull());
	}
}