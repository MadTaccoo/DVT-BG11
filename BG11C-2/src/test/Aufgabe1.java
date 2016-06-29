package test;

import Tools.IOTools;

public class Aufgabe1 {

	public static void main(String[] args) {
		int laufzeit;
		double zinssatz, kapital;
		
		kapital = IOTools.readDouble("Kapital: ");
		zinssatz = IOTools.readDouble("Zinssatz: ");
		laufzeit = IOTools.readInteger("Laufzeit: ");
		
		for(int i = 1; i < laufzeit + 1; i++)
		{
			kapital *=  (zinssatz / 100 + 1);
			System.out.println(i);
			System.out.println(kapital);
		}
	}

}
