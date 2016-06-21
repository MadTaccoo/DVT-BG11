package lineareprogramme;

import Tools.IOTools;

/*
 * Bei Kenntnis der Radien von Grundflaeche und Deckflaeche sowie der Hoehe
 * eines Kegelstumpfes ist dessen Volumen zu bestimmen.
 */

public class Kegelstumpf {

	public static void main(String[] args) {
		double r1, r2, hoehe;
		double volumen;

		r1 = IOTools.readDouble("r1: ");
		r2 = IOTools.readDouble("r2: ");
		hoehe = IOTools.readDouble("Hoehe: ");
		
		volumen = Math.PI / 3.0 * hoehe * (Math.pow(r1, 2) + r1 * r2 + Math.pow(r2, 2));
		volumen = Math.round(volumen * 1000.0) / 1000.0;
		
		System.out.println("Das Volumen ist: " + volumen);
	}

}
