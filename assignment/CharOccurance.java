package week1.day2.assignment;

public class CharOccurance {

	public static void main(String[] args) {
		String str= "welcome to chennai";
		int count[]=new int[256];
		
		for (int i = 0; i < str.length(); i++) {
			count[(int)str.charAt(i)]++;
		}
		for (int i = 0; i < 256; i++) {
			if (count[i]!=0) {
				System.out.println((char)i+"-->"+count[i]);
			}
		}
	}

}
