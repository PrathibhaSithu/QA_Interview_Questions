package jBegin;

public class ReverseInteger {

	public static void main(String[] args) {
		int num = 123456;
		int rev = 0;
		
		// using proper algo
		while(num !=0) {
			rev = rev*10 + num%10;
			//System.out.println(rev);
			num = num/10;
			//System.out.println(num);
		}
		System.out.println("Reverse Numbers Are :: " + rev);
		
		// using string buffer reverse method
		int strRev = 4789556;
		System.out.println(new StringBuffer(String.valueOf(strRev)).reverse());

	}

}
