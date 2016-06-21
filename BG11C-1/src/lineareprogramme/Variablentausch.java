package lineareprogramme;

import Tools.IOTools;

public class Variablentausch {

	public static void main(String[] args) {
		int x, y;
		
		x = IOTools.readInteger("X: ");
		y = IOTools.readInteger("Y: ");
		
		y += x;
		x = y - x;
		y -= x;
		
		System.out.println("Vertauschte Werte:");
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
	}

}
