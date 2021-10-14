import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MonsterAttack extends JFrame implements ActionListener{
	
	JComboBox player;
	JButton attackPlayer;
	int randNum = (int)(Math.random()*MonsterList.size());
	
	Monster m = MonsterList.getMonster(randNum);
	
	public MonsterAttack() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLayout(new FlowLayout());
		this.setTitle("Monster Mayhem - Monster Attack");
		JLabel label = new JLabel("Monster: "+ m.getName());
		
		ArrayList<String> players = new ArrayList<String>();
		for(int i =0; i<PlayerList.size(); i++)
		{
			players.add(PlayerList.getPlayer(i).getName());
		}
		
		String str[] = new String[players.size()];
		
		int i = 0;
        for (String obj : players) {
            str[i++] = (String)obj;
        }
		player = new JComboBox(str);
		attackPlayer = new JButton("Attack Player");
		attackPlayer.addActionListener(this);
		this.add(label);
		this.add(player);
		this.add(attackPlayer);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==attackPlayer)
		{
			Player p = PlayerList.getPlayer(player.getSelectedIndex());
			m.setSpeed(m.getSpeed()-1);
			int randNum1 = (int)(Math.random()*4);
			if(randNum1==0 || randNum1==1 || randNum1==2) {
				p.setHealth(p.getHealth()-m.getPower());
				JOptionPane.showConfirmDialog(null, "Attack Successful");
			}else {
				JOptionPane.showConfirmDialog(null,"Attack Unsuccessful");
				
			}
			if(p.getHealth() <= 0)
			{
				PlayerList.removePlayer(p);
				JOptionPane.showConfirmDialog(null, "Player Died");
			}
			if(m.getSpeed()<1)
			{
				MonsterList.removeMonster(m);
			}
			
			if(PlayerList.isEmpty() || MonsterList.isEmpty()) {
				JOptionPane.showConfirmDialog(null, "Game Over");
				this.dispose();
			}else {
				this.dispose();
				int randNum2 = (int)(Math.random()*2);
				if(randNum2 == 0)
				{
					new MonsterAttack();
				}else if(randNum2 == 1)
				{
					new PlayerAttack();
				}
				
			}
			
			
			
		}
		
	}
}
