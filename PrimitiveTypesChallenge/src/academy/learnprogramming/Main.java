package academy.learnprogramming;

public class Main {
	
	public static void main(String[] args) {
		
		byte byteValue=10;
		short shortValue=20;
		int intValue=50;
		
		long longTotal=50000L +10L * (byteValue + shortValue + intValue);
		System.out.println(longTotal);	
		
		short shortTotal= (byte) (1000 + 10 * (byteValue + shortValue + intValue));		System.out.println(longTotal);	
		System.out.println(shortTotal);	

	}

}
