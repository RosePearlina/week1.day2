package week1.day2.assignment;

import java.util.*;
public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,6,8};
		int num=arr.length;
		Arrays.sort(arr);
		System.out.println("Sorted array");
		 for (int i = 0; i < num; i++) {
			 System.out.println("array["+i+"]:"+arr[i]);
			
		}
		 int sum = ((num+1)*(num+2))/2;
		 for (int j = 0; j < num; j++) {
			 sum=sum-arr[j];
			 
		 }

		 System.out.println("missing number is:"+sum);
		
		
	}

}
