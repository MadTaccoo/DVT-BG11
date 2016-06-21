package verzweigung;

import Tools.IOTools;

public class Dreiecke {
    static boolean isRightTriangle(int a, int b, int c) {
		return (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2));
	}
	
	public static void main(String[] args) {
        int max = IOTools.readInteger("Max: ");
        int found = 0;

		for(int a = 1; a < max; a++) {
            for(int b = 1; b < max; b++) {
                for(int c = 1; c < max; c++) {
                	if(isRightTriangle(a, b, c)) {
                		System.out.printf("(%d, %d, %d)\n", a, b, c);
                		found++;
                	}
                }
            }
		}
		
		System.out.printf("Found %d in %d^3", found, max);
	}
}
