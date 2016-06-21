package lineareprogramme;

import Tools.IOTools;

public class Parteistimmen {
	
	/**
	 * Nach Eingabe der abgegebenen Stimmen fuer vier Parteien und der
	 * ungueltigen Stimmen sollen die Ergebnisse in Prozent ausgegeben
	 * werden.
	 * @param args
	 */
	public static void main(String[] args) {
		int cdu, spd, fdp, npd, ungueltig;
		int total;
		
		cdu = IOTools.readInteger("CDU: ");
		spd = IOTools.readInteger("SPD: ");
		fdp = IOTools.readInteger("FDP: ");
		npd = IOTools.readInteger("NPD: ");
		ungueltig = IOTools.readInteger("Ungueltig: ");
		
		total = cdu + spd + fdp + npd + ungueltig;
		
		System.out.println(String.format("CDU: %f%%", ((double)cdu / (double)total * 100.0)));
		System.out.println(String.format("SPD: %f%%", ((double)spd / (double)total * 100.0)));
		System.out.println(String.format("FDP: %f%%", ((double)fdp / (double)total * 100.0)));
		System.out.println(String.format("NPD: %f%%", ((double)npd / (double)total * 100.0)));
		System.out.println(String.format("Ungueltig: %f%%", ((double)ungueltig / (double)total * 100.0)));
	}
}