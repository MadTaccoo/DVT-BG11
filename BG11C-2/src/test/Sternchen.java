package test;

import Tools.IOTools;

public class Sternchen {

	public static void main(String[] args) {
		int anzahl = IOTools.readInteger("Anzahl: ");
		
		for(int i = 0; i < anzahl; i++) {
            for(int j = 0; j < anzahl - (anzahl - i); j++) {
                System.out.print(' ');
            }
            for(int j = 0; j < (anzahl - i); j++) {
                System.out.print('x');
            }
            System.out.print('\n');
		}
	}

}
