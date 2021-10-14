import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlayerFrame extends JFrame implements ActionListener{
	
	JTextField name;
	JTextField power;
	JTextField life;
	JTextField speed;
	JComboBox weapon;
	JButton addPlayer;
	JButton setUp;
	
	PlayerFrame(){
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	this.setLayout(new FlowLayout());
	this.setTitle("Monster Mayhem - SetUp Player");
	
	// Adding weapon List
	String[] weaponList = {"None", "Ice", "Water", "Fire"};
	
	name = new JTextField();
	power = new JTextField();
	life = new JTextField();
	speed = new JTextField();
	weapon = new JComboBox(weaponList);
	addPlayer = new JButton("Add Player");
	setUp = new JButton("Set Up Combat");
	addPlayer.addActionListener(this);
	setUp.addActionListener(this);
	
	JPanel panel1 = new JPanel(new GridLayout(5,2));
	panel1.add(new JLabel("Name"));
	panel1.add(name);
	panel1.add(new JLabel("Power"));
	panel1.add(power);
	panel1.add(new JLabel("Life"));
	panel1.add(life);
	panel1.add(new JLabel("Speed"));
	panel1.add(speed);
	panel1.add(new JLabel("Weapon"));
	panel1.add(weapon);
	
	
	JPanel panel2 = new JPanel(new GridLayout(2,2));
	
	panel2.add(addPlayer);
	panel2.add(setUp);
	
	
	this.add(panel1);
	this.add(panel2);
	
	this.pack();
	this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addPlayer)
		{
			int weapon2 = weapon.getSelectedIndex();
			String weapon3 = null;
			if(weapon2 == 0) {
				weapon3 = "None";
			}else if (weapon2 == 1) {
				weapon3 = "Ice";
			}else if(weapon2 == 2) {
				weapon3 = "Water";
			}else if(weapon2 == 3) {
				weapon3 = "Fire";
			}
			Player p = new Player(name.getText(), Integer.parseInt(power.getText()), Integer.parseInt(life.getText()), Integer.parseInt(speed.getText()), weapon3);
			
			PlayerList.addPlayer(p);
			this.dispose();
			PlayerList.listAllPlayers();
			new PlayerFrame();
		}
		if(e.getSource()==setUp)
		{
			this.dispose();
			new MonsterFrame();
			
		}
		
	}

}
