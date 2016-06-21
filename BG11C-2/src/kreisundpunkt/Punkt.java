package kreisundpunkt;

public class Punkt {
	String bezeichnung;
	double x, y;
	
	public Punkt() {
	}
	
	public Punkt(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	
	public Punkt(double xP, double yP) {
		this.x = xP;
		this.y = yP;
    }
	
	public Punkt(String bezeichnung, double xP, double yP) {
		this.bezeichnung = bezeichnung;
        this.x = xP;
		this.y = yP;
	}
	
	public String toString() {
		return String.format("%s(%2.f|%2.f)", bezeichnung, x, y);
	}
	
	public boolean equals(Punkt p) {
		return (this.x == p.x) && (this.y == p.y);
	}
}
