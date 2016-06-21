package verzweigung;

import Tools.IOTools;

public class Rechtwinklig {
    /*
	 * Der Computer soll feststellen, ob ein gegebenes Dreieck rechtwinklig ist
	 */
	public static void main(String[] args) {
		double a, b, c;
		
		a = IOTools.readDouble("Seite a (Kathete):");
		b = IOTools.readDouble("Seite b (Kathete):");
		c = IOTools.readDouble("Seite c (Hypotenuse):");
		
		// Testen mit dem Satz des Pythagoras
		if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
			System.out.println("Rechtwinklig");
		} else {
			System.out.println("Nicht rechtwinklig");
		}
	}
}
