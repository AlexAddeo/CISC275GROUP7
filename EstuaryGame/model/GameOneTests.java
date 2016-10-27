package model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public classGameOneTests {
	@Test
	public void testbins() {
		GameOne g1 = new GameOne();
		//Starts with empty bins.
		assertEquals(0, g1.getTrashBin().getCount());
		assertEquals(0, g1.getRecycleBin().getCount());
		assertEquals(0, g1.getOysterBin().getCount());
		assertEquals(false, g1.getTrashBin().checkFull());
		assertEquals(false, g1.getRecycleBin().checkFull());
		assertEquals(false, g1.getOysterBin().checkFull());
		//Add a Trash to the trash bin. Other bins should have nothing.
		g1.getTrashBin().add(new Trash);
		assertEquals(1, g1.getTrashBin().getCount());
		assertEquals(0, g1.getRecycleBin().getCount());
		assertEquals(0, g1.getOysterBin().getCount());
		//Adds five oysters to the oyster bin.
		for (int i = 0; i < 5; i++){
			g1.getRecycleBin().add(new Oyster);
		}
		assertEquals(1, g1.getTrashBin().getCount());
		assertEquals(0, g1.getRecycleBin().getCount());
		assertEquals(5, g1.getOysterBin().getCount());
	}
	
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