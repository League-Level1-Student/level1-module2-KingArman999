package _04_tea_maker;

import javax.swing.JOptionPane;

public class TeaMakerRunner {
public static void main(String[] args) {
	String f= JOptionPane.showInputDialog("What flavor of tea do you want? Options: Green, Mint, Chamomile, Passion Fruit");
	TeaBag b = new TeaBag(f);
	Kettle k = new Kettle();
	Cup c = new Cup();
	k.getWater();
	k.boil();
	c.makeTea(b, k.getWater());
}
}
