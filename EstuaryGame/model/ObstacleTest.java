package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObstacleTest {

	@Test
	public void removeObstacleTest() {
		Obstacle obstacleP = this;
		removeObstacle();
		assertEquals("Obstacle Pointer should be Null", null, obstacleP);
		
	}
	
	@Test
	public void damageCharTest(){
		int health = this.health;
		damageChar();
        assertEquals("Health should decrease by 1", health-1, this.health);
	}
	
	@Test
	public void checkItemPeopleTest){
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

	@Test
	public void checkItemDeadSoilTest){
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

	@Test
	public void checkItemRunoffTest){
		Runoff waste = new Runoff();
		Hay hay = new Hay();
		Seeds seed = new Seeds();
		Compost comp = new Compost();
		Trashbag trashb = new Trashbag();
		boolean trashCheck = waste.checkItem(trashb);
		boolean hayCheck = waste.checkItem(hay);
		boolean compCheck = waste.checkItem(comp);
		boolean seedCheck = waste.checkItem(seed);
        assertEquals("Runoff should only accept hay and checkItem should return true", true, hayCheck);
        assertEquals("Runoff can't accept trashbags, should return false", false, trashCheck);
        assertEquals("Runoff can't accept hay, should return false", false, hayCheck);
        assertEquals("Runoff can't accept seeds, should return false", false, seedCheck);
	}

	@Test
	public void checkItemEmptySoilTest){
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
