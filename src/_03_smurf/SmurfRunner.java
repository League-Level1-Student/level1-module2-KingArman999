package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf s = new Smurf("Smurfette");
String b = s.isGirlOrBoy();
String n = s.getHatColor();
System.out.println(s.getName() + " I am a " + b+ ".");
System.out.println(s.getName() + " My hat color is " + n + ".");
}
}
