package oop;

public class Bruch {
	int p, q;
	
	public Bruch() {
	}

	public Bruch(int p, int q) {
		if(q == 0) {
			q = 1;
		}
		
		this.p = p;
		this.q = q;
	}
	
	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		this.q = q;
	}

	public double toDecimal() {
		return (double)p / (double)q;
	}
	
	public String toString() {
		return "" + p + "/" + q;
	}
	
	public Bruch kuerzen() {
		int div = gcd();
		return new Bruch(p / div, q / div);
	}
	
	public Bruch erweitern(int a) {
		return new Bruch(p * a, q * a);
	}
	
	public int gcd() {
		int cp = p;
		int cq = q;

		while(cq != 0) {
			cp = cq;
			cq = cp % cq;
		}
		
		return cp;
	}
	
	public static int kgv(int cp, int cq) {
		int u = cp;
		int v = cq;
			
		while(u != v) {
			if(u > v) {
				v += cq;
			} else {
				u += cp;
			}
		}
		
		return v;
	}

	public Bruch addieren(Bruch a) {
		int kgv = Bruch.kgv(this.q, a.q);
		int z1 = this.p * kgv / this.q;
		int z2 = a.p * kgv / a.q;
		return new Bruch(z1 + z2, kgv);
	}
 	
	public Bruch subtrahieren(Bruch a) {
        int kgv = Bruch.kgv(this.q, a.q);
		int z1 = this.p * kgv / this.q;
		int z2 = a.p * kgv / a.q;
		return new Bruch(z1 - z2, kgv);
	}
	
	public Bruch multiplizieren(Bruch a) {
        return new Bruch(p*a.p, q * a.q);
	}
	
	public Bruch dividieren(Bruch a) {
        return new Bruch(p*a.q, q * a.p);
	}
	
	public Bruch negativ() {
		return new Bruch(-p, -q);
	}
	
	public static void main(String[] args) {
		Bruch b = new Bruch(3, 4);
		Bruch c = new Bruch(2, 3);
		
		System.out.println(b.subtrahieren(c));
	}
}
