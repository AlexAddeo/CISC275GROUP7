package model;
import static org.junit.Assert.*;
import org.junit.Test;

public class PeopleTest{
	@Test
	public void checkItemPeopleTest(){
		People group = new People();
		Trashbag trashb = new Trashbag();
		Hay hay = new Hay();
		Compost comp = new Compost();
		Seeds seed = new Seeds();
		boolean trashCheck = group.checkItem(trashb);
		boolean hayCheck = group.checkItem(hay);
		boolean compCheck = group.checkItem(comp);
		boolean seedCheck = group.checkItem(seed);
        assertEquals("People should only accept trashbags and checkItem should return true", true, trashCheck);
        assertEquals("People can't accept hay, should return false", false, hayCheck);
        assertEquals("People can't accept compost, should return false", false, compCheck);
		assertEquals("People can't accept seeds, should return false", false, seedCheck);
	}

}