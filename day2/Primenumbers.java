package week1.day2;

public class Primenumbers {

	public static void main(String[] args) {
		int num = 13;
		boolean flag= true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		System.out.println("Is the number prime - " + flag);
		
	}

}
