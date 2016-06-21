package verzweigung;

import Tools.IOTools;

public class IsTriangle {

	public static void main(String[] args) {
		double a, b, c;
		
		a = IOTools.readDouble("A: ");
		b = IOTools.readDouble("B: ");
		c = IOTools.readDouble("C: ");
		
		if(b + c > a && a + b > c && a + c > b) {
			System.out.println("Yes");
		} else {
			System.out.println("Nope");
		}
	}

}
