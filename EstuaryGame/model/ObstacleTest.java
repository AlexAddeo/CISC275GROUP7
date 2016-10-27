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

}
