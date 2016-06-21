package test;

import java.io.*;

import Tools.IOTools;

public class DateiLesenSchreiben {

	public static void main(String[] args) throws IOException {
		// Datei lesen, wenn sie existiert
        File f = new File("datei.txt");
        if(f.exists() && !f.isDirectory()) { 
            BufferedReader br = new BufferedReader(new FileReader("datei.txt"));
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println("In der Datei: " + sCurrentLine);
            }
        }
        
		String zuSpeichern = IOTools.readString("Schreiben: ");

		// Datei speichern
        PrintWriter writer = new PrintWriter("datei.txt", "UTF-8");
        writer.println(zuSpeichern);
        writer.close();
    }

}
