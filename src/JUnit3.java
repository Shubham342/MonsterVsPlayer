import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnit3 {
	
	// Test whether Monster damage to player is working
	Monster m = new Monster("WaterMonster", 100, 100, 100, "Water");
	Player p = new Player("Shubham", 10, 10, 1000, "Ice");
	@Test
	void test() {
		p.setHealth(p.getHealth()-m.getPower());
		
		assertEquals(900,p.getHealth());
	}

}
