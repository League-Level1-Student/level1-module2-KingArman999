package _02_sea_creature;

import javax.swing.JOptionPane;

public class SeaCreatureRunner {
public static void main(String[] args) {
	String c = JOptionPane.showInputDialog("SpongeBob, Patrick, or Squidward", null);
	SeaCreature s= new SeaCreature(c);
	s.getName();
	s.eat();
	s.laugh();
}
}
