package _06_minion;

public class Minion {
		private String name; 
	private int eyes; 
	private String color; 
	private String master;
	public String getName() {
	return this.name;
	}
	public int getEyes() {
	return this.eyes;
	}
	public String getColor() {
	return this.color;
	}
	public String getMaster() {
	return this.master;
	}
	public int setEyes(int eyes) {
	return this.eyes=eyes;
	}
	public String setColor(String color) {
	return this.color=color;
	}
	public String setMaster(String master) {
	return this.master=master;
	}
	public String setName(String name) {
	return this.name=name;
	}
	Minion(String name, int eyes, String color, String master){
		this.name=name;
		this.eyes=eyes;
		this.color=color;
		this.master=master;
	}
}
