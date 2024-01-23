package jBegin;

public class MissingNumbers {

	public static void main(String[] args) {
		int a[] = {1,2,3,5,6};
		int sum = 0;
		
		for(int i = 0; i<a.length; i++) {
			sum = sum+a[i];
			//System.out.println(sum);
		}
		System.out.println("Sum of the given ints in the array :: " + sum);
		
		int sum1 = 0;
		for(int j=1; j<=6; j++) {
			sum1 = sum1+j;
			//System.out.println(sum1);
		}
		System.out.println("Sum with the missing Number :: " + sum1);

		int miss = sum1-sum;
		
		System.out.println("Missing Value is :: " + miss);
	}

}
