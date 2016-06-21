package test;

import Tools.IOTools;

public class Test2 {

	public static void main(String[] args) {
        double kapital, zinssatz, endkapital;
        double n;
		
		kapital = IOTools.readDouble("Kapital: ");
		zinssatz = IOTools.readDouble("Zinssatz: ");
		endkapital = IOTools.readDouble("Endkapital: ");
		
		n = Math.pow(endkapital / kapital, 1.0 / zinssatz / 100.0);
		System.out.println(n);
	}

}
