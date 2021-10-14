import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PlayerAttack extends JFrame implements ActionListener{
	JComboBox monster;
	JComboBox player;
	JButton attackMonster;
	JButton healUp;
	JButton powerUp;
	int randNum = (int)(Math.random()*PlayerList.size());
	Player p = PlayerList.getPlayer(randNum);
	public PlayerAttack() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLayout(new FlowLayout());
		this.setTitle("Monster Mayhem - Player Attck");
		JLabel label = new JLabel("Player: "+ p.getName());
			
		ArrayList<String> monsters = new ArrayList<String>();
		for(int i =0; i<MonsterList.size(); i++)
		{
			monsters.add(MonsterList.getMonster(i).getName());
		}
			
		String str[] = new String[monsters.size()];
			
		int i = 0;
	    for (String obj : monsters) {
	        str[i++] = (String)obj;
	    }
	    monster = new JComboBox(str);
	   
	    ArrayList<String> players = new ArrayList<String>();
		for(int i1 =0; i1<PlayerList.size(); i1++)
		{
			players.add(PlayerList.getPlayer(i1).getName());
		}
		
		String str1[] = new String[players.size()];
		
		int i1 = 0;
        for (String obj : players) {
            str1[i1++] = (String)obj;
        }
		player = new JComboBox(str1);
	    
	    
	    
	    JPanel panel1 = new JPanel(new GridLayout(5,2));
	    JPanel panel2 = new JPanel(new GridLayout(5,2));
		
		attackMonster = new JButton("Attack Monster");
		powerUp = new JButton("Power Up");
		powerUp.addActionListener(this);
		attackMonster.addActionListener(this);
		healUp = new JButton("Heal Up");
		healUp.addActionListener(this);
		panel1.add(label);	
		panel1.add(monster);
		panel1.add(attackMonster);
		this.add(panel1);
		
		//If player speed is greater than 1, then power up button is available
		if(p.getSpeed()>1) {
			panel2.add(powerUp);
		}
		panel2.add(player);
		panel2.add(healUp);
		this.add(panel2);
		this.pack();
		this.setVisible(true);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			// When Attack monster button is clicked
			if(e.getSource()==attackMonster)
			{
				Monster m = MonsterList.getMonster(monster.getSelectedIndex());
				p.setSpeed(p.getSpeed()-1);
				int randNum1 = (int)(Math.random()*5);
				if(randNum1==0 || randNum1==1 || randNum1==2 || randNum1 == 3) {
					m.setLife(m.getLife()-p.getPower());
					if(p.getWeapon()=="Ice" && m.getType()=="Water") {
						m.setLife(m.getLife()-p.getPower());
					}else if(p.getWeapon()=="Fire" && m.getType()=="Ice") {
						m.setLife(m.getLife()-p.getPower());
					}else if(p.getWeapon()=="Water" && m.getType()=="Fire") {
						m.setLife(m.getLife()-p.getPower());
					}
					JOptionPane.showConfirmDialog(null, "Attack Successful");
				}else {
					JOptionPane.showConfirmDialog(null,"Attck Unsuccessful");
					
				}
				
				// Checking if monster Died
				if(m.getLife() <= 0)
				{
					MonsterList.removeMonster(m);
					JOptionPane.showConfirmDialog(null, "Monster Died");
				}
				
				// Removing the player if speed is less than 1
				if(p.getSpeed()<1)
				{
					PlayerList.removePlayer(p);
				}
				randomTurn();
				
				
				
			}
			
			if(e.getSource()==powerUp) {
				int randNum1 = (int)(Math.random()*4);
				if(randNum1==0 || randNum1==1 || randNum1==2) {
					p.setHealth(p.getHealth()*2);
					p.setSpeed(p.getSpeed()/2);
					JOptionPane.showConfirmDialog(null, "Power Up Successful");
				}else {
					JOptionPane.showConfirmDialog(null, "Power Up Unsuccessful");
				}
				
				// Removing the player if speed is less than 1
				if(p.getSpeed()<1)
				{
					PlayerList.removePlayer(p);
				}
				randomTurn();
			}
			if(e.getSource()==healUp) {
				Player p1 = PlayerList.getPlayer(player.getSelectedIndex());
				p.setSpeed(p.getSpeed()-1);
				int randNum1 = (int)(Math.random()*2);
				if(randNum1==0 ) {
					p1.setHealth(p.getHealth()+p1.getHealth());
					JOptionPane.showConfirmDialog(null, "HealUp Successful");
				}else {
					JOptionPane.showConfirmDialog(null,"Heal Up Unsuccessful");
					
				}
				
				if(p.getSpeed()<1)
				{
					PlayerList.removePlayer(p);
				}
				
				randomTurn();
			}
			
		}

		private void randomTurn() {
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
