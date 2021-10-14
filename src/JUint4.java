import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUint4 {
	// Test for healup is working or not
	
	Player p = new Player("Shubham", 10, 10, 100, "Ice");
	Player p1 = new Player("Sam", 10, 10, 1000, "Ice");
	@Test
	void test() {
		p1.setHealth(100);
		p1.setHealth(p.getHealth()+p1.getHealth());
		assertEquals(200, p1.getHealth());
	}

}
