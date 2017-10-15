package fishPond;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModelTest {

	

	@Test
	public void testIsSpaceAvailableSimple() {
	    Model m = new Model(10,10,0,0,0);   // 10 by 10 pond with no obstacles, no fish, no plants
	    Fish f = new Fish(1, 7, 100, Fish.UP);
	    Plant p = new Plant(2, 8, 100);
	    m.addFish(f);
	    m.addPlant(p);
	    assertFalse(m.isSpaceAvailable(1, 7));  // there is a fish there
	    assertFalse(m.isSpaceAvailable(2, 8));  // there is a plant there
	    assertFalse(m.isSpaceAvailable(0, 0));  // there is a rock there (on the edge of pond)
	}
	
	@Test
	public void testTurnFish() {
	    Model m = new Model(10,10,7,0,0);   // 10 by 10 pond with no obstacles, no fish, no plants
	    Fish f = new Fish(1, 7, 100, Fish.UP);
	    Plant p = new Plant(2, 8, 100);
	    m.addFish(f);
	    m.addPlant(p);
	    
	    m.turnFish();
	    
	}
	
	@Test
	public void testAddFish() {
		boolean thrown = false;
		
	
		Model m = new Model(10,10,7,0,0); 
		Fish f = new Fish(1, 7, 100, Fish.UP);
		Fish p = new Fish(1, 7, 100, Fish.UP);
		Fish l = new Fish(2, 2, 100, Fish.UP);
		Fish r = new Fish(7, 4, 100, Fish.UP);
		
		try {
		m.addFish(f);
		m.addFish(p);
		} catch (IllegalFishPositionException e) {
			thrown = true;
			
		}
		assertTrue(thrown);
		
		m.addFish(l);
		
		
		assertTrue(m.getFish().size() == 1);
		
		
		 
		
		
	}
	
	
}
