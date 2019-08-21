package _01_getters_and_setters;

public class Person {
private String name;
private String superpower;
public String getName() {
	return this.name;
}
public String getSuperpower() {
	return this.superpower;
}
public void setName(String name) {
	this.name = name;
}
public void setSuperpower(String superpower) {
	this.superpower=superpower;
}
public String toString() {
return name + " has mad " + superpower + " skills";
}
}
