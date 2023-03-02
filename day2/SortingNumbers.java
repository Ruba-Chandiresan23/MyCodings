package week1.day2;

import java.util.Arrays;

public class SortingNumbers {

	public static void main(String[] args) {
    int ruv[] ={23,45,67,32,89,22};
    Arrays.sort(ruv);
    for (int i=0;i< ruv.length-1;i= i+1) {
    	System.out.println( ruv[i] );
    	
    }
    	System.out.println("The second largest number "+ ruv[1]);
    }

	
}
