package oop;

import java.util.Arrays;

public class Polynom {
	
	double[] a;
	
	public Polynom(double[] a) {
		this.a = a;
	}
	
	public double getY(double x) {
		double y = 0.0;
		for(int i = 0; i < a.length; i++) {
			y += a[i] * Math.pow(x, a.length - i - 1);
		}
		
		return y;
	}
	
	public int getGrad() {
		return a.length - 1;
	}
	
	public double getOrdinatenAbschnitt() {
		return getY(0.0);
	}
	
	public boolean isPointOnGraph(double x, double y) {
		return getY(x) == y;
	}
	
	public double[] getRoots() {
		if(getGrad() == 1) {
			double _a = a[0];
			double b = a[1];
			
			double x = -b / _a;
			double ret[] = { x };
			return ret;
		} else if(getGrad() == 2) {
			double c = a[2];
			double b = a[1];
			double _a = a[0];
			
			double discr = b*b - 4 * _a * c;
			
			if(discr < 0) {
				return null;
			}
			
			double x1 = (-b + Math.sqrt(discr))/(2*_a);
			double x2 = (-b - Math.sqrt(discr))/(2*_a);
			
			double ret[] = {x1, x2};
			
			return ret;
		} else {
			throw new UnsupportedOperationException();
		}
	}
	
	public double[] getIntersections(Polynom p) {
		double[] ce = new double[p.getGrad() + 1];
		for(int i = 0; i < getGrad()+1; i++) {
			ce[i] = this.a[i] - p.a[i];
		}
		
		Polynom diff = new Polynom(ce);
		return diff.getRoots();
	}
	
	public String toString() {
		String ret = "";
        for(int i = 0; i < getGrad()+1; i++) {
        	ret += a[i] + "x" + "^" + (a.length-i-1);
        	if(i != getGrad()) {
                ret += " + ";
        	}
		}
        
        return ret;
	}

	public static void main(String[] args) {
		double[] ce = {1, -4.0, 1.0};
		double[] ce2 = {-1.0, 2.0, 1.0};
		Polynom pol = new Polynom(ce);
		Polynom pol2 = new Polynom(ce2);
		System.out.println(pol.toString());
		System.out.println(pol.getOrdinatenAbschnitt());
		System.out.println(Arrays.toString(pol.getRoots()));
		System.out.println(Arrays.toString(pol.getIntersections(pol2)));
	}

}
