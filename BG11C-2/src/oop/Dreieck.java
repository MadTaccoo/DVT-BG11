package oop;

public class Dreieck {
	
	public double a, b, c, height;
	public double alpha, beta, gamma;
	
	public double getArea() {
		return height * b / 2.0;
	}
	
	void calculateAngles() {
		gamma = Math.acos((c*c - (a*a+b*b))/(-2.0 * a * b));
		beta = Math.asin(Math.sin(gamma)*b/c);
		alpha = Math.asin(Math.sin(gamma)*a/c);
		
		height = c / Math.sin(alpha);
	}
	
	public Dreieck(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		calculateAngles();
	}
	
	public double getUmfang() {
		return a + b + c;
	}
	
	public boolean isTriangle() {
		return (a+b>c) && (a+c>b) && (b+c>a);
	}

	public static void main(String[] args) {
		Dreieck d1 = new Dreieck(3.0f, 4.0f, 6.0f);
		System.out.println(d1.isTriangle());
		System.out.println(d1.alpha / Math.PI * 180.0);
		System.out.println(d1.beta / Math.PI * 180.0);
		System.out.println(d1.gamma / Math.PI * 180.0);
		System.out.println(d1.getArea());
	}
}
