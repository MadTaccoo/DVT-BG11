package lineareprogramme;

import Tools.IOTools;

public class Rechteck {

	public static void main(String[] args) {
		double laenge, breite, hoehe;
		double volumen, flaeche;


		laenge = IOTools.readDouble("Laenge: ");
		breite = IOTools.readDouble("Breite: ");
		hoehe = IOTools.readDouble("Hoehe: ");

		
		volumen = laenge * breite * hoehe;
		flaeche = 2 * (laenge * breite + laenge * hoehe + breite * hoehe);

		System.out.println("Volumen = " + volumen);
		System.out.println("Flaeche = " + flaeche);
	}
	
}
