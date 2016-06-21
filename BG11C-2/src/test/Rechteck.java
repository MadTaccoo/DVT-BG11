package test;

public class Rechteck {

	public static void main(String[] args) {
	}

	public static int berechneFlaeche(int a, int b) {
		return a * b;
	}
	
	public static int berechneUmfang(int a, int b) {
		return 2*a + 2*b;
	}

    public static double berechneDiagonale(int a, int b) {
    	return Math.sqrt(a*a + b*b);
	}

}
