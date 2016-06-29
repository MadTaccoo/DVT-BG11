package insertion;

public class InsertionSort {
	public void sort(int[] a) {
		for(int i = 1; i < a.length; i++) {
			insert(a, i);
		}
	}
	
	private void insert(int[] a, int w) {
		while(w != 0 && (a[w] < a[w-1])) {
			tausche(a, w, w - 1);
			w--;
		}
	}
	
	private void tausche(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
