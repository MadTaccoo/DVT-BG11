package test;

public class Temperatures {
	
	public static void populateData(int[] data) {
		int min = 20, max = -20, avg = 0;
		for(int i = 0; i < 7; i++) {
			int temp = (int)(Math.random()*40.0-20.0);
			data[i] = temp;
			
			if(temp > max)
				max = temp;
			
			if(min > temp)
				min = temp;
			
			avg += temp;
		}
		
		avg /= 7;
		
		data[7] = max;
		data[8] = min;
		data[9] = avg;
	}

	public static void main(String[] args) {
		int[][] data = new int[4][10];
		
		for(int i = 0; i < 4; i++)
            populateData(data[i]);
		
		String[] cities = {"MR", "KS", "FR", "GI"};
		
		System.out.println("Stadt\tTag1\tTag2\tTag3\tTag4\tTag5\tTag6\tTag7\tmax\tmin\tavg");
		for(int i = 0; i < data.length; i++) {
			System.out.print(cities[i]+"\t");
			for(int j = 0; j < data[i].length; j++)
				System.out.print(data[i][j]+"\t");
            System.out.print("\n");
		}
		
		int totalMax = (data[0][7] + data[1][7] + data[2][7] + data[3][7]) / 4;
		int totalMin = (data[0][8] + data[1][8] + data[2][8] + data[3][8]) / 4;
		int totalAvg = (data[0][9] + data[1][9] + data[2][9] + data[3][9]) / 4;
		
		System.out.println("TotalMax: " + totalMax);
		System.out.println("TotalMin: " + totalMin);
		System.out.println("TotalAvg: " + totalAvg);
	}

}
