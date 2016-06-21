package verzweigung;
import Tools.IOTools;
public class Teilbarkeit {
	public static void main(String[] args) {
		System.out.println((IOTools.readLong("A: ") % IOTools.readLong("B: ") == 0) ? "Teilbar" : "Nicht Teilbar");
    }
}