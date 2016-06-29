package arbeit;

public class GeradenTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Gerade f = new Gerade("f", "1.0", new Punkt(3.0, 5.0));
		Gerade g = new Gerade("g", "0.5", new Punkt(0.0, 0.0));
		
		Punkt ns = new Punkt(0, 0);
		ns = f.berechneSchnittpunkt(g);
		System.out.println(ns);
	}

}
