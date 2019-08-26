package _07_tea_party;



public class TeaParty {
	String name;
	 boolean isWoman;
	boolean isKnighted;
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
	 String hello = "Hello ";
	if (isWoman ) {
		if(isKnighted) {
			hello += "Lady ";
		}
		else {
			hello += "Ms. ";
		}
	 }else {
	hello += "Sir ";
	 }
 return hello;
	}
}

