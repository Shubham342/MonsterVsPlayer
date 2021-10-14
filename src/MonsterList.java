import java.util.ArrayList;

public class MonsterList {
	static ArrayList<Monster> MonsterList = new ArrayList<Monster>();
	
	public static void addMonster(Monster p) {
		MonsterList.add(p);
	}
	
	public static int size() {
		return MonsterList.size();
	}
	
	public static boolean isEmpty()
	{
		return MonsterList.isEmpty();
	}
	
	public static Monster getMonster(int i) {
		return MonsterList.get(i);
	}
	
	public static void removeMonster(Monster p) {
		MonsterList.remove(p);
	}
	
	public static void listAllMonsters() {
		for(Monster p: MonsterList)
		{
			System.out.println(p.getName());
		}
	}

}
