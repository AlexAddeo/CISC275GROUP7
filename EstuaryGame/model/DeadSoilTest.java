package model;
import static org.junit.Assert.*;
import org.junit.Test;

public class DeadSoilTest{
	@Test
	public void checkItemDeadSoilTest(){
		DeadSoil dead = new DeadSoil();
		Compost comp = new Compost();
		Trashbag trashb = new Trashbag();
		Hay hay = new Hay();
		Seeds seed = new Seeds();
		boolean compCheck = dead.checkItem(comp);
		boolean trashCheck = dead.checkItem(trashb);
		boolean hayCheck = dead.checkItem(hay);
		boolean seedCheck = dead.checkItem(seed);
       	 	assertEquals("Dead soil should only accept compost and checkItem should return true", true, compCheck);
        	assertEquals("Dead soil can't accept trashbags, should return false", false, trashCheck);
        	assertEquals("Dead soil can't accept hay, should return false", false, trashCheck);
        	assertEquals("Dead soil can't accept seeds, should return false", false, trashCheck);
	}
}
