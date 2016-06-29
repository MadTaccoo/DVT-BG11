package test;

import Tools.IOTools;

public class Aufgabe2 {

	public static void main(String[] args) {
		int n = IOTools.readInteger("n: ");
		int sum = 0;
		int odd = 1;
		
		while(odd < n) {
			sum += odd;
			odd += 2;
		}
				
		System.out.println(sum);
	}

}
