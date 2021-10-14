
public class Player {
	private String name;
	private int speed;
	private int power;
	private int life;
	private int health;
	private String weapon;
	
	// Creating Constructor for Player
	public Player(String name, int speed,int power, int life, String weapon)
	{
		this.name = name;
		this.speed = speed;
		this.power = power;
		this.life = life;
		this.setHealth(life);
		this.weapon = weapon;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSpeed() {
		return speed;
	}
	public int getPower() {
		return power;
	}
	public int getLife() {
		return life;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(health<=life) {
		this.health = health;
		}else {
			this.health=life;
		}
	}

}
