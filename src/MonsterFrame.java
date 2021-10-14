import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MonsterFrame extends JFrame implements ActionListener{
	JComboBox monster;
	JButton addMonster;
	JButton setUp;
	
	MonsterFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLayout(new FlowLayout());
		this.setTitle("Monster Mayhem - SetUp Monster");
		
		String[] monster1 = {"WaterMonster", "IceMonster", "FireMonster"};
		monster = new JComboBox(monster1);
		
		addMonster = new JButton("Add Monster");
		setUp = new JButton("Set Up Combat");
		addMonster.addActionListener(this);
		setUp.addActionListener(this);
		
		JPanel panel1 = new JPanel(new GridLayout(5,2));
		panel1.add(new JLabel("Monster"));
		panel1.add(monster);
		
		JPanel panel2 = new JPanel(new GridLayout(2,2));
		
		panel2.add(addMonster);
		panel2.add(setUp);
		
		this.add(panel1);
		this.add(panel2);
		
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addMonster)
		{
			int monster2 = monster.getSelectedIndex();
			
			if(monster2 == 0) {
				Monster WaterMonster = new Monster("WaterMonster", 3, 10, 10, "Water");
				MonsterList.addMonster(WaterMonster);
			}else if (monster2 == 1) {
				Monster IceMonster = new Monster("IceMonster", 3, 10, 10, "Ice");
				MonsterList.addMonster(IceMonster);
			}else if(monster2 == 2) {
				Monster FireMonster = new Monster("FireMonster", 3, 10, 10, "Fire");
				MonsterList.addMonster(FireMonster);
			}
			
			this.dispose();
			MonsterList.listAllMonsters();
			new MonsterFrame();
		}
		if(e.getSource()==setUp)
		{
			this.dispose();
			int randNum = (int)(Math.random()*2);
			if(randNum == 0)
			{
				new MonsterAttack();
			}else if(randNum == 1)
			{
				new PlayerAttack();
			}
			
			
		}
		
	}

}
