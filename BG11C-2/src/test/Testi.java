package test;

import Tools.IOTools;

public class Testi {

	public static void main(String[] args) {
		double kapital, zinssatz, endkapital;
		
		kapital = IOTools.readDouble("Kapital: ");
		zinssatz = IOTools.readDouble("Zinssatz: ");
		endkapital = IOTools.readDouble("Endkapital: ");
		
		for(int jahr = 0; kapital < endkapital; jahr++)
		{
			kapital += kapital * zinssatz / 100.0;
			
			System.out.println("Jahr: " + jahr);
			System.out.println("Kapital: " + kapital);
		}
	}

}
