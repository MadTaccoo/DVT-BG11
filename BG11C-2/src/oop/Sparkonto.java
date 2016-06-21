package oop;

public class Sparkonto {
	
	double guthaben;
	int nr;
	String inhaber;
	
	public Sparkonto(int nr, String inhaber) {
		this.nr = nr;
		this.inhaber = inhaber;
	}
	
	public boolean auszahlen(double betrag) {
		if(betrag > guthaben) {
			return false;
		} else {
			guthaben -= betrag;
			return true;
		}
	}

	
	public void einzahlen(double betrag) {
		guthaben += betrag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public double getGuthaben() {
		return guthaben;
	}

	public int getNr() {
		return nr;
	}

	public String getInhaber() {
		return inhaber;
	}
}
