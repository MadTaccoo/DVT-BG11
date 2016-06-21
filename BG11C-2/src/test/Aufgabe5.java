package test;

import Tools.IOTools;

public class Aufgabe5 {

	public static void main(String[] args) {
		int n = 1;
		int x = IOTools.readInteger("x: ");
		
		// Nur die benoetigen Stellen berechnen
		int base = (int)(Math.log(x) / Math.log(2) + 1);

		// Auf die letzte Potenz von 2 runden, dann bw = 2^exp
		int bw = (int)Math.pow(2, (int)(Math.log(x) / Math.log(2)));
		
		System.out.println("base: " + base);
		System.out.println("bw: " + bw);

		while(n <= base) {
			if(x / bw == 1) {
				System.out.print("1");
				x -= bw;
			} else {
				System.out.print("0");
			}
			bw /= 2;
			n++;
		}
	}

}
