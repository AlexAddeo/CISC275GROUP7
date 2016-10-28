package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObstacleTest {

	@Test
	public void removeObstacleTest() {
		Obstacle obstacleP = new Obstacle;
		obstacleP.removeObstacle();
		assertEquals("Obstacle Pointer should be Null", null, obstacleP);
		
	}
	
	@Test
	public void damageCharTest(){
		Obstacle obstacleP = new Obstacle;
		BlueCrab b = new BlueCrab;
		BlueCrab.health = 10;
		int curr = b.health;
		obstacleP.damageChar();
        assertEquals("Health should decrease by 1", curr-1, b.health);
	}

}
