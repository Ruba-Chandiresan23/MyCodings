package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class MissingNumbers {
	 
	
	public static void main(String[] args) {
	int rr[] = {1,2,3,4,7,6,8};
	Arrays.sort(rr);
	for (int i = 0; i < rr.length-1; i++) {
		
		if(rr[i+1]!=rr[i]+1){
		int	missingnum=rr[i]+1;
		
		System.out.println(missingnum);
		
	} 
		 
		
	}

		
	}
}


