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
	 }else if(isKnighted) {
	hello += "Sir ";
	
	 } else{
		hello += "Mr. ";
	 }
	 hello += name;
 return hello;
	}
}

