package verzweigung;

import Tools.IOTools;

public class GleichungssystemLoesen {

	public static void main(String[] args) {
		double a1, a2, b1, b2, c1, c2;
		double x, y;
		
		a1 = IOTools.readDouble("a1: ");
		a2 = IOTools.readDouble("a2: ");

		b1 = IOTools.readDouble("b1: ");
		b2 = IOTools.readDouble("b2: ");

		c1 = IOTools.readDouble("c1: ");
		c2 = IOTools.readDouble("c2: ");
		
		if(a1 * b2 == a2 * b1) {
			if(c1 * b2 == c1 * b1) {
				System.out.println("Unendlich viele Loesungen");
			} else {
				System.out.println("Keine Loesung");
			}
		} else {
			x = (c2 * b1 - c1 * b2) / (a2 * b1 - a1 * b2);
			y = (a2 * c1 - a1 * c2) / (a2 * b1 - a1 * b2);
			
			System.out.printf("x: %f\n", x);
			System.out.printf("y: %f\n", y);
		}
	}

}
