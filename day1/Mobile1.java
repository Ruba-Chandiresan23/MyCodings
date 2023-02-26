package week1.day1;

public class Mobile1 {
public void makeCall() {
	String mobileModel="Apple";
	float mobileWeight= 35.2f;
	System.out.println("My mobile model is "+ mobileModel);
	System.out.println("My mobileWeight is " +mobileWeight);
				
}
public void sendMsg() {
	boolean fullCharged= true;
	int mobileCost= 500000;
	System.out.println("Is my mobile fullcharged - " + fullCharged);
	System.out.println("My mobile cost - " + mobileCost);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile1 Information=new Mobile1();
Information.makeCall();
Information.sendMsg();
System.out.println("This is my Mobile");


	}

}
