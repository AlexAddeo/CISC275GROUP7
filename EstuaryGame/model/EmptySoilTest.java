package model;
import static org.junit.Assert.*;
import org.junit.Test;

public class EmptySoilTest{
	@Test
	public void checkItemEmptySoilTest(){
		EmptySoil empty = new EmptySoil;
		Hay hay = new Hay();
		Seeds seed = new Seeds();
		Compost comp = new Compost();
		Trashbag trashb = new Trashbag();
		boolean trashCheck = empty.checkItem(trashb);
		boolean hayCheck = empty.checkItem(hay);
		boolean compCheck = empty.checkItem(comp);
		boolean seedCheck = empty.checkItem(seed);
        assertEquals("Empty soil should only accept seeds and checkItem should return true", true, seedCheck);
        assertEquals("Empty Soil can't accept trashbags, should return false", false, trashCheck);
        assertEquals("Empty Soil can't accept hay, should return false", false, hayCheck);
        assertEquals("Empty Soil can't accept compost, should return flase", false, compCheck);
    }
}