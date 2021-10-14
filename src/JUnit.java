import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnit {
	
	// Test whether player health can be set higher than player life
	Player p = new Player("Shubham", 10, 10, 10, "Ice");
	@Test
	void test() {
		p.setHealth(100);
		assertEquals(10,p.getHealth());
	}

}
