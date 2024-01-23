package jBegin;

public class Find_Duplicates {

	public static void main(String[] args) {
		String ProNames[]= {"java","C","java","javaScript","python","C"};
		
		for(int i=0; i<ProNames.length; i++){
			for(int j = i+1; j<ProNames.length; j++){
				if(ProNames[i].equals(ProNames[j])) {
					System.out.println(ProNames[i]);
				}
			}
		}
	}

}
