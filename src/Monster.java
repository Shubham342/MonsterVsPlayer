
public class Monster {
	private String name;
	private int speed;
	private int power;
	private int life;
	private String type;
	
	public Monster(String name, int speed,int power, int life, String type)
	{
		this.name = name;
		this.speed = speed;
		this.power = power;
		this.life = life;
		this.type = type;
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
	public String getType() {
		return type;
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
	public void setType(String type) {
		this.type = type;
	}
}
