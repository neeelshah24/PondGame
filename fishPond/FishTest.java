package fishPond;

import static org.junit.Assert.*;

import org.junit.Test;

public class FishTest {

	@Test
	public void testEat() {
		Fish one = new Fish(4, 4, 10, Fish.DOWN);
		Fish two = new Fish(4, 7, 5, Fish.DOWN);
		
		one.eat(3);
		two.eat(2);
		assertTrue(one.getSize() == 13);
		assertTrue(two.getSize() == 7);
	}
	
	@Test
	public void testIsAlive() {
		Fish one = new Fish(4, 4, 10, Fish.DOWN);
		Fish two = new Fish(4, 7, 0, Fish.DOWN);
		
		assertTrue(one.isAlive());
		assertFalse(two.isAlive());
	}
	
	@Test
	public void testShrink() {
		Fish one = new Fish(4, 4, 10, Fish.DOWN);
		Fish two = new Fish(4, 7, 5, Fish.DOWN);
		
		one.shrink();
		two.shrink();
		
		assertTrue(one.getSize() == 8);
		assertTrue(two.getSize() == 3);
		
	}
	
	@Test 
	public void testFight() {
		Fish one = new Fish(4, 4, 10, Fish.DOWN);
		Fish two = new Fish(4, 7, 5, Fish.DOWN);
		Fish three = new Fish(4, 4, 9, Fish.DOWN);
		Fish four = new Fish(4, 7, 9, Fish.DOWN);
		
		one.fight(two);
		three.fight(four);
		
		assertTrue(one.getSize() == 15);
		assertTrue(three.getSize() == 18);
		assertTrue(four.getSize() == 0);
		
	}
	
	@Test
	public void testMove() {
		Fish one = new Fish(4, 4, 10, Fish.DOWN);
		Fish two = new Fish(4, 7, 5, Fish.MAX_FISH_SIZE);
		
		one.move();
	
		
		assertTrue(one.getRow() == 5);
		assertTrue(one.getCol() == 4);
		
		
	}

}
