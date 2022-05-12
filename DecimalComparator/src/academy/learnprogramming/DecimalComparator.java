package academy.learnprogramming;

public class DecimalComparator {
	
//	public static boolean addEqualByThreeDecimalPlaces(double number1, double number2) {
//		
//		
//	}

	
	public static boolean hasEqualSum(int num1,int num2, int num3) 
	{
		int total_sum= num1 + num2;
		if (total_sum == num3) {
			return true;
			
		}
		
		else {
			
			return false;
		}
		

	}
	
	public static void main(String[] args) {
		hasEqualSum(1, 3, 4);
		hasEqualSum(4, 6, 8);
		hasEqualSum(7, 10, 17);
	}
	
}


