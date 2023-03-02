package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
	int num[]= {0,1,1,2,3,5,8,13};
	int sum = 0;
	System.out.println(num[0]);
	for (int i=0;i<num.length-1;i++) {
		sum=num[i]+num[i+1];
		System.out.println(sum);
	}
	

	}

}
