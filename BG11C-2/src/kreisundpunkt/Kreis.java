package kreisundpunkt;

public class Kreis {
	String bezeichnung;
	double radius;
	Punkt mittelpunkt;
	
	public Kreis() {
	}
	
	public Kreis(String bez, double r, Punkt mp) {
		this.bezeichnung = bez;
		this.radius = Math.abs(r);
		this.mittelpunkt = mp;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public Punkt getMittelpunkt() {
		return mittelpunkt;
	}
	
	public void skaliere(double faktor) {
		radius *= faktor;
	}
	
	public void verschiebe(double xDelta, double yDelta) {
		mittelpunkt.x += xDelta;
		mittelpunkt.y += yDelta;
	}
	
	public int checkPunktKreis(Punkt p) {
		double distanz = berechneStrecke(mittelpunkt, p);
		
		if(radius == distanz) { // Auf dem Kreis
			return 0;
		} else if(radius > distanz) { // Innerhalb
			return -1;
		} else { // Ausserhalb
			return 1;
		}
	}
	
	public String checkKreisKreis(Kreis k) {
		double sumrad = radius + k.radius;
		double d = berechneStrecke(mittelpunkt, k.mittelpunkt);
		double rdiff = Math.abs(radius - k.radius);
		boolean pequal = mittelpunkt.equals(k.mittelpunkt);

		// Aussen: 2 Schnittpunkte
		if((d != k.radius)&& (sumrad > d) && (d > rdiff)) {
			return "2 Schnittpunkte von aussen";
		}
		
		// Aussen: Beruehren sich einmal (summen der radien = distanz)
		if((radius + k.radius) == d) {
			return "1 Beruehrpunkt von aussen";
		}
		
		// Keine Schnittpunkte von aussen (summen der radien < distanz)
        if((radius + k.radius) < d) {
			return "Kein Schnittpunkt von aussen";
		}
        
        // Keine Schnittpunkte von aussen (summen der radien < distanz)
        if((d == k.radius)) {
			return "2 Schnittpunkte, wobi M1 auf K2 liegt";
		}
        
        // Keine Schnittpunkte von aussen (summen der radien < distanz)
        if((d < k.radius)) {
			return "2 Schnittpunkte von innen";
		}
		
		// Innen: Beruehren sich einmal (d+r1 = r2)
        if(!pequal && (d + radius) == k.radius) {
			return "1 Beruehrpunkt von innen";
		}
        
        if((sumrad > d) && !pequal) {
			return "Kein Schnittpunkt von innen";
        }
				
		if(radius != k.radius && pequal) {
			return "konzentrisch";
		}
		
		if(radius == k.radius && pequal) {
			return "identisch";
		}
		
		return "unbekannt";
	}
	
	private double berechneStrecke(Punkt p1, Punkt p2) {
		double dx = p1.x - p2.x;
		double dy = p1.y - p2.y;
		return Math.sqrt(dx*dx + dy*dy);
	}
}
