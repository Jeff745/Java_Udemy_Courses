package academy.learnprogramming;

public class Main {
	
	public static void main(String[] args) {
		
		float  myMinFloatValue = Float.MIN_VALUE;
		float  myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float minimum value = " + myMinFloatValue);
		System.out.println("Float maximum value = " + myMaxFloatValue);

		
		double  myMindoubleValue = Double.MIN_VALUE;
		double  myMaxdoubleValue = Double.MAX_VALUE;
		System.out.println("double minimum value = " + myMindoubleValue);
		System.out.println("double maximum value = " + myMaxdoubleValue);
		
		int myIntValue = 5 / 3 ;
		float myFloatValue = 5f / 3f ; //f to declare that number is float
		double myDoubleValue = 5d / 3d ; //d to declare that number is double
		System.out.println("myIntValue = " + myIntValue);
		System.out.println("myFloatValue = " + myFloatValue);
		System.out.println("myDoubleValue = " + myDoubleValue);

		
		double weight_pounds = 87.25;
		double weight_kg = weight_pounds * 0.45359237;
		System.out.println( weight_pounds + " pounds " + " in kg = " + weight_kg);

		

		
	}

}
