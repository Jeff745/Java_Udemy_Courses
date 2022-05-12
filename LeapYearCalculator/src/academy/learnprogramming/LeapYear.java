package academy.learnprogramming;

//Leap Year Conditions
//Condition 1: Must be evenly divisible by 4, 100 and 400.
//Condition 2: Must be divisible by 100 and 400.
//Condition 3: Must be divisible by 4 only.

public class LeapYear {
	
	public static void main(String[] args) {
		
		testLeapYear(1924);
		//testLeapYear(1900);
		testLeapYear(2100);
		testLeapYear(2200);
		testLeapYear(2300);
		testLeapYear(2500);
		testLeapYear(2600);


	}
	
	public static boolean isLeapYear(int year) {
		
		if (year >=1 && year<=9999) {
			
				if ((year %4 == 0 && year %100 != 0)||(year %400 == 0)) {
					
					return true;
	
						
					}
				
				else {
					
					return false;
	
				}
				
				
			}
			
		
		else {
			
			return false;

		}	
		
	}
	
public static void testLeapYear(int year) {
		
		if (year >=1 && year<=9999) {
			
				if ((year %4 == 0 && year %100 != 0)||(year %400 == 0)) {
					
					System.out.println(year +" is a leap year");	
						
					}
				
				else {
					
					System.out.println(year +" is not a leap year");	
				}
				
				
			}
			
		
		else {
			
			System.out.println(year +" is not a leap year");
		}	
	}
		
}
	
	
