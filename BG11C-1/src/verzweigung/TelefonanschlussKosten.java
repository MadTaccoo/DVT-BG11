package verzweigung;

import Tools.IOTools;

public class TelefonanschlussKosten {
	public static void main(String[] args) {
		final double GRUNDGEBUEHR = 13.0;
        final double TARIF = 0.10;
        final int FREIEEINHEITEN = 10;

		int einheiten;
		double telefonkosten;
		
		einheiten = IOTools.readInteger("Einheiten: ");
		
		telefonkosten = einheiten > FREIEEINHEITEN ? GRUNDGEBUEHR + TARIF * (einheiten - 10) : GRUNDGEBUEHR;
		
		System.out.println(telefonkosten);
	}
}
