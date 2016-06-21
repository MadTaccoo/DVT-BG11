package lineareprogramme;

import Tools.Formatierung;
import Tools.IOTools;

/*
 * Bei Kenntnis einer Seite eines gleichseitigen Dreiecks soll  
 * dessen Hoehe und die Flaeche berechnet werden
 * 
 * Eingabe: Seite
 * Verarbeitung: ...
 * Ausgabe: Hoehe und Laenge
 */

public class Dreieck {

	public static void main(String[] args) {
		double seite, hoehe, flaeche;
		
		seite = IOTools.readDouble("Seite: ");

		hoehe = Math.sqrt(Math.pow(seite, 2) - Math.pow(seite / 2.0, 2));
		flaeche = seite * hoehe * 0.5;

		System.out.println("Hoehe: " + Formatierung.FloatToStrF(hoehe, 2));
		System.out.println("Flaeche: " + Formatierung.FloatToStrF(flaeche, 2));
	}

}
