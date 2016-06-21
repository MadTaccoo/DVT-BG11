package lineareprogramme;

import Tools.IOTools;

public class Zeit {

	public static void main(String[] args) {
		int eingabe;
		int minuten, stunden, sekunden;
		
		eingabe = IOTools.readInteger("Sekunden fuer Umrechnung eingeben: ");
	
		// 1 Stunde pro 3600 Sekunden
		stunden  = eingabe / 3600;
		
		// 1 Minute pro alle nicht durch 3600 teilbare Werte geteilt durch 60
		minuten  = eingabe % 3600 / 60;
		
		// 1 Sekunde fuer alle nicht durch 60 teilbare werte
		sekunden = eingabe % 60;
		
		System.out.println(stunden + " Stunden, " + minuten + " Minuten, " + sekunden + " Sekunden");
	}

}
