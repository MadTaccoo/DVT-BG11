package verzweigung;

import Tools.IOTools;

public class Geburtstag {

	public static void main(String[] args) {
		int day, month, year, y1, y2, h1, h2, h3, b, f;
		final String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday",
								"Thursday", "Friday"," Saturday"};
		
		day = IOTools.readInteger("Day: ");
		month = IOTools.readInteger("Month: ");
		year = IOTools.readInteger("Year: ");
		
		if(month < 3) {
			month += 10;
			year -= 1;
		} else {
			month -= 2;
		}
		
		y1 = year / 100;
		y2 = year % 100;
		
		h1 = ((month * 13)-1)/5;
		h2 = y2 / 4;
		h3 = y1 / 4;
		
		b = h1 + h2 + h3;
		f = (b + y2 + day - 2 * y1) % 7;
		
		if(f > days.length || f < 0) {
			System.out.println("The date was invalid");
		} else {
            System.out.println(days[f]);
		}
	}

}
