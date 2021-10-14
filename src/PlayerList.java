import java.util.ArrayList;



public class PlayerList {
	static ArrayList<Player> PlayerList = new ArrayList<Player>();
	
	public static void addPlayer(Player p) {
		PlayerList.add(p);
	}
	
	public static void removePlayer(Player p) {
		PlayerList.remove(p);
	}
	
	public static Player getPlayer(int i)
	{
		return PlayerList.get(i);
	}
	
	public static boolean isEmpty() {
		return PlayerList.isEmpty();
	}
	
	public static int size() {
		return PlayerList.size();
	}
	
	public static void listAllPlayers() {
		for(Player p: PlayerList)
		{
			System.out.println(p.getName());
		}
	}

	
	
}
