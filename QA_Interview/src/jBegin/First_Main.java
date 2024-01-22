package jBegin;

public class First_Main {

	public static void main(String[] args) {
		String s = "Selenium";
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
