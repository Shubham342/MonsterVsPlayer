import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnit2 {
	
	// Test whether player with Ice weapon do double damage to Water Monster
	Monster m = new Monster("WaterMonster", 100, 100, 100, "Water");
	Player p = new Player("Shubham", 10, 10, 10, "Ice");
	@Test
	void test() {
		if(p.getWeapon()=="Ice" && m.getType()=="Water") {
			m.setLife(m.getLife()-(p.getPower()*2));
		}
		
		assertEquals(80,m.getLife());
	}

}
