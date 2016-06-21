package palindrom;

import Tools.IOTools;

public class PalindromTest {
	public static void main(String[] args) {
		String str = IOTools.readString("String eingeben: ");
		Palindrom p = new Palindrom();
		
		if(p.isPalindrom(str.toCharArray())) {
			System.out.println("Jep.");
		} else {
			System.out.println("Nein.");
		}
	}
}
