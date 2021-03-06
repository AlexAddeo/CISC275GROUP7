package model;
import static org.junit.Assert.*;
import org.junit.Test;

public class ChemicalsTest{
	@Test
	public void checkItemChemicalsTest){
		Chemicals waste = new Chemicals();
		Hay hay = new Hay();
		Seeds seed = new Seeds();
		Compost comp = new Compost();
		Trashbag trashb = new Trashbag();
		boolean trashCheck = waste.checkItem(trashb);
		boolean hayCheck = waste.checkItem(hay);
		boolean compCheck = waste.checkItem(comp);
		boolean seedCheck = waste.checkItem(seed);
        assertEquals("Chemicals should only accept hay and checkItem should return true", true, hayCheck);
        assertEquals("Chemicals can't accept trashbags, should return false", false, trashCheck);
        assertEquals("Chemicals can't accept hay, should return false", false, hayCheck);
        assertEquals("Chemicals can't accept seeds, should return false", false, seedCheck);
	}
}
