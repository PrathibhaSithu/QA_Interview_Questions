package jBegin;

public class StringManipulation {

	public static void main(String[] args) {
		String str = "The Quick Brown Fox Jump Over The Lazy Dog";
		String str1 = "The Quick Brown Fox Jump Over the Lazy Dog";
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("T"));
		System.out.println(str.indexOf("T",5));
		System.out.println(str.indexOf("J")+1);
		System.out.println(str.indexOf("Fox"));
		
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.substring(0, 8));
	}

}
