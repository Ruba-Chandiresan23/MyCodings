package week1.day1;

public class Bike {
public void Sportsbike(){
	System.out.println("Red sportsbike");
}
public void Bikecost() {
	System.out.println("Price of my Bike "+ 36000);
	
}
public static void main(String[] args) {
	
	Car details1=new Car();
	details1.applyBreak();
	details1.soundHorn();
	Bike details=new Bike();
	details.Sportsbike();
	details.Bikecost();
}
}
