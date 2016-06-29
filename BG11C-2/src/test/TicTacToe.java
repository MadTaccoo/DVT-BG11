package test;

import Tools.IOTools;

public class TicTacToe {

	public static void main(String[] args) {
		int spalte, zeile;
		char weiter;
		char[][] spielfeld = new char[3][3];
		String in;
        String[] parts;

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				spielfeld[i][j] = '~';
			}
		}
		
		do {
			// z.B. Eingabe: 0,0 (erste Zeile, erste Spalte)
			in = IOTools.readString("Spieler 1:");
            parts = in.split(",");

            spalte = Integer.parseInt(parts[0]);
            zeile = Integer.parseInt(parts[1]);
            
            spielfeld[spalte][zeile] = 'X';
            
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                	System.out.print(spielfeld[i][j]);
                }
                System.out.print("\n");
            }

            in = IOTools.readString("Spieler 2:");
            parts = in.split(",");

            spalte = Integer.parseInt(parts[0]);
            zeile = Integer.parseInt(parts[1]);
            
            spielfeld[spalte][zeile] = 'O';
            
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                	System.out.print(spielfeld[i][j]);
                }
                System.out.print("\n");
            }
            
			weiter = IOTools.readChar("Weiter: ");
		} while(weiter != 'n');
	}

}
