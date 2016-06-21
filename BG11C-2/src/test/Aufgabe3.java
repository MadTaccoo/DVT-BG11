package test;

import Tools.IOTools;

public class Aufgabe3 {

	public static void main(String[] args) {
		int sum = 0;
		int n = 2;
		int count = 0;
		int s = IOTools.readInteger("S: ");
		
		while(sum < s)
		{
            sum += n;
			count++;
			n += 2;
		}
		
		System.out.println(count);
	}
}
