package academy.learnprogramming;

public class Main {
	
	public static void main(String[] args) {
		double miles = SpeedConverter.toMilesPerHour(50.35);// 1st type name of class, second type method name
		System.out.println("Miles = " + miles); //need to select option to print out.
		SpeedConverter.printConversion(50.35); //Only called method but never print out anything
		
		
	}
	

	


}
