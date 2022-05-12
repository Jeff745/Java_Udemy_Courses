package academy.learnprogramming;


public class SpeedConverter {
	
		public static void main(String[] args) {
				
				printConversion(25.42);
				printConversion(75.114);
				printConversion(-5.6);
				printConversion(1.5);
				
				
			}
	
	public static long toMilesPerHour(double kilometersPerHour) {
		
		if (kilometersPerHour >= 0) {
			
			long milesPerHour= Math.round(kilometersPerHour / 1.609);
			return milesPerHour;
			
		}
		
		else {
			return -1;
		}
		
			
	}
	
		public static void printConversion(double kilometersPerHour) {
		
		if (kilometersPerHour < 0) {
			
			System.out.println("Invalid Value");
		}
		
		else {
			
			long miles_per_hr= toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour + " km/h " +" = " + miles_per_hr +" mi/h ");
			
			
		}
		
		
	}

}
