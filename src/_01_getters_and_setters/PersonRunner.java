package _01_getters_and_setters;

public class PersonRunner {
public static void main(String[] args) {
	Person p= new Person();
	p.setName("Frozone");
	p.setSuperpower("freeze ray");
	System.out.println(p);
	Person e= new Person();
	e.setName("Elasti-Girl");
	e.setSuperpower("super stretch");
	System.out.println(e);
	Person g= new Person();
	g.setName("Man");
	g.setSuperpower("super strength");
	System.out.println(g);
}
}
