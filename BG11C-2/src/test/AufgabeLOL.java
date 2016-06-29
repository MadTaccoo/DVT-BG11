package test;

import java.util.Arrays;

public class AufgabeLOL {

	public static void main(String[] args) {
		int[] arr = new int[1000];
		for(int i = 0; i < 1000; i++) {
			if(i != 0) {
				while(true)
				{
                    arr[i] = (int)(Math.random() * 50);
					boolean f = false;
					for(int j = 0; j < i; j++) {
						if(arr[i] == arr[j]) {
							f = true;
						}
					}	
					
					if(!f) {
                        break;
					}
                }
			} else {
                arr[i] = (int)(Math.random() * 50);
			}
		}
		
		Arrays.sort(arr);

		for(int i = 0; i < 5; i++) {
			System.out.print(arr[arr.length - 1 - i ] + " ");
        }
    }
}
