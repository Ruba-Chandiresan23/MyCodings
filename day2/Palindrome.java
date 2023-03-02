package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num = 34343;
		int reversenum=0;
		int temp;
		temp=num;
		for (;num!=0;num=num/10) {
			int reminder=num%10;
			reversenum=reversenum*10+reminder;
			
			}
		System.out.println("reverse number is  " +reversenum);
	if(temp==reversenum) {
		System.out.println("The given number is Palindrome" );
	}
		
	else
		System.out.println("The given number is not palindrome");
	}

}
