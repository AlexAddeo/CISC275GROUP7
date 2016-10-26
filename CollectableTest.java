package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CollectableTest {

	@Test
	public void removeCollectableTest() {
		CollectableObjcet collectableP = this;
		this.removeCollectable();
		assertEquals("Collectable Pointer should be null when removed", null, collectableP);
	}

	@Test
	public void UseCollectableTest() {
		CollectableObjcet collectableP = this;
		this.useObject();
		assertEquals("Collectable Pointer should be null when used", null, collectableP);
		
	}
}