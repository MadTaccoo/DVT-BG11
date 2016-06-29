package insertion;

import java.util.Arrays;

public class InsertionTest {
	public static void main(String[] args) {
		int[] a = new int[50];
		
		for(int i = 0; i < 50; i++) {
			a[i] = (int)(Math.random()*1000.0);
		}
		
		InsertionSort s = new InsertionSort();
		s.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
