package test;

import Tools.IOTools;

public class Aufgabe4 {

    static boolean isOdd(int n)
	{
		return n % 2 != 0;
	}

	public static void main(String[] args) {
		int num = IOTools.readInteger("num: ");

		while(num != 1) {
			if(isOdd(num)) {
				num *= 3;
				num += 1;
			} else {
				num /= 2;
			}

			System.out.println(num);
		}
	}

}
