package kreisundpunkt;

public class KreisTest {

	public static void main(String[] args) {
		Kreis k1 = new Kreis("K1", 3.0, new Punkt("M1", 7.0, 1.0));
		Kreis k2 = new Kreis("K2", 5.0, new Punkt("M2", 2.0, 1.0));
		System.out.println(k1.checkKreisKreis(k2));
	}

}
