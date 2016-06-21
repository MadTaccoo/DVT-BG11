package verzweigung;

import Tools.IOTools;

public class VertreterProvision {

	public static void main(String[] args) {
		double umsatz, provisionsSatz;
		double provision;
		
		umsatz = IOTools.readDouble("Umsatz: ");

		provisionsSatz = umsatz > 50000 ? 4.0 : umsatz >= 25000 ? 3.5 : 3.0;
		provision = umsatz * provisionsSatz / 100;

		System.out.println("Provision: " + provision);
	}

}
