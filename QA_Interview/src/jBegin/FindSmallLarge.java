package jBegin;

import java.util.Arrays;

public class FindSmallLarge {

	public static void main(String[] args) {
		int num[] = {1,-1,5,54,-89,-999,54,4848,6569};
		int largest = num[0];
		int smallest = num[0];
		
		for(int i =1; i<num.length; i++) {
			if(num[i]>largest) {
				largest = num[i];
			}
			else if(num[i]<smallest) {
				smallest = num[i];
			}
//			System.out.println("\n Given Array is : " + Arrays.toString(num));
//			System.out.println("Largest Number in the Array is : " + largest);
//			System.out.println("Smallest Number in the Array is : " + smallest);
		}
		System.out.println("\n Given Array is : " + Arrays.toString(num));
		System.out.println("Largest Number in the Array is : " + largest);
		System.out.println("Smallest Number in the Array is : " + smallest);
	}

}
