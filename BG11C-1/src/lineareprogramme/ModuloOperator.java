package lineareprogramme;

import Tools.IOTools;

public class ModuloOperator {

	public static void main(String[] args) {
		int z1, z2;
		int ergebnis, rest;

		z1 = IOTools.readInteger("z1: ");
		z2 = IOTools.readInteger("z2: ");
		
		ergebnis = z1 / z2;
		rest = z1 % z2;
		
		System.out.println(z1 + " geteilt durch " + z2 + " ergibt " + ergebnis + " Rest " + rest);
	}

}
