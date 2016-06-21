package verzweigung;

import Tools.IOTools;

public class Lohnberechnung {
	
	public static void main(String[] args) {
		final int MAX_WORK_HOURS = 160;
		
		double wage;
		double wagePerHour;
		int workingHours;
		
		workingHours = IOTools.readInteger("Working hours: ");
		wagePerHour = IOTools.readDouble("Wage per hour: ");
		
		if(workingHours > MAX_WORK_HOURS) {
			wage = wagePerHour * MAX_WORK_HOURS +
			((workingHours - MAX_WORK_HOURS) * 0.5 * wagePerHour);
		} else {
			wage = wagePerHour * workingHours;
		}
		
		System.out.println("Wage: " + wage);
	}

}
