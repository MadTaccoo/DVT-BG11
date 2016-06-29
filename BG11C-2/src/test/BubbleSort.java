package test;

import java.util.Arrays;
import java.util.Date;

public class BubbleSort {

	public static void main(String[] args) {
		int array[] = new int[30000];
		int n = array.length;
		boolean sorted;
		int tmp;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*(float)n);
		}
		
		Date start = new Date();
		
		do {
			sorted = true;
			for(int i = 0; i < n - 1; i++) {
				if(array[i+1] < array[i]) {
					tmp = array[i];
					array[i] = array[i+1];
					array[i+1] = tmp;
					sorted = false;
				}
			}
			n--;
		} while(!sorted);
		
		Date end = new Date();
		long runtime = end.getTime() - start.getTime();
		
		System.out.println(Arrays.toString(array));
		
		System.out.println("Took: " + runtime + "ms");
	}

}
