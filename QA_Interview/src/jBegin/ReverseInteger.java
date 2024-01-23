package jBegin;

public class ReverseInteger {

	public static void main(String[] args) {
		int s = 123456;
		int len = s.length();
		String rev ="";
		
		String sb = "String Buffer";
		
		// using for loop
		for(int i = len-1; i>=0; i--) {
			rev = rev + s.charAt(i);
			//System.out.println(rev);
		}
		System.out.println(rev);
		
		// using string buffer
		StringBuffer sb2 = new StringBuffer(sb);
		System.out.println(sb2.reverse());

	}

}
