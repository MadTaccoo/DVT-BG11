package test;

public class Sortieren {

	public static void main(String[] args) {
		int array[] = new int[10000];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*100.0);
		}
			
		int merke, w = 0, j;
		
		long startTime = System.currentTimeMillis();
		
		while(w < array.length - 1) {
			j = w;
			for(int i = w + 1; i < array.length; i++) {
				if(array[i] < array[j]) {
					j = i;
                }
            }

			merke = array[w];
			array[w] = array[j];
			array[j] = merke;
			w++;
		}
		
		System.out.println("Duration: " + (System.currentTimeMillis() - startTime));
    }
}
