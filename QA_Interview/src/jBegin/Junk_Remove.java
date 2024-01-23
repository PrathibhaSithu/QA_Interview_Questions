package jBegin;

public class Junk_Remove {

	public static void main(String[] args) {
		
		String rmv = "देखने के लिए धन्यवाद 感谢您观看 1234567890 Hello World";
		
		// Regular Expression [a-z A-Z 0-9]
		rmv = rmv.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(rmv);

	}

}
