package academy.learnprogramming;

public class PositiveNegativeZero {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkNumber(5);
		checkNumber(0);
		checkNumber(-20);
		checkNumber(7);




	}
	
	public static void checkNumber(int number) {
		
		if (number > 0) {
			
			System.out.println("positive");
		}
		
		else if (number < 0)
		{
			System.out.println("negative");
		}
		
		else {
			
			System.out.println("zero");
		}
		
		
	}


}
