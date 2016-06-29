package test;

import Tools.IOTools;

public class Schieben {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
        int dir = IOTools.readInteger("Dir: ");
        
        for(int i = 0; i < arr.length; i ++) {
        	System.out.print(arr[i] + " ");
		}
		
		if(dir == 0) {
			// links
            int tmp = arr[0];
            for(int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length - 1] = tmp;
		} else if(dir == 1) {
			// rechts
			int tmp = arr[arr.length-1];
            for(int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i-1];
            }
            arr[0] = tmp;
		}
		
		System.out.println("\nWird zu: ");

        for(int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i] + " ");
		}
	}

}
