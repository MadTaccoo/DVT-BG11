// Copyright GIAN SASS (C) 2016 DONT STEAL MOTHERFUCKA

package test;

import java.util.Arrays;

public class SelectionSortWithMethods {
	public static void main(String[] args) {
		final int count = 10;
		int[] array = new int[count];
		fillArray(array, 1000);
		
		ausgeben(array);
		selectionSort(array);
		ausgeben(array);
	}
	
	static void selectionSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
			int min = findMinIndex(i, array);
			swap(i, min, array);
		}
	}
	
	static void ausgeben(int[] array) {
        System.out.println(Arrays.toString(array));
	}

	static void fillArray(int[] array, int max) {
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*(float)max);
		}
	}
	
	static void swap(int i1, int i2, int[] array) {
		int tmp = array[i1];
		array[i1] = array[i2];
		array[i2] = tmp;
	}
	
	static int findMinIndex(int start, int[] array) {
		int tmp = array[start];
		int j = start;
		for(int i = start; i < array.length; i++) {
			if(tmp > array[i]) {
				tmp = array[i];
				j = i;
			}
		}
		return j;
	}
}
