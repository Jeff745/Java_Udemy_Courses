package academy.learningprogramming;

public class Main {
	
	public static void main(String[] args) {
		
		int myValue = 10000;
		
		int myMinIntValue=Integer.MIN_VALUE;
		int myMaxIntValue=Integer.MAX_VALUE;
		System.out.println("Integer Minimum value = " + myMinIntValue);
		System.out.println("Integer Maximum value = " + myMaxIntValue);
		System.out.println("Busted Max value = " + (myMaxIntValue + 1) );
		System.out.println("Busted Min value = " + (myMinIntValue - 1) );

		int myMaxIntTest = 2_147_483_647;
		
		byte myMinByteValue=Byte.MIN_VALUE;
		byte myMaxByteValue=Byte.MAX_VALUE;
		System.out.println("Busted Minimum value = " + myMinByteValue );
		System.out.println("Busted Maximum value = " + myMaxByteValue );

		
		short myMinshortValue = Short.MIN_VALUE;
		short myMaxshortValue = Short.MAX_VALUE;
		System.out.println("Busted Minimum value = " + myMinshortValue );
		System.out.println("Busted Maximum value = " + myMaxshortValue );
		
		long myLongValue=100;
		long myMinlongValue = Long.MIN_VALUE;
		long myMaxlongValue = Long.MAX_VALUE;
		System.out.println("Busted Minimum value = " + myMinlongValue );
		System.out.println("Busted Maximum value = " + myMaxlongValue );
		long bigLongLiteralValue=2_147_483_647_234L;
		System.out.println(bigLongLiteralValue);
		
		short bigShortLiteralValue=32767;
		
		int myTotal=( myMinIntValue / 2);
		byte myNewByteValue = (byte)(myMinByteValue / 2);
		
		//byte myByte=234;
		
	}

}
