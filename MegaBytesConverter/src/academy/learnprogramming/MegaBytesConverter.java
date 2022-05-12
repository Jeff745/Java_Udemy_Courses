package academy.learnprogramming;

public class MegaBytesConverter {
	
	public static void main(String[] args) {
		
		printMegaBytesAndKiloBytes(2500);
		printMegaBytesAndKiloBytes(-2500);
		printMegaBytesAndKiloBytes(5000);

	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		
		if (kiloBytes < 0) {
			
			System.out.println("Invalid value");
		}
		
		else {
			
			int megaBytes = kiloBytes / 1024;
			int megaBytes_remainder = kiloBytes % 1024 ;
			System.out.println(kiloBytes + " KB " + " = " + megaBytes +" MB " + " and " + megaBytes_remainder + " MB " );
			
		}
		
		
		
		
	}

}
