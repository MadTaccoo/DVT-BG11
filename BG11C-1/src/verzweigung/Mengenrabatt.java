package verzweigung;

import Tools.IOTools;

public class Mengenrabatt {

	public static final void main(String[] args) {
		double preisProStueck, menge, geschaeftsbeziehung, wert, rabatt, netto, mwst, brutto;
		
		// Eingabe
		preisProStueck = IOTools.readDouble("Preis pro Stueck: ");
		menge = IOTools.readDouble("Menge: ");
		geschaeftsbeziehung = IOTools.readDouble("Geschaeftsbeziehung: ");
		
		// Verarbeitung
		if(menge <= 500) {
			rabatt = 2.0;
		} else if(menge <= 1000) {
			rabatt = 5.0;
		} else if(geschaeftsbeziehung > 10) {
			rabatt = 15.0;
		} else {
			rabatt = 10.0;
		}
		
		wert = preisProStueck * menge;
		netto = wert * (100 - rabatt) / 100;
		brutto = netto * 1.19;
		mwst = netto * 0.19;
		
		// Ausgabe
		System.out.printf("Mengenwert: %f\n", wert);
		System.out.printf("Rabatt: %f\n", rabatt);
		System.out.printf("Netto: %f\n", netto);
		System.out.printf("Brutto: %f\n", brutto);
		System.out.printf("MwSt: %d\n", mwst);
	}
}
